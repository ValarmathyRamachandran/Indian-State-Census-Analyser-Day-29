package BridgelabzGroup.IndiaCensusProgram;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StateCensusAnalyser {

		 public static void main(String[] args) throws IOException, CustomException {
			 System.out.println("------Welcome to Indian States Census Program------");
			 System.out.println("");
			 System.out.println("Please Enter Option 1 or 2 ");
		     System.out.println( "1. To Display Count or Total No. of records");
		     System.out.println("2. To Read all data from csv file ");
			 
			 String filePathRead = "D:\\java\\CensusProgram\\IndianStatesCensusReport.csv";
		        String fileName = "IndianStateCensusData";
		        String delimiter =",";
		        List<String> listName = new ArrayList<>();

			       listName.add("S.No");
			       listName.add("State");
			       listName.add("Population");
			       listName.add("Increase");
			       listName.add("Area(Km2)");
			       listName.add("Density");
			       listName.add("Sex-Ratio");
			       listName.add("Literacy");
			       
			       Scanner scan = new Scanner(System.in); 
			       int choice = scan.nextInt();
			       while(choice<=2) {
			    	   StateCensusCsvRead read = new StateCensusCsvRead();
			    	   switch(choice) {
			    	   case 1:
			    		   	int count = read.readNoOfRecords(filePathRead);
					        System.out.println(count);
					        choice = 3;//to break loop
					        read.readDelimiter(filePathRead, delimiter);
					        read.readHeader(filePathRead, listName);  
					        break;
			    	   case 2:
			    		   	read.readcsv();   		   	
			    		   	choice  = 3;
			    		   	break;
			    	default:
			    		System.out.print("Invalid Entry!");
			    		   
			    	   }
			       }      
		    }
}
