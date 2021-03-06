/*  Loopy Graphics Driver
 *  
 *  Bob Allen
 *  Spring 2016
 *  
 *  This program gathers a few parameters from the user and
 *  then passes the information to a "LoopyPattern" to 
 *  generate the specified loopy graphic.
 */

import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;

import javax.swing.JColorChooser;
import javax.swing.JComponent;
import java.awt.BasicStroke;


public class Loopy {

	public static void main(String[] args) {
		// Local variables to hold our gathered information
		 int dim, count, graphicNumber;
		 Color color1, color2;
		 
		 // Prompt the user for the information, and read it into our variables.
		 Scanner in = new Scanner(System.in);
		 System.out.println("Which graphic do you want to produce?\n" +
				 			"0 = graph paper\n" +
				 			"1 = concentric circles\n" +
				 			"2 = grid of circles\n" +
				 			"3 = YOUR FIRST LOOPY GRAPHIC\n" +
				 			"4 = YOUR SECOND LOOPY GRAPHIC\n");
		 
		 
		 graphicNumber = in.nextInt(); 	// ******* YOU SHOULD VERIFY THE INPUT IS IN RANGE
		 
		 System.out.print("What dimension would you like for the graphic: ");
		 dim = in.nextInt();			//  ******  YOU SHOULD VERIFY THE DIM IS 100-1000
		 
		 System.out.print("What count would you like for this graphic: " );
		 count = in.nextInt();			//  ******  YOU SHOULD VERIFY THE COUNT IS 1-DIM
		 
		 // Here is a cool color picker program from Java Swing
		 color1 = JColorChooser.showDialog(
                 null,
                 "Choose First Color",
                 Color.black); // default color
		 
		 color2 = JColorChooser.showDialog(
                 null,
                 "Choose Second Color",
                 Color.orange); // default color
		 
		 // Build the JFrame, create the LoopyPattern object, and put it into the frame.
		  JFrame frame = new JFrame();

	      frame.setSize(dim+16, dim+38);  // These add-ons are the thickness of the frame's border
	      frame.setTitle("BOB's Loopy Graphics!"); // *****  PUT YOUR NAME HERE
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      LoopyPattern component = new LoopyPattern(dim,count,graphicNumber,color1,color2);
	      frame.add(component);

	      frame.setVisible(true);
	}

}



	
