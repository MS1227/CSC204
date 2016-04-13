//DiceSim class file by Matt Schnider
public class DiceSim 
{
//instance variables
private int sidesOfDice;
private int numOfDice;
private int numOfRolls;
private int [] countOfRolls;
private Dice[] theDice;

/*
 * Constructor that is passed nothing and sets sidesOfDice equal to 6,
 * numOfDice equal to 1 and numOfRolls equal to 100. The array, countOfRolls,
 * is set to be large enough to hold the sidesOfDice times the numOfDice plus 1.
 * An array of Dice is created that is equal to numOfDice. A for loop indexes
 * the countOfRolls array and ensures all values are equal to zero. A for loop
 * then creates a dice object that has sides equal to sidesOfDice.
 * 
 */
public DiceSim()
{
	sidesOfDice = 6;                        
	numOfDice = 1;
	numOfRolls = 100;
	countOfRolls = new int[sidesOfDice*numOfDice +1];
	theDice = new Dice [numOfDice];
		for(int i = 0; i<countOfRolls.length; i++)
		{
			countOfRolls[i] = 0;
		}
		for(int i = 0; i < numOfDice; i++)
		{
			theDice[i] = new Dice(sidesOfDice);
		}

}
/*
 * Same as first constructor except an integer is passed in, giving the user control
 * of the amount of rolls.
 */
public DiceSim(int arg1)
{
	sidesOfDice = 6;
	numOfDice = 1;
	numOfRolls = arg1;
	countOfRolls = new int[sidesOfDice*numOfDice +1];
	theDice = new Dice [numOfDice];
		for(int i = 0; i<countOfRolls.length; i++)
		{
			countOfRolls[i] = 0;
		}
		for(int i = 0; i < numOfDice; i++)
		{
			theDice[i] = new Dice(sidesOfDice);
		}
		

}
/*
 * same as previous constructors except two integers are passed in to set the amount
 * of dice and the amount of rolls.
 */
public DiceSim(int arg1, int arg2)
{
	sidesOfDice = 6;
	numOfDice = arg1;
	numOfRolls = arg2;
	countOfRolls = new int[sidesOfDice*numOfDice +1];
	theDice = new Dice [numOfDice];
		for(int i = 0; i<countOfRolls.length; i++)
		{
			countOfRolls[i] = 0;
		}
		for(int i = 0; i < numOfDice; i++)
		{
			theDice[i] = new Dice(sidesOfDice);
		}
		

}
/*
 * same as previous constructors except three integers are passed in to control
 * the size and number of the dice, as well as the amount of rolls.
 */
public DiceSim(int arg1, int arg2, int arg3)
{
	sidesOfDice = arg1;
	numOfDice = arg2;
	numOfRolls = arg3;
	countOfRolls = new int[sidesOfDice*numOfDice +1];
	theDice = new Dice [numOfDice];
		for(int i = 0; i<countOfRolls.length; i++)
		{
			countOfRolls[i] = 0;
		}
		for(int i = 0; i < numOfDice; i++)
		{
			theDice[i] = new Dice(sidesOfDice);
		}

}
/*
 * runSimulation method to simulate the rolling of the dice objects.
 * the integer rollSum is initialized and set to 0 to tally results when more than one
 *  dice is rolled. Two nested for loops accomplish the majority of the simulation.
 *  The first loop references the number of rolls set by the constructor to roll
 *  the dice a specified amount of times. The nested loop references the number of dice
 *  created by the constructor to roll all the dice in simulation. The result of each roll
 *  is stored in rollSum which is then used to index and increment the countOfRolls array
 *  to record the results. After the nested loop completes, the outer loop increments, 
 *  rollSum is set to 0 and the process starts over again.
 */
public void runSimulation()
{
	int rollSum = 0;
	for(int r = 0; r < numOfRolls; r++)
	{
		
		rollSum = 0;
		for(int i = 0 ; i < numOfDice; i++)
		{
			theDice[i].roll();
			rollSum += theDice[i].getLastRoll();
		}
		countOfRolls[rollSum] ++;
	}
    System.out.println();
}
/*
 * displayCount method to print out the results stored in countOfRolls array.
 * A for loop is used with the starting value for p equal to the number of dice.
 * This prevents the indexing of impossible numbers such as 0, or 1 when 2 dice are used.
 * The loop runs while p is less than the length of the countOfRoll array. Printf is used
 * to print out a formatted string, containing the current value of p. p is then used to index
 * countOfRolls and print out the stored value.
 */
public void displayCount()
{
	System.out.println("***Roll Count***");
	for(int p = numOfDice; p < countOfRolls.length; p++)
	{
		
		System.out.printf("%4s", p +": ");
		System.out.print(countOfRolls[p]);
		System.out.println();
	}
	System.out.println();
}
/*
 * graphCount method to print a graphical depiction of the countOfRolls data. graphScale is
 * initialized and set to 1 for use as a scaling factor to constrain the printed graph. A for loop
 * then evaluates the number of rolls. Any time s is divisible by 200 with no remainder and not equal
 * to 0, graphScale is incremented by 1. Nested for loops just like in the displayCount method are then
 * used to print out a * for each tallied result. The length of countOfRolls is divided by graphScale to
 * constrain the graph. Messages are then printed out to indicate the scale and slight reduction in the
 * exact representation of data due to the scaling function.
 */
public void graphCount()
{
	int graphScale = 1;
	System.out.println("***Graph***");
	for(int s = 0; s < numOfRolls; s++)
	{
		if(s%200 == 0 && s>0)
			graphScale ++;
	}
	
	for(int p = numOfDice; p < countOfRolls.length; p++)
	{
		System.out.printf("%4s", p +": " );
		for(int g = 0; g < (countOfRolls[p]/graphScale); g++)
			{
			System.out.print("*");
			}
		System.out.println();
	}
	System.out.println();
	if(graphScale > 1)
	{
	System.out.println("SCALE 1 * = " + graphScale);
	System.out.println("**Scaled values show trend, not exact number**");
	}
	System.out.println("**Current graph showing results for: "+numOfRolls+" rolls**");
	
	
}
}

	



