import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JFrame;

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
		
		double increment = (2*Math.PI)/numOfPoints;
		double x,y;
		
		for(int i=0; i<numOfPoints; i++)
		{
			x = radius*Math.cos(i*increment) + centerX;
			y = radius*Math.sin(i*increment) + centerY;
			points.add(new Coords(x, y));
			
		}
		
		for(int i=0; i<points.size(); i++)
			System.out.println(points.get(i));
		
		JFrame frame = new JFrame();

	      frame.setSize(800, 600);
	      frame.setTitle("Spokes in a wheel");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      Spokes component = new Spokes(lines);
	      frame.add(component);

	      frame.setVisible(true);
	
		
		

	}

}