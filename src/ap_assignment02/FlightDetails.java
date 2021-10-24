package ap_assignment02;

public class FlightDetails
{
		private String Flight_Num;
		private String FlightDate;
		private String Time;
		private final int capacity;
		private int seatsAvailable;
		private String Source;
		private String Destination;
		private int flightDuration;
	
          public FlightDetails(int cap)
		{
	 	         super();
	 	         capacity=cap;
		}

     //constructor for the flightDetails class
	public FlightDetails(String fn,String fd, String t,int c, int ns,String s,String d, int dur)
	{
		this.Flight_Num = fn;
		this.FlightDate = fd;
		this.Time = t;
		this.capacity = c;
		this.seatsAvailable = ns;
		this.Source = s;
		this.Destination =d;
		this.flightDuration=dur;
	}

	public void setFlightNum(String flightNum)
	{
		this.Flight_Num = flightNum;
	}

	public void setFlightDate(String FDate)
	{	
		this.FlightDate = FDate;
	}

	public void setTime(String time)
	{
		this.Time = time;
	}

	public void setSource(String SSource)
	{
		this.Source = SSource;
	}

	public void setDestination(String Des)
	{
		this.Destination = Des;
	}

	public void booked()
	{
		this.seatsAvailable = this.seatsAvailable - 1;
	}

	public String getFlightNumber() {
		return Flight_Num;
	}

	public boolean checkAvailability() {
		if (seatsAvailable>0)
			return true;
		else
			return false;
	}

	public String getFlight_Num() {
		return Flight_Num;
	}

	public String getFlightDate() {
		return FlightDate;
	}

	public String getTime() {
		return Time;
	}

	public int getCapacity() {
		return capacity;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public String getSource() {
		return Source;
	}

	public String getDestination() {
		return Destination;
	}

	public int getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(int flightDuration) {
		this.flightDuration = flightDuration;
	}

}//end of class
