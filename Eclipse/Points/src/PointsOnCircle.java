import java.util.Scanner;

public class PointsOnCircle {

	public static void main(String[] args) {
		System.out.println("Matt Schnider's Point on a Circle Program"); //header
		System.out.println("*****************************************");
		
		//Scanner instantiated and variables to hold user data initialized.
		Scanner in = new Scanner(System.in);
		double centerX;
		double centerY;
		double radius;
		double numOfPoints;
		
		System.out.println();
		
		//Data collected from user to create a circle.
		System.out.println("Please give the x coordinate of the center of your circle: ");
		centerX = in.nextDouble();
		System.out.println("Please give the y coordinate of the center of your circle: ");
		centerY = in.nextDouble();
		System.out.println("Please give the radius of your circle: ");
		radius = in.nextDouble();
		System.out.println("How many points would you like on your circle? ");
		numOfPoints = in.nextDouble();
		

	}

}
