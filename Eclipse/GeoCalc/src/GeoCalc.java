import java.util.Scanner;

/* 
 * Matt Schnider
 * GeoCalc - A program to read in two points and calculate some geometric values
 * Due February 3, 2016
 * 
 */
public class GeoCalc {

	public static void main(String[] args) {
		
		// Print strings of characters with or without a new line at the end
		
		System.out.println("         Matt's Geometric Calculator         ");
		System.out.println("         ***************************         ");
		
		// Read in some numbers
		Scanner in = new Scanner(System.in);
		double x1;
		x1 = 123.456;
		x1 = 2; 
		System.out.print("x1: ");
		x1 = in.nextDouble();
		
		System.out.print("y1: ");
		double y1 = in.nextDouble();
		// How to use variables
		
		// How to do math
		
		// Print out our numbers inside other text
		
		System.out.println("x1 has a value of: "+x1+ " and y1 has: "+y1+".");
		
	}

}