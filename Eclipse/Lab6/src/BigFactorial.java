import java.math.BigInteger;
import java.util.Scanner;

//  CSC 204 Factorial program
//  Lab 5
//  This program will compute the factorial of a value given by the
//  user on the command line.  It is constrained to use values that
//  fit into a primitive integer type.

//  Recall, n! = 1 * 2 * 3 * ... * n

public class BigFactorial
{
   public static void main (String [] args)
   {
      int value;
      //  Check that there is a command line parameter
	  Scanner in = new Scanner(System.in);
      System.out.print ("Please enter a value: ");
      value = in.nextInt();;
      
      //  Change the int below to a different type to work with other types
      BigInteger result = fact (value);
      System.out.println (value + "! = " + result);
   }


   /**
    * Computes the value of n!
    * @param n a positive integer
    * @return the value of n!
    */
// Change the int below to a different type to work with other types
   private static BigInteger fact (int n)
   {
	//  Change the int below to a different type to work with other types
	  BigInteger product = BigInteger.valueOf(1);
      for (int i = 2; i <= n; i++)
      {
         product = product.multiply(BigInteger.valueOf(i));
      }
      return product;
   }
}
