import java.util.Scanner;


public class DoubleFactorial {

		  public static void main (String [] args)
		   {
		      int value;
		      //  Check that there is a command line parameter
			  Scanner in = new Scanner(System.in);
		      System.out.print ("Please enter a value: ");
		      value = in.nextInt();
		      
		      //  Change the int below to a different type to work with other types
		      double result = fact (value);
		      System.out.println (value + "! = " + result);
		   }


		   /**
		    * Computes the value of n!
		    * @param value a positive integer
		    * @return the value of n!
		    */
		// Change the int below to a different type to work with other types
		   private static double fact (int value)
		   {
			//  Change the int below to a different type to work with other types
			  double product = 1;
		      for (double i = 2; i <= value; i++)
		      {
		         product *= i;
		      }
		      return product;
		   }

	}


