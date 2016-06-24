import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Line2D;

import javax.swing.JComponent;
/**
 * Class file to simulate the sh!tting of a cow.
 * 
 * @version sh!t.0
 * @author MattSchnider
 *
 */
public class Cow extends JComponent{

private int poop;
Graphics2D g2;
	
public Cow()
{
	poop = 10;
}

public Cow(int a)
{
	poop = a;
}
public Shape shit()
{
	Line2D.Double aline = new Line2D.Double(0,0,800,600);
	return aline;
	
}
public void paintComponent(Graphics g)
{  
   // Recover Graphics2D
  Graphics2D g2 = (Graphics2D) g;
  g2.draw(shit());
}

}
