package corpus.maker;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import utility.ContentWriter;
import config.StaticInfo;

public class BugExtractor {

	String xmlFileName;
	String outDir;

	public BugExtractor(String xmlFileName, int year) {
		this.xmlFileName = StaticInfo.BUGDIR + "/" + xmlFileName;
		this.outDir = StaticInfo.BUGDIR + "/" + year;
	}

	protected void extractBugReports() {
		try {

			DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory
					.newInstance();
			DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
			Document doc = docBuilder.parse(new File(this.xmlFileName));

			// normalize text representation
			doc.getDocumentElement().normalize();

			NodeList listOfBugs = doc.getElementsByTagName("bug");
			int totalBug = listOfBugs.getLength();
			System.out.println("Total Bug: " + totalBug);

			for (int i = 0; i < listOfBugs.getLength(); i++) {

				Node BugReport = listOfBugs.item(i);
				if (BugReport.getNodeType() == Node.ELEMENT_NODE) {

					String xmlcontent = new String();
					Element eElement = (Element) BugReport;
					String BugID = eElement.getElementsByTagName("bug_id")
							.item(0).getTextContent();

					String outFile = this.outDir + "/" + BugID + ".txt";

					String title = eElement.getElementsByTagName("short_desc")
							.item(0).getTextContent();
					xmlcontent += title + "\n";

					int numOfLong_desc = eElement.getElementsByTagName(
							"long_desc").getLength();
					if (numOfLong_desc > 0) {
						for (int j = 0; j < numOfLong_desc; j++) {
							String description = eElement
									.getElementsByTagName("thetext").item(j)
									.getTextContent();
							description = description.trim();
							xmlcontent += description + "\n";
						}
					}

					// now saving the bug report
					ContentWriter.writeContent(outFile, xmlcontent);
					System.out.println("Saved:" + BugID);

				}

			}

			// JOptionPane.showMessageDialog(null,
			// "The XML file successfully transferred into a text file");
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlFileName="show_bug_plat_UI_Closed_fixed_1938_1stJan2005_to_31stDec2005.xml";
		int year=2005;
		new BugExtractor(xmlFileName, year).extractBugReports();
		//This is a simple change to the fine.

	}

}
