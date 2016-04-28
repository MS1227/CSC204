
public class Coords
{
private double x;
private double y;

public Coords() //Constructor that is passed nothing and sets x and y to 0
{
	x = 0.0;
	y = 0.0;
}

public Coords(double a, double b) //Constructor that is passed two doubles that are assigned to x and y.
{
	x = a;
	y = b;
}

public double getX() //method that is passed nothing and returns value of x.
{
	return x;
}

public double getY() //method that is passed nothing and returns value of y.
{
	return y;
}
public String toString() //To string method that is passed nothing and returns coordinates in formatted string.
{
	
	return String.format("(%5.2f, %5.2f)", x,y);
}
}