package utility;

import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import config.StaticInfo;

public class ContentWriter {

	public static void writeContent(String outFile, String content) {
		// save the content
		try {
			FileWriter fwriter = new FileWriter(new File(outFile));
			fwriter.write(content);
			fwriter.close();

		} catch (Exception exc) {

			exc.printStackTrace();
		}

	}
	
	
	public static void writeToFileforHashMapContent(String outfile, String additionalFileName, HashMap hm)
	{
		String content="";
		Iterator it = hm.entrySet().iterator();
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        String filePath=pair.getKey().toString();
	        String rVSMscore=pair.getValue().toString();
	        content+=filePath+","+rVSMscore+"\r\n";
	    }
	    utility.ContentWriter.writeContent(outfile+"/"+additionalFileName, content);
	}
	

}
