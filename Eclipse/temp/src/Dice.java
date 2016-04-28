
/**
 * Simulates an N sided Die - and demonstrates Javadoc comments
 * 
 * This program simulates rolling a single die with N sides. The default 
 * number of sides is 6 - our normal sized die.  
 * 
 * To generate a Dice API from this file's Javadoc comments:
 * From Eclipse
 *     - Open Project/Generate Javadoc...  from the top of the screen.
 *     - Click Configure and browse to find your machines javadoc.exe file.  It might be something like: 
 *       C:\Program Files\Java\jdk1.8.0_60\bin\javadoc.exe
 *     - To show the private instance variables (and methods), check the Private box.
 *     - Click Finish, and OK, you might need to pick the destination folder.
 * 
 * @author Bob Allen
 * @version 1.0
 * @since Spring 2016
 *
 */

public class Dice {

	/**
	 * The number of sides on 'this' die.
	 */
	private int sides;
	
	/**
	 * The value of the last roll of this die.
	 * Initially set to 1.
	 */
	private int last;
	
	/**
	 * Default constructor creates a 6 sided die.
	 * 
	 * Initializes sides for this Die, and sets last to one.
	 */
	public Dice()
	{
		sides = 6;
		last = 1;
	}
	
	/**
	 * A Dice can be created with any number of sides.
	 * 
	 * No verification is done on this input number of sides.
	 * Initializes sides for this Die, and sets last to one.
	 * 
	 * @param sides  Assigns sides to this Dice object.
	 */
	public Dice(int sides)
	{
		this.sides = sides;
		last = 1;
	}
	
	/**
	 * Simulates rolling this Dice one time.
	 * 
	 * Roll selects a random value in the range of possibilities
	 * based upon the number of sides on this Dice.
	 * 
	 * @return a random int in the range of 1-sides
	 */
	public int roll()
	{
		last = (1+ (int)(Math.random()*sides));
		return last;
	}
	
	/**
	 * Returns the value generated on the previous roll()
	 * 
	 * @return the int value that was last rolled.
	 */
	public int lastRoll()
	{
		return last;
	}
}
