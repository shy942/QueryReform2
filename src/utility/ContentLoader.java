package utility;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ContentLoader {
	
	
	public static ArrayList<String> readContent(String inFile) {
		// save the content
		ArrayList<String> lines = new ArrayList<String>();
		try {
			BufferedReader breader = new BufferedReader(new FileReader(inFile));
			while (breader.ready()) {
				String line = breader.readLine().trim();
				if (!line.isEmpty()) {
					lines.add(line);
				}
			}
			breader.close();

		} catch (Exception exc) {
			exc.printStackTrace();

		}
		return lines;

	}

	public static String readContentSimple(String inFile) {
		// save the content
		String content = new String();
		try {
			BufferedReader breader = new BufferedReader(new FileReader(inFile));
			while (breader.ready()) {
				String line = breader.readLine().trim();
				if (!line.isEmpty()) {
					content += line + "\n";
				}
			}
			breader.close();

		} catch (Exception exc) {
			exc.printStackTrace();

		}
		return content;

	}

	public static String readContentProcessedSourceCode(String inFile){
		// save the content
				String content = new String();
				try {
					BufferedReader breader = new BufferedReader(new FileReader(inFile));
					String line = breader.readLine().trim();
					
					while (breader.ready()) {
						line = breader.readLine().trim();
						if (!line.isEmpty()) {
							content += line + "\n";
						}
					}
					breader.close();

				} catch (Exception exc) {
					exc.printStackTrace();

				}
				return content;
	}
	
	public static String returnFilePath(String inFile)
	{
		String filePath="";
		String base="F:/BigDataProject/Dataset/eclipse.platform.ui/";
		
		
		try {
			BufferedReader breader = new BufferedReader(new FileReader(inFile));
			String line = breader.readLine().trim();
			filePath=line.substring(base.length());
			breader.close();

		} catch (Exception exc) {
			exc.printStackTrace();

		}
		return filePath;
	}
	
}