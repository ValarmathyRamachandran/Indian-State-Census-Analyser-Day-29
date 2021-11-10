package BridgelabzGroup.IndiaCensusProgram;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class StateCensusAnalyserTest {
	StateCensusCsvRead read = new StateCensusCsvRead();
	String fileName = "IndianStateCensusData";

	 @Test
	    public void checkStateCensusCSVFile_Matches_NumberOfRecords() throws IOException, CustomException  {
	        String filePathRead = "D:\\java\\CensusProgram\\IndianStatesCensusReport.csv";

	        int count = read.readNoOfRecords(filePathRead);
			Assert.assertEquals(37, count);
	 }
	 
	 @Test
	    public void checkStateCensusCSVFile_Not_Matches_NumberOfRecords() throws IOException, CustomException  {
	        String filePathRead = "D:\\java\\CensusProgram\\IndianStatesCensusReport.csv";

	        int count = read.readNoOfRecords(filePathRead);
			Assert.assertEquals(38, count);
	 }
	 
	 @Test
	    public void checkStateCensusCSVFile_has_Delimiter_Correct_Or_Incorrect_ShouldThrowException() throws CustomException {
	        String filePathRead = "D:\\java\\CensusProgram\\IndianStatesCensusReport.csv";
	        String delimiter = ".";
	        try {
	            if(delimiter.equals(","))
	                Assert.assertTrue(read.readDelimiter(filePathRead, delimiter));
	            else
	                Assert.assertFalse(read.readDelimiter(filePathRead, delimiter));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	 }
	 
	        @Test
	        public void checkStateCensusCSVFile_has_Header_Correct_Or_Incorrect_ShouldThrowException() {
	            List<String> listName = new ArrayList<>();
	            String filePathRead = "D:\\java\\CensusProgram\\IndianStatesCensusReport.csv";
	               listName.add("S.No");
			       listName.add("State");
			       listName.add("Population");
			       listName.add("Increase");
			       listName.add("Area(Km2)");
			       listName.add("Density");
			       listName.add("Sex-Ratio");
			       listName.add("Literacy");
	            try {
	                boolean flag = read.readHeader(filePathRead, listName);
	                if(flag)
	                    Assert.assertTrue(flag);
	                else
	                    Assert.assertFalse(flag);
	            } catch (IOException | CustomException e) {
	                e.printStackTrace();
	            }
	        }
}

	 


	    
