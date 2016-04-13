
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

	



