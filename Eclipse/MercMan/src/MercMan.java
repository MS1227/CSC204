import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

/**
A component that draws a MercMan
*/
public class MercMan extends JComponent
{

public void paintComponent(Graphics g)
  {
	// Recover Graphics2D
	  Graphics2D g2 = (Graphics2D) g;
	  int width = getWidth();		// width of the Component
	  int height = getHeight();		// height of the Component
	  
	  	  //scenery
	  
	  	  g2.setColor(Color.cyan);	
	  	  Rectangle sky = new Rectangle(0, 0, width, 2*height/3);
	  	  g2.fill(sky);
	  	  g2.setColor(Color.yellow);
	  	  Rectangle beach = new Rectangle(0, 2*height/3, width, height);
	  	  g2.fill(beach);
	  	  Ellipse2D.Double sun = new Ellipse2D.Double(-10, 0, width/8, height/8);
	  	  g2.fill(sun);
	  	  g2.setColor(Color.blue);
	  	  Rectangle ocean = new Rectangle(0, 2*height/3, width, height/32);
	  	  g2.fill(ocean);
	      //legs
	  
	  	  g2.setColor(Color.black);
	      g2.setStroke(new BasicStroke(12));
	      Line2D.Double rightLeg = new Line2D.Double(17*width/32, 2*height/3, 20*width/32, height);
	      g2.draw(rightLeg);
	      Line2D.Double leftLeg = new Line2D.Double(15*width/32, 2*height/3, 12*width/32, height);
	      g2.draw(leftLeg);	
	      
	      //Arms
	      Line2D.Double leftArm = new Line2D.Double(9*width/32, 6*height/16, width/16, 3*height/4);
	      g2.draw(leftArm);
	      Line2D.Double rightArm = new Line2D.Double(23*width/32, 6*height/16, 15*width/16, 3*height/4);
	      g2.draw(rightArm);
	      
	      //Torso
	      g2.setStroke(new BasicStroke(1));
		  g2.setColor(Color.magenta);
		  Ellipse2D.Double body = new Ellipse2D.Double(width/4, height/6, width/2, height/2); //draws the body ellipse
		  g2.fill(body);
		  
		  //Ears
		  g2.setColor(Color.red);
		  Ellipse2D.Double leftEar = new Ellipse2D.Double(93*width/256, 10*height/64, 2*width/64, height/32);
		  g2.fill(leftEar);
		  Ellipse2D.Double rightEar = new Ellipse2D.Double(155*width/256, 10*height/64, 2*width/64, height/32);
		  g2.fill(rightEar);
		  //Head
		  g2.setColor(Color.DARK_GRAY);
		  Ellipse2D.Double head = new Ellipse2D.Double(3*width/8, height/16 , width/4, height/4); //draws the head
		  g2.fill(head);
		  
		  //Hair
		  g2.setColor(Color.GREEN);
		  Rectangle hair = new Rectangle(13*width/32, 0, width/32, 7*height/64);
		  g2.fill(hair);
		  hair.translate(width/32, -height/64);
		  g2.fill(hair);
		  hair.translate(width/32, -height/64);
		  g2.fill(hair);
		  hair.translate(width/32, 0);
		  g2.fill(hair);
		  hair.translate(width/32, height/64);
		  g2.fill(hair);
		  hair.translate(width/32, height/64);
		  g2.fill(hair);
		  
		  //Eyeballs
		  g2.setColor(Color.WHITE);
		  Ellipse2D.Double eyeL = new Ellipse2D.Double(7*width/16, height/8, width/32, height/16);
		  g2.fill(eyeL);
		  Ellipse2D.Double eyeR = new Ellipse2D.Double(17*width/32, height/8, width/32, height/16);
		  g2.fill(eyeR);
		  
		  //Pupils
		  g2.setColor(Color.black);
		  Ellipse2D.Double eyeballL = new Ellipse2D.Double(7*width/16, 5*height/32, width/32, height/32);
		  g2.fill(eyeballL);
		  
		  Ellipse2D.Double eyeballR = new Ellipse2D.Double(17*width/32, 5*height/32, width/32, height/32);
		  g2.fill(eyeballR);
		  
		  //Nose
		  g2.setColor(Color.ORANGE);
		  Line2D.Double noseL = new Line2D.Double(width/2, 3*height/16, 31*width/64, 13*height/64);
		  g2.draw(noseL);
		  Line2D.Double noseB = new Line2D.Double(31*width/64, 13*height/64, 33*width/64, 13*height/64);
		  g2.draw(noseB);
		  Line2D.Double noseR = new Line2D.Double(33*width/64, 13*height/64, width/2, 3*height/16);
		  g2.draw(noseR);
		  
		  //Teeth
		  g2.setColor(Color.white);
		  Rectangle teeth = new Rectangle(29*width/64, 15*height/64, width/64, height/64);
		  g2.fill(teeth);
		  teeth.translate(width/64, 0);
		  g2.fill(teeth);
		  teeth.translate(width/64, 0);
		  g2.fill(teeth);
		  teeth.translate(width/64, 0);
		  g2.fill(teeth);
		  teeth.translate(width/64, 0);
		  g2.fill(teeth);
		  teeth.translate(width/64, 0);
		  g2.fill(teeth);
		  teeth.translate(0, height/64);
		  g2.fill(teeth);
		  teeth.translate(-width/64, 0);
		  g2.fill(teeth);
		  teeth.translate(-width/64, 0);
		  g2.fill(teeth);
		  teeth.translate(-width/64, 0);
		  g2.fill(teeth);
		  teeth.translate(-width/64, 0);
		  g2.fill(teeth);
		  teeth.translate(-width/64, 0);
		  g2.fill(teeth);
		  
		  //Teeth ouline
		  g2.setColor(Color.RED);
		  Rectangle mouth = new Rectangle(29*width/64, 15*height/64, width/64, height/64);
		  g2.draw(mouth);
		  mouth.translate(width/64, 0);
		  g2.draw(mouth);
		  mouth.translate(width/64, 0);
		  g2.draw(mouth);
		  mouth.translate(width/64, 0);
		  g2.draw(mouth);
		  mouth.translate(width/64, 0);
		  g2.draw(mouth);
		  mouth.translate(width/64, 0);
		  g2.draw(mouth);
		  mouth.translate(0, height/64);
		  g2.draw(mouth);
		  mouth.translate(-width/64, 0);
		  g2.draw(mouth);
		  mouth.translate(-width/64, 0);
		  g2.draw(mouth);
		  mouth.translate(-width/64, 0);
		  g2.draw(mouth);
		  mouth.translate(-width/64, 0);
		  g2.draw(mouth);
		  mouth.translate(-width/64, 0);
		  g2.draw(mouth);
		  
	  
		  
 }
}
