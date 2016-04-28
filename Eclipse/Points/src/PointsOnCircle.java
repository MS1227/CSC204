import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;
/*
 * Main program that gathers data from the user to define a circle. Program calculates the x
 * and y coordinate values and stores them in an array list, which is then printed out.
 * 
 * By: Matt Schnider
 */

public class PointsOnCircle {

	public static void main(String[] args) {
		System.out.println("Matt Schnider's Point on a Circle Program"); //header
		System.out.println("*****************************************");
		
		//Scanner instantiated and variables to hold user data initialized.
		Scanner in = new Scanner(System.in);
		double centerX;
		double centerY;
		double radius;
		int numOfPoints;
		
		//Array List of Coords called points, initialized.
		ArrayList<Coords> points = new ArrayList<Coords>();
		
		System.out.println();
		
		//Data collected from user to create a circle.
		System.out.println("Please give the x coordinate of the center of your circle: ");
		centerX = in.nextDouble();
		System.out.println("Please give the y coordinate of the center of your circle: ");
		centerY = in.nextDouble();
		System.out.println("Please give the radius of your circle: ");
		radius = in.nextDouble();
		System.out.println("How many points would you like on your circle? ");
		numOfPoints = in.nextInt();
		
		/*Increment holds 2π divided by the number of points specified by the user.
		 *This represents the smallest angle to be used in the calculation of the 
		 *point on the circle. The variables x and y are initialized for use in calculating
		 *the points on the user-defined circle.
		 */
		double increment = (2*Math.PI)/numOfPoints;
		double x,y;
		
		/*
		 * For loop calculates the x and y values and stores these as a Coord in an Array List.
		 */
		for(int i=0; i<numOfPoints; i++)
		{
			x = radius*Math.cos(i*increment) + centerX;
			y = radius*Math.sin(i*increment) + centerY;
			points.add(new Coords(x, y));
			
		}
		//For loop prints out the values of the array list.
		for(int i=0; i<points.size(); i++)
			System.out.println(points.get(i));
		
	
	}
}
