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

public class Target extends JComponent {
	   public void paintComponent(Graphics g)
	   {  
	      // Recover Graphics2D
	      Graphics2D g2 = (Graphics2D) g;


	      int width = getWidth();
	      int height = getHeight();
	      
	      Rectangle background = new Rectangle(0,0,width,height);
	      g2.setColor(Color.white);
	      g2.fill(background);
	      
	      
	      // Blue Circle in upper left corner
	      Ellipse2D.Double c1 = new Ellipse2D.Double(0,0,width,height);
	      g2.setColor(Color.red);
	      g2.fill(c1);
	      
	      Ellipse2D.Double c2 = new Ellipse2D.Double(width/6,height/6,2*width/3,2*height/3);
	      g2.setColor(Color.white);
	      g2.fill(c2);
	      
	      Ellipse2D.Double c3 = new Ellipse2D.Double(width/3,height/3,width/3,height/3);
	      g2.setColor(Color.red);
	      g2.fill(c3);
	     
	      
	   }
}
