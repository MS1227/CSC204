
public class DiceDemo {

	public static void main(String[] args) {
		// Create an array to hold the counts of each roll
		int []counts = new int[7];
		for (int i=0; i<counts.length; i++)
		{
			System.out.println("looping: " + i);
			counts[i] = 0;
		}
		
		display(counts);
		
		int top;
		for (int i=0; i<6000000; i++)
			{
				top = dice(); 
				counts[top]++;
			}
		
		display(counts);
	}

	private static void display(int[] theArray) {
		// To print the contents of the passed in array
		System.out.println("The Array's Values:");
		for (int i=0; i<theArray.length; i++)
			System.out.println("index " + i + ": " + theArray[i]);
		System.out.println();
	}

	private static int dice() {
		// Simulate rolling a 6-sided die
		
		return (int)(Math.random()*6+1);
	}

}
