import java.util.Scanner;

/**
   This example demonstrates variables and assignments.
*/

public class VariableDemo
{
   public static void main(String[] args)
   {
      int width = 10; // Declares width and initializes it with 10
      System.out.print("width: ");
      System.out.println(width);
      
      double x =  1.0;
      double y = 2.0;
      double a = 1, b=2;
      double value = 144;
      System.out.println(Math.E);
      System.out.println("The value of PI is: " + Math.PI);
      System.out.println(x/y);
      System.out.println(a/b);
      System.out.println("The square root of: " + value + " is: " + Math.sqrt(value));
      
      System.out.print("What is the radius of your circle: ");
      Scanner in = new Scanner(System.in);
      double radius = in.nextDouble();
      double area = Math.PI*Math.pow(radius, 2);
      System.out.println("The area of your circle is: " + area);
      

      width = width + 10; // The same variable can occur on both sides
      System.out.print("width: ");
      System.out.println(width);      
   }
}