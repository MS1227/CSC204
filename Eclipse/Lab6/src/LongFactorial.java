import java.util.Scanner;


public class LongFactorial {

		  public static void main (String [] args)
		   {
		      int value;
		      //  Check that there is a command line parameter
			  Scanner in = new Scanner(System.in);
		      System.out.print ("Please enter a value: ");
		      value = in.nextInt();
		      
		      //  Change the int below to a different type to work with other types
		      long result = fact (value);
		      System.out.println (value + "! = " + result);
		   }


		   /**
		    * Computes the value of n!
		    * @param n a positive integer
		    * @return the value of n!
		    */
		// Change the int below to a different type to work with other types
		   private static long fact (long n)
		   {
			//  Change the int below to a different type to work with other types
			  long product = 1;
		      for (long i = 2; i <= n; i++)
		      {
		         product *= i;
		      }
		      return product;
		   }

	}


