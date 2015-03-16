/**
 * Author: Edward Chan
 * 
 * This program will only output lines related to a particular SnortID. In this case, the SnortID is 116:59:1.
 */

import java.io.*;

public class SnortIDFinder extends LogAnalyzer {
	public SnortIDFinder(){}

	public void analyzeLog() {
		String currentLine=null;

		try{
			BufferedReader br = new BufferedReader(new FileReader("E:\\java\\src\\netsec\\3\\snortids-log.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("partB.txt"));
			while ((currentLine = br.readLine())!= null){
				if ((currentLine.contains("116:59:1"))) {
					//System.out.println(currentLine);

					bw.write(currentLine);
					bw.newLine();
					for (int i=0; i<5; i++){
						String thisLine=null;
						thisLine = br.readLine();
						//System.out.println(thisLine);
						bw.write(thisLine);
						bw.newLine();
					}
					//System.out.println();
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