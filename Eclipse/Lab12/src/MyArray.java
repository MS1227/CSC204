
import java.util.*;

public class MyArray
{
  final static int NUM_ITEMS = 6;
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args)
  {
	int[] a = new int[NUM_ITEMS];
	
	fillUp (a);

	printOut (a);

	System.out.println("Array Sum :  " + sumUp(a));
	System.out.println("Number of Positive Values :  " + positiveCount(a));
  }

  private static void fillUp (int[] a)
  {
	for(int i = 0; i <a.length; i++)
	{
		System.out.print("Value for "+ i +": ");
		
		a[i] = in.nextInt();
		
	}



  }

  private static void printOut (int[] a)
  {
	for(int i = 0; i<a.length; i++)
	{
		System.out.println("Value at "+i+": "+a[i] );
	}





  }
	
  private static int sumUp (int[] a)
  {
	// ToDo: Fill this in

	     //  Dummy line   
	     return 0;
  }

  private static int positiveCount (int[] a)
  {
	// ToDo: Fill this in.


	     //  Dummy line   
	     return 0;



  }
}
