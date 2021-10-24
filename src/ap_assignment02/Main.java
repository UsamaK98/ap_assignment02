package ap_assignment02;

import java.util.Scanner;

public class Main {
	static String u;
	static String p;
	static FlightDetails fObj;
	static Passenger pObj;
	
	public final static void clearConsole()  {  
		try  {  
			final String os = System.getProperty("os.name");  
			if (os.contains("Windows")){  
				Runtime.getRuntime().exec("cls");  
			}  else  {  
				Runtime.getRuntime().exec("clear");  
			}  
		}  catch (final Exception e) {  
			e.printStackTrace();  
		}
	} 
	
	public static void loginMenu() {
		 
		System.out.println("\t\t********** LOGIN MENU *********\n");
		System.out.println("Username: ");
		Scanner uname= new Scanner(System.in);
		u = uname.nextLine();
		
		System.out.println("Password: ");
		Scanner pword= new Scanner(System.in);
		p = pword.nextLine();
		
	}
	
	public static void MainMenu() {
		/*
		 * scannersc while (1) { System.out.
		 * println("\t\t\t//////////// FLIGHT RESERVATION SYSTEM \\\\\\\\\\\\\\\\\\\\\n"
		 * ); System.out.println("\tPlease enter your details to proceed!\n");
		 * System.out.println("Name: ");
		 * 
		 * }
		 */		
		
		System.out.println("\t\t\t*************** MAIN MENU **************\n");
		System.out.println("\t1.View flight calendar\n");
		System.out.println("\t2.View flight calendar\n");
		System.out.println("\t1.View flight calendar\n");
		System.out.println("\t1.View flight calendar\n");
		System.out.println("\t1.View flight calendar\n");
	}
	
	public static void main(String[] args) {
		
		
	    //Loading flight schedule from file
		FileHandling myFile = new FileHandling();
		myFile.LoadFlightData ();
		
		//Showing Login Menu
		Admin myAcc = new Admin();
		
		loginMenu();
		
		while (myAcc.Login(u, p)) {
			System.out.println("Invalid Credentials, please re-enter!");
			System.out.println(myAcc.getUsername());
			System.out.println(myAcc.getPassword());
			System.out.println(u);
			System.out.println(p);
			loginMenu();
		}
		
	    //Passenger object creation
	    //Due to Aggregation Relationship, Passenger object formed outside Ticket class object.
	    pObj = new Passenger("Old Street","Mumbai","Maharashtra","Pushkar","9874563210","p.rao@gmail.com");
	
	    //Passenger object creation
	    //Due to Aggregation Relationship, Passenger object formed outside Ticket class object.
	//    Passenger p2 = new Passenger("Malabar Street" , "Kolkata","WB", "Biswa","852431790"
	 //   ,"biswap7@yahoo.com");
	   // FlightDetails.getCapacity();
	//  flight.capacity;
	
	
	    //RegularTicket object creation
	   // RegularTicket regTicket = new RegularTicket(1,"Delhi","Mumbai","29/11/20,6",
	  //          "29/11/20,10",flight,"18A",p1,false,"food,water,snacks");
	
	
	    //TouristTicket object creation
	   // TouristTicket tourTicket = new TouristTicket(2,"Delhi" , "Mumbai","29/11/20,6 ",
	   //         "29/11/20,10",flight,"18C",p2,false,"Hotel Vue,Beach Ave,Mumbai");
	
	   // System.out.println(regTicket.getPnr());
	   // System.out.println(tourTicket.getPnr());
	}
	
	
}