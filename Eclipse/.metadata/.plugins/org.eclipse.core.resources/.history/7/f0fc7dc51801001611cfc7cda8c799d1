import java.util.Scanner;

import javax.swing.JFrame;

/*Dice sim Main by Matt Schnider
 * Due April 13, 2016
 */
public class P9DiceSim {
static int userDiceCount;
static int userRollCount;
static int userDiceSidesCount;
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Welcome to Dice Simulator, a clever program used to simulate the rolling of Dice!\n"
							+ "Written by Matt Schnider");
		System.out.println();
		do
		{
		System.out.println("Please enter the desired amount of Dice: ");
		userDiceCount = in.nextInt();
		}
		while(userDiceCount < 0);
		
		System.out.println();
		
		do
		{
			System.out.println("Please enter the amount of sides on the Dice: ");
			userDiceSidesCount = in.nextInt();
		}
		while(userDiceSidesCount < 0);
		
		System.out.println();
		
		do
		{
			System.out.println("Please enter the amount of rolls: ");
			userRollCount = in.nextInt();
		}
		while(userRollCount < 0);
		
		DiceSim simulation = new DiceSim(userDiceSidesCount, userDiceCount, userRollCount);
		simulation.runSimulation();
		simulation.displayCount();
		simulation.graphCount();
		

	}

}
