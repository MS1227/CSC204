import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/*
   A component that draws an alien face
*/
public class FaceComponent extends JComponent
{  
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D 
      Graphics2D g2 = (Graphics2D) g;

      // Draw the head
      Ellipse2D.Double head = new Ellipse2D.Double(0, 0, 125, 150);
      g2.draw(head);

      // Draw the eyes
      g2.setColor(Color.GREEN);
      Rectangle eye = new Rectangle(31, 50, 15, 15);
      g2.fill(eye);
      eye.translate(50, 0);
      g2.fill(eye);

      // Draw the mouth
      Line2D.Double mouth = new Line2D.Double(38, 110, 88, 110);
      g2.setColor(Color.RED);
      g2.draw(mouth);
      Line2D.Double mouthL = new Line2D.Double(33, 100, 38, 110);
      g2.draw(mouthL);
      Line2D.Double mouthR = new Line2D.Double(88, 110, 93, 100);
      g2.draw(mouthR);
      Line2D.Double mouthT = new Line2D.Double(33, 100, 93, 100);
      g2.draw(mouthT);
      

      // Draw the greeting
      g2.setColor(Color.BLUE);
      g2.drawString("The Truth Is Out There", 5, 175);
   }
}