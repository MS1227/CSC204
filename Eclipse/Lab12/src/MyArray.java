
import java.util.*;
//Lab12 by Matt Schnider
public class MyArray
{
  final static int NUM_ITEMS = 6;
  static Scanner in = new Scanner(System.in);
  public static void main(String[] args)
  {
	int[] a = new int[NUM_ITEMS];
	
	fillUp (a);

	printOut (a);

	System.out.println();
	System.out.println("Array Sum :  " + sumUp(a));
	System.out.println("Number of Positive Values :  " + positiveCount(a));
  }

  private static void fillUp (int[] a)
  {
	for(int i = 0; i <a.length; i++)
	{
		System.out.print("Enter value "+ (i+1) +": ");
		
		a[i] = in.nextInt();
		
	}



  }

  private static void printOut (int[] a)
  {
		
	System.out.println("****** Array Values ******");
	for(int i = 0; i<a.length; i++)
	{

		System.out.print(a[i] + " " );
	}
	System.out.println();
	System.out.print("**************************");





  }
	
  private static int sumUp (int[] a)
  {
	int sumUp = 0;
	
	for(int i = 0; i<a.length; i++)
	{
		sumUp += a[i];
	}

	       
	     return sumUp;
  }

  private static int positiveCount (int[] a)
  {
	int localCount = 0;
	for(int i = 0; i<a.length; i++)
	{
		if(a[i] > 0)
			localCount++;
	}


	
	     return localCount;



  }
}
