/*
 * Bob Allen
 * Spring 2016
 * SimpleGraphics demonstrates how to generate the 
 * following Java graphics:
 * Rectangle, Ellipse, and Line.
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

public class SampleGraphics extends JComponent {
	   public void paintComponent(Graphics g)
	   {  
	      // Recover Graphics2D
	      Graphics2D g2 = (Graphics2D) g;

	      // Fill the entire frame with a color
	      //     note:  getWidth() and getHeight() are defined in the
	      //            JComponent.  We can just call them to know 
	      //            the dimensions of this frame. 
	      Rectangle box = new Rectangle(0,0,getWidth(),getHeight());
	      g2.fill(box);
	      
	      // Red square in lower right corner
	      Rectangle redSquare = new Rectangle(250,250,250,250);
	      g2.setColor(Color.red);
	      g2.fill(redSquare);
	      
	      // Blue Circle in upper left corner
	      Ellipse2D.Double blueCircle = new Ellipse2D.Double(0,0,getWidth()/2,getHeight()/2);
	      g2.setColor(Color.blue);
	      g2.fill(blueCircle);
	      
	      // Green lines forming the diagonals of the frame.
	      g2.setStroke(new BasicStroke(5));  // this sets the thickness of the draw line
	      Line2D.Double diagonal1 = new Line2D.Double(0, 0, getWidth(), getHeight());
	      g2.setColor(Color.green);
	      g2.draw(diagonal1);
	      
	      Line2D.Double diagonal2 = new Line2D.Double(getWidth(), 0, 0, getHeight());
	      g2.draw(diagonal2);      
	      
	   }
}
