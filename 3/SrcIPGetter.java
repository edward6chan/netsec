/**
 * Author: Edward Chan
 * 
 * 
 */

import java.io.*;

public class SrcIPGetter extends LogAnalyzer {
	public SrcIPGetter(){}

	public void analyzeLog() {
		String currentLine=null;

		try{
			BufferedReader br = new BufferedReader(new FileReader("E:\\java\\src\\netsec\\3\\snortids-log.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("trimmedPartB.txt"));
			while ((currentLine = br.readLine())!= null){
				if ((currentLine.contains("116:59:1"))) { //at line 1
					String thisLine=null;
					String time=null;
					String srcIP=null;
					thisLine = br.readLine(); //at line 2
					thisLine = br.readLine(); //at line 3
					time = thisLine.substring(0,20);//line 3
					srcIP = thisLine.substring(22,35);//at line 3
					bw.write(time);
					bw.newLine();
					bw.write(srcIP);
					bw.newLine();
					bw.newLine();
					bw.flush();
				} else{
					//do nothing
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		/*
		BufferedReader.close();
		BufferedWriter.close();
		FileReader.close();
		FileWriter.close();
		*/
	}
}