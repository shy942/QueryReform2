package corpus.maker;

import java.io.File;

import utility.ContentLoader;
import utility.ContentWriter;
import config.StaticInfo;

public class BugReportCorpusBuilder {

	int year;
	String bugFolder;
	String bugPPFolder;
	int noOfBugReports;
	public BugReportCorpusBuilder(int year)
	{
		this.year=year;
		this.bugFolder=StaticInfo.BUGDIR+"/"+year;
		this.bugPPFolder=StaticInfo.PROCESSEDBUGREPORTS+"/"+year;
		this.noOfBugReports=noOfBugReports;
	}
	protected void createPreprocessedRepo()
	{
		File[] files=new File(bugFolder).listFiles();
		noOfBugReports=files.length;
		for(File f:files){
			String fileName=f.getName();
			String content=ContentLoader.readContentSimple(f.getAbsolutePath());
			BugReportPreprocessor bpp=new BugReportPreprocessor(content);
			String preprocessed=bpp.performNLP();
			String outFile=this.bugPPFolder+"/"+fileName;
			ContentWriter.writeContent(outFile, preprocessed);
			System.out.println("Preprocessed:"+fileName);
		}
	}
	
	protected int getNoOFSourceCodes()
	{
		return noOfBugReports;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2014;
		new BugReportCorpusBuilder(year).createPreprocessedRepo();
	}

}
