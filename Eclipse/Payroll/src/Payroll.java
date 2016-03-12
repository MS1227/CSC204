
public class Payroll 
{

	private double hourlyRate;
	private double totalFlightHours;
	public double payOut;
	
	public Payroll()
	{
		hourlyRate = 25;
		
	}
	
	public Payroll(double payRate)
	{
		hourlyRate = payRate;
	}
	
	public void getFlightHours(double flightHours )
	{
		totalFlightHours = totalFlightHours + flightHours;
	}
	
	public void calPayOut()
	{
		payOut = totalFlightHours * hourlyRate;
	}
}
