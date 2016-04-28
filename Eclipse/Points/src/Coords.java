<<<<<<< HEAD
//this is a test
=======
/**
 * Class file that generates Cartesian coordinates for use in storing x and y values of points
 * found on a user-defined circle.
 * 
 * A default constructor sets the values of the instance variables, x and y, to 0.
 * If two doubles are passed in, another constructor stores the first number in x and the second in y.
 * 
 * 
 * @author MattSchnider
 *
 */
>>>>>>> fd13194e7d4a5ef347232a9b2cc6d0c549a11d39
public class Coords
{
	
/**
 * Value of the x variable.
 */
private double x;
/**
 * Value of the y variable. change here. yet another change.asdfasdf
 */
private double y;
/**
 * Default constructor that initializes and sets x and y both equal to 0.
 */
public Coords() //Constructor that is passed nothing and sets x and y to 0
{
	x = 0.0;
	y = 0.0;
}
/**
 * Constructor that takes passed in values and assigns them to x and y.
 * @param a Sets the value of x in the Cartesian coordinate.
 * @param b Sets the value of y in the Cartesian coordinate.
 */
public Coords(double a, double b) //Constructor that is passed two doubles that are assigned to x and y.
{
	x = a;
	y = b;
}

/**
 * Returns the current value stored in x.
 * @return the current value of x.
 */
public double getX() //method that is passed nothing and returns value of x.
{
	return x;
}
/**
 * Returns the current value stored in y.
 *
 * @return the current value of y.
 */
public double getY() //method that is passed nothing and returns value of y.
{
	return y;
}
/**
 * toString method for printing out x and y in Cartesian notation.
 * @return Formatted string to 2 decimal places.
 */
public String toString() //To string method that is passed nothing and returns coordinates in formatted string.
{
	
	return String.format("(%5.2f, %5.2f)", x,y);
}
}
