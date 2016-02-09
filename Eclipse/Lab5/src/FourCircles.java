import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JComponent;


public class FourCircles extends JComponent
{

public void paintComponent(Graphics g)
 {
	// Recover Graphics2D
	  Graphics2D g2 = (Graphics2D) g;
	  int width = getWidth();		// width of the Component
	  int height = getHeight();		// height of the Component
	  
		// Draw a Solid Orange Circle
		  g2.setColor(Color.MAGENTA);
		  Ellipse2D.Double circle1 = new Ellipse2D.Double(0,0,width/2,height/2);
		  g2.fill(circle1);
		  
		  g2.setColor(Color.darkGray);
		  Ellipse2D.Double circle2 = new Ellipse2D.Double(width/2, 0, width/2, height/2);
		  g2.fill(circle2);
		  
		  g2.setColor(Color.green);
		  Ellipse2D.Double circle3 = new Ellipse2D.Double(0,height/2, width/2, height/2);
		  g2.fill(circle3);
		  
		  g2.setColor(Color.blue);
		  Ellipse2D.Double circle4 = new Ellipse2D.Double(width/2, height/2, width/2, height/2);
		  g2.fill(circle4);
		  
 }
}
