package ap_assignment02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
	
	File myObj;
	FileReader fr;
	Scanner myReader;
	FileWriter myWriter;
	
	public boolean CreateFile (String arg){
		try {
			myObj = new File ("E:\\AP Workspace\\ap_assignment02");
			if (myObj.createNewFile()) {
				System.out.println("[SUCCESS] File created!"); 
				return true;
			} else { 
				
				System.out.println("[ERROR] File already exits!");
				return false;
			}
		} catch (IOException e) {
			
			System.out.println("An error occured");
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean LoadFlightData () {
		// opening the streams
		try {
			fr = new FileReader ("FlightDetails.csv");
			Scanner myReader = new Scanner (fr);
			myReader.useDelimiter(",");
			//Skipping first row as it contains just the column headers
			myReader.nextLine();
			while (myReader.hasNext()) {		
				System.out.println(myReader.next());
			}
			myReader.close();
		} catch (IOException e) {
			
			System.out.println("An error occurred!");
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public void saveData(String arg, String filename) throws IOException {
		try {
			myWriter = new FileWriter (filename);
			myWriter.write(arg);
		} catch (IOException e) {
			System.out.println("An error occured!");
			e.printStackTrace();
		} finally {
			myWriter.close();
		}
	}
	
	public boolean saveFlightData(FlightDetails f) throws IOException {
		String file = "./FlightRecords.txt";
		if (this.CreateFile(file)) {
			String str = "Flight ID,Source,Destination,Date,Duration\n";
			saveData(str,file);
		} else {
			saveData(f.getFlight_Num(), file);
			saveData(",",file);
			saveData(f.getSource(), file);
			saveData(",",file);
			saveData(f.getDestination(), file);
			saveData(",",file);
			saveData(f.getFlightDate(),file);
			saveData(",",file);
			saveData(f.getFlight_Num().toString(), file);
			saveData("\n",file);
		}
		
		return true;
	}

		
}
