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

public class TrafficLight extends JComponent {
	   public void paintComponent(Graphics g)
	   {  
	      // Recover Graphics2D
	      Graphics2D g2 = (Graphics2D) g;

	      // Fill the entire frame with a color
	      //     note:  getWidth() and getHeight() are defined in the
	      //            JComponent.  We can just call them to know 
	      //            the dimensions of this frame. 
	      Rectangle sky = new Rectangle(0,0,getWidth(),getHeight());
	      g2.setColor(Color.blue);
	      g2.fill(sky);
	      
	      Rectangle ground = new Rectangle(0,3*getHeight()/4,getWidth(),getHeight()/4);
	      g2.setColor(Color.gray);
	      g2.fill(ground);
	      
	      Rectangle light = new Rectangle(getWidth()/3,getHeight()/50,getWidth()/3,getHeight()/2);
	      g2.setColor(Color.black);
	      g2.fill(light);
	      
	      // Blue Circle in upper left corner
	      Ellipse2D.Double redCircle = new Ellipse2D.Double(getWidth()/3,getHeight()/50,getWidth()/3,getHeight()/6);
	      g2.setColor(Color.red);
	      g2.fill(redCircle);
	      
	      Ellipse2D.Double yellowCircle = new Ellipse2D.Double(getWidth()/3,getHeight()/50+getHeight()/6,getWidth()/3,getHeight()/6);
	      g2.setColor(Color.yellow);
	      g2.fill(yellowCircle);
	      
	      Ellipse2D.Double greenCircle = new Ellipse2D.Double(getWidth()/3,getHeight()/50+2*getHeight()/6,getWidth()/3,getHeight()/6);
	      g2.setColor(Color.green);
	      g2.fill(greenCircle);
	       
	      
	   }
}
