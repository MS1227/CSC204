import java.util.Scanner;


/*DiceSim Main by Matt Schnider
 * Due April 13, 2016
 */
public class P9DiceSim {
static int userDiceCount;
static int userRollCount;
static int userDiceSidesCount;
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in); // Scanner object created to allow user to input data.
		
		System.out.println("Welcome to Dice Simulator, a clever program used to simulate the rolling of Dice!\n"
							+ "Written by Matt Schnider");
		System.out.println();
		do // sentinel loop makes sure negative numbers and 0 are not entered. The entered int is stored in
		{  // the instance variable for use to set the amount of dice.
		System.out.println("Please enter the desired amount of Dice: ");
		userDiceCount = in.nextInt();
		}
		while(userDiceCount <= 0);
		
		System.out.println();
		
		do // same as above.
		{
			System.out.println("Please enter the amount of sides on the Dice: ");
			userDiceSidesCount = in.nextInt();
		}
		while(userDiceSidesCount <= 0);
		
		System.out.println();
		
		do // Same as above.
		{
			System.out.println("Please enter the amount of rolls: ");
			userRollCount = in.nextInt();
		}
		while(userRollCount <= 0);
		
		/*
		 * New DiceSim is instantiated with the values gathered from the user passed in.
		 * The runSimulation method then performs the rolling of the dice and the displayCount
		 * and graphCount methods display the results in text and graphical form, respectively.
		 */
		DiceSim simulation = new DiceSim(userDiceSidesCount, userDiceCount, userRollCount);
		simulation.runSimulation();
		simulation.displayCount();
		simulation.graphCount();
		

	}

}
