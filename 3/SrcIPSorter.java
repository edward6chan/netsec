/**
 * Author: Edward Chan
 * 
 * 
 */

import java.io.*;
import java.util.*;

public class SrcIPSorter extends LogAnalyzer {//implements Comparable{
	public SrcIPSorter(){}

	//@Override
	//public int compareTo(IPAddress object){
		//first, write a time converter in IPAddress first
		//then we can do ascending order/descending order here
	//}

	//I actually don't have to sort the log file. It's already in ascending orders....

	public void analyzeLog() {
		String currentLine=null;
		String t=null;
		String src=null;
		List<IPAddress> ipObj = new ArrayList<IPAddress>();
		List<String> ipAt1 = new ArrayList<String>();
		List<String> ipAt2 = new ArrayList<String>();
		List<String> ipAt3 = new ArrayList<String>();
		List<String> ipAt4 = new ArrayList<String>();
		List<String> ipAt5 = new ArrayList<String>();
		List<String> ipAt6 = new ArrayList<String>();
		List<String> ipAt7 = new ArrayList<String>();
		List<String> ipAt8 = new ArrayList<String>();
		List<String> ipAt9 = new ArrayList<String>();
		List<String> ipAt10 = new ArrayList<String>();
		List<String> ipAt11 = new ArrayList<String>();
		List<String> ipAt12 = new ArrayList<String>();

		try{
			BufferedReader br = new BufferedReader(new FileReader("E:\\java\\src\\netsec\\3\\trimmedPartB.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("partC.txt"));
			while ((t=br.readLine())!= null){
				src=br.readLine();
				currentLine=br.readLine(); //skip space
				ipObj.add(new IPAddress(t,src));
			} 

			//Collections.sort(ipObj);

			//int c = 0;

			for (IPAddress i : ipObj){
				String j = i.getHour();
				//System.out.println(j);
				if (j.equals("09")){
					ipAt9.add(i.srcIP);
				}
				else if (j.equals("10")){
					ipAt10.add(i.srcIP);
				}
				else if (j.equals("11")){
					ipAt11.add(i.srcIP);
				}
				else if (j.equals("12")){
					ipAt12.add(i.srcIP);
				}
			}

			int counter=0;
			int a9=0,b9=0,a10=0,b10=0,a11=0,b11=0,a12=0,b12=0;

			for (String k : ipAt9){
				if (k.equals("192.168.2.174")) {
					a9++;
				}
				if (k.equals("192.168.2.175")) {
					b9++;
				}
				counter++;
			}

			bw.write("04-14T09 116:59:1      192.168.2.174  " + a9);
			bw.newLine();
			System.out.println("04-14T09 116:59:1" + "      " + "192.168.2.174" + "  " + a9);

			bw.write("04-14T09 116:59:1      192.168.2.175  " + b9);
			bw.newLine();
			System.out.println("04-14T09 116:59:1" + "      " + "192.168.2.175" + "  " + b9);

			for (String k : ipAt10){
				if (k.equals("192.168.2.174")) {
					a10++;
				}
				if (k.equals("192.168.2.175")) {
					b10++;
				}

				counter++;
			}

			bw.write("04-14T10 116:59:1      192.168.2.174  " + a10);
			bw.newLine();
			System.out.println("04-14T10 116:59:1" + "      " + "192.168.2.174" + "  " + a10);

			bw.write("04-14T10 116:59:1      192.168.2.175  " + b10);
			bw.newLine();
			System.out.println("04-14T10 116:59:1" + "      " + "192.168.2.175" + "  " + b10);

			for (String k : ipAt11){
				if (k.equals("192.168.2.174")) {
					a11++;
				}
				if (k.equals("192.168.2.175")) {
					b11++;
				}

				counter++;
			}

			bw.write("04-14T11 116:59:1      192.168.2.174  " + a11);
			bw.newLine();
			System.out.println("04-14T11 116:59:1" + "      " + "192.168.2.174" + "  " + a11);

			bw.write("04-14T11 116:59:1      192.168.2.175  " + b11);
			bw.newLine();
			System.out.println("04-14T11 116:59:1" + "      " + "192.168.2.175" + "  " + b11);

			for (String k : ipAt12){
				if (k.equals("192.168.2.174")) {
					a12++;
				}
				if (k.equals("192.168.2.175")) {
					b12++;
				}

				counter++;
			}

			bw.write("04-14T12 116:59:1      192.168.2.174  " + a12);
			bw.newLine();
			System.out.println("04-14T12 116:59:1" + "      " + "192.168.2.174" + "  " + a12);

			bw.write("04-14T12 116:59:1      192.168.2.175  " + b12);
			bw.newLine();
			System.out.println("04-14T12 116:59:1" + "      " + "192.168.2.175" + "  " + b12);


			//System.out.println("This long: "+ c);
			System.out.println("Total Source IP Addresses (116:59:1): "+ counter);
			bw.flush();


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