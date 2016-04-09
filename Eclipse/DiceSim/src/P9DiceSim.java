import java.util.Scanner;

//Dice sim Main by Matt Schnider
public class P9DiceSim {
static int userDiceCount;
private int userRollCount;
private int userDiceSidesCount;
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Dice Simulator, a clever program used to simulate the rolling of Dice");
		
		do
		{
		System.out.println("Please enter the desired amount of Dice (no entry defaults to 1): ");
		userDiceCount = in.nextInt();
		}
		while(userDiceCount >=0);
		

	}

}
