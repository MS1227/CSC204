/*
 * MercManVillage.java
 * by Bob Allen
 * Fall 2013
 * 
 * This file is the first in a three file example for placing multiple
 * MercMan objects on the screen.  The main method in in this code 
 * prompts the user for a village and passes that integer code into 
 * MercManComponent.  
 */

import java.util.Scanner;
import javax.swing.JFrame;

public class MercManVillage
{
   public static void main(String[] args)
   {
	   // Must establish the JFrame to display our Village
      JFrame frame = new JFrame();
      frame.setSize(800, 600);
      frame.setTitle("MercMan Village");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Give the user some choices for villages.
      System.out.println("Pick a village:");
      System.out.println("\t1. Centered MercMan");
      System.out.println("\t2. Four Corners");
      System.out.println("\t3. Line of Four");
      System.out.println("\t4. Crowded");
    //System.out.println("\t5. ??????????");
      System.out.print("Your Choice? ");
      
      // Read in their choice
      Scanner in = new Scanner(System.in);
      int choice = in.nextInt();
      
      // Pass the user's choice on to the Component
      MercManComponent component = new MercManComponent(choice);
      frame.add(component);

      frame.setVisible(true);
   }
}
