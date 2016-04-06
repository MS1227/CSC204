
public class Dice 
{
private int sides;
private int last;

//Constructor that is passed nothing and sets sides = 6 and last = 1.
public Dice()
{
	sides = 6;
	last = 1;
	
}

//Constructor passed an int s that is passed to sides, last = 1.
public Dice(int s)
{
	sides = s;
	last = 1;
}
//Roll method that computes a random number 1-sides and stores
//this value in instance var last.
public int roll()
{
	return last = (int) (Math.random()*sides+1);
}

//Method to return the value stored in last.
public int getLastRoll()
{
	return last;
}
}
