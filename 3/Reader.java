/**
 * Author: Edward Chan
 * 
 * This program reads a txt file line by line, and it also outputs the exact same content line by line in the terminal (and as "results.txt"). 
 */

import java.io.*;

public class Reader extends LogAnalyzer {
	public Reader(){}

	public void analyzeLog() {
		String currentLine=null;

		try{
			BufferedReader br = new BufferedReader(new FileReader("E:\\java\\src\\netsec\\3\\snortids-log.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("partA.txt"));
			while ((currentLine = br.readLine())!= null){
				//System.out.println(currentLine);

				bw.write(currentLine);
				bw.newLine();
				bw.flush();
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