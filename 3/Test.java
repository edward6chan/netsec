/**
 * Author: Edward Chan
 * 
 *  
 */
import java.io.*;
import java.util.*;
public class Test{
	public static void main(String[] args) {

		System.out.println("If you encounter any problem, please check where you are getting the source files from. Currently, it's set to E:/java/src/netsec/3 by default. ");
		System.out.println();

		System.out.println("Printing data to partA.txt...");
		Reader part1 = new Reader();
		part1.analyzeLog();
		System.out.println("Finished. Please open partA.txt for partA answer.");
		System.out.println();
		System.out.println("Printing data to partB.txt...");
		SnortIDFinder part2 = new SnortIDFinder();
		part2.analyzeLog();
		System.out.println("Finished. Please open partB.txt for partB answer.");
		System.out.println();
		System.out.println("Printing data to partC.txt...");
		SrcIPGetter trimPart2 = new SrcIPGetter();
		trimPart2.analyzeLog();
		SrcIPSorter part3 = new SrcIPSorter();
		part3.analyzeLog();
		System.out.println("Finished. You will see partC answer above this line, or you can also open partC.txt. Thank you -Edward Chan");


		
	}
}