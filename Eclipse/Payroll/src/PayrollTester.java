import java.util.Scanner;

public class PayrollTester {

	public static void main(String[] args)
	{	
		Scanner in = new Scanner(System.in);
		Payroll mattPayroll = new Payroll(35.00);
		
		System.out.print("How many hours did you fly? ");
		mattPayroll.getFlightHours(in.nextDouble());
		mattPayroll.calPayOut();
		System.out.println("You made: $" + mattPayroll.payOut );
		
		

	}

}
