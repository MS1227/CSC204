
public class DiceSim 
{
private int sidesOfDice;
private int numOfDice;
private int numOfRolls;
private int [] countOfRolls;
private Dice[] theDice;

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
	System.out.println("hello world");
	for(int r = 0; r < numOfRolls; r++)
	{
		
		rollSum = 0;
		for(int i = 0 ; i < numOfDice; i++)
		{
			System.out.println("theDice " + (i+1)+":"+ theDice[i].roll());
			rollSum += theDice[i].getLastRoll();
			System.out.println("rollSum:" + rollSum);	
		}
		countOfRolls[rollSum] ++;
	}

}
public void displayCout()
{
	for(int p = 0; p < countOfRolls.length; p++)
	{
		if(p > 0)
		System.out.println((numOfDice)+":" + countOfRolls[p]);
	}
}
}

	



