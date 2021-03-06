import java.util.Scanner;

/* 
 * Matt Schnider
 * GeoCalc - A program to read in two points and calculate some geometric values
 * Due February 3, 2016
 * 
 */
public class GeoCalc {

	public static void main(String[] args) {
		
		
		
		System.out.println("           Matt's Geometric Calculator         ");
		System.out.println("           ***************************         ");
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.print("What is the value of the X coordinate for point A? " );                            // Prompts user for X value of point A.
		double xA = in.nextDouble();                                                                         // Takes next value inputed and places it in variable xA.
		
		System.out.print("What is the value of the Y coordinate for point A? " );                            // Prompts user for Y value of point A.
		double yA = in.nextDouble();                                                                         // Takes next value inputed and places it in variable yA.
		
		System.out.print("What is the value of the X coordinate for point B? ");                             // Prompts user for X value of point B.
		double xB = in.nextDouble();                                                                         // Takes next value inputed and places it in variable xB.
		
		System.out.print("What is the value of the Y coordinate for point B? ");                             // Prompts user for Y value of point B.
		double yB = in.nextDouble();                                                                         // Takes next value inputed and places it in variable yB.
		System.out.println();
		double distance = Math.sqrt((Math.pow((xB-xA), 2))+Math.pow((yB-yA), 2));                            // Applies distance formula to inputed values.
		System.out.println("The distance between ("+xA+","+yA+")"+" and ("+xB+","+yB+")"+" is: "+distance);  // Displays the inputed values with the result of the distance formula.
		System.out.println();                                                                                // Line break.
		
		System.out.println("The rectangle with coordinates: ");                                              // Displays text in quotations.
		System.out.println("("+xA+","+yA+")"+" ("+xA+","+yB+")"+" ("+xB+","+yB+")"+" ("+xB+","+yA+")");      // Displays the coordinates of the four corners of the rectangle.
		System.out.println();                                                                                // Line break.
		double width = (Math.abs(xB-xA));                                                                    // Calculation of the width of the rectangle stored as variable "width" for use in later calculations. Absolute value prevents neg distance.
		double height = (Math.abs(yB-yA));                                                                   // Calculation of the height of the rectangle stored as variable "height" for us in later calculations. Absolute value prevents neg distance.
		System.out.println("        Has width of:     "+width);                                              // Printing of the value of the width variable.
		System.out.println("        Has height of:    "+height);                                             // Printing of the value of the height variable.
		System.out.println("        Has perimeter of: "+((2*width)+(2*height)));                             // Application of width and height variables into the perimeter formula.
		System.out.println("        Has area of:      "+(width*height));                                     // Application of the width and height variables into the area formula.
		System.out.println();                                                                                // Line break.
		
		System.out.println("The circle with points A and B at the ends of a diameter:");                     // Prints text in quotations.
		System.out.println();                                                                                // Line break.
		System.out.println("        Has its center at: ("+((xB+xA)/2)+","+((yB+yA)/2)+")");                  // Calculates coordinates of center of a circle by halving the distance between the X and Y coordinates of the inputed values.
		System.out.println("        Has a radius of:    "+(distance)/2);                                     // Calculates radius by halving the earlier results of the distance formula.
		System.out.println("        Has a diameter of:  "+distance);                                         // Diameter is equal to the result of the distance formula.
		System.out.println("        Has circumference:  "+(Math.PI*distance));                               // Calculates the circumference by multiplying Pi * diameter.
		System.out.println("        Has area:           "+(Math.PI*Math.pow(distance/2, 2)));                // Calculates area by multiplying Pi * radius(half diameter) squared.
		
		
	}

}
