/*
 * Bob Allen
 * Spring 2016
 * 
 * Program to test the Dice class.
 * 
 */
public class TestDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUMROLLS = 10000;
		int sidesOnDie = (int)(Math.random()*100 +1);  // generate a die with anywhere from 1-100 sides.
		Dice d = new Dice(sidesOnDie);
		int min = sidesOnDie;  	// place to hold the smallest roll seen
		int max = 1;			// place to hold the largest roll seen
		int roll = 0;			// place to hold the roll's value
		
		System.out.println("Today we have a " + sidesOnDie + " sided die.");
		System.out.println("We will roll it " + NUMROLLS + " times.");
		for (int i=0; i<NUMROLLS; i++)
		{
			if (i%10 == 0) System.out.println();
			roll = d.roll(); 	// roll that die
			if (roll < min) min = roll;
			if (roll > max) max = roll;
			System.out.print(roll + "\t");
		}
		System.out.println("\nDuring the " + NUMROLLS + " rolls of our "+ sidesOnDie + " sided die, we saw:");
		System.out.println("The largest roll we saw was: " + max + ".");
		System.out.println("The smallest roll we saw was: " + min + ".");
	}

}
