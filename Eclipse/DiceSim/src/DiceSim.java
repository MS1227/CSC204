
public class DiceSim 
{
private int sidesOfDice;
private int numOfDice;
private int numOfRolls;
private int [] countOfRolls;
private Dice [] theDice;

public DiceSim()
{
	sidesOfDice = 6;
	numOfDice = 1;
	numOfRolls = 100;
	countOfRolls = new int[sidesOfDice*numOfDice +1];
	theDice = new int[numOfDice];
	for(int i = 0; i<countOfRolls.length; i++)
		{
			countOfRolls[i] = 0;
		}

}

	
}


