import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

import javax.swing.JComponent;

/*
 * A component that draws a MercMan by Matt Schnider
 * Due February 15, 2016
 */
public class MercMan extends JComponent
{

public void paintComponent(Graphics g)
  {
	// Recover Graphics2D
	  Graphics2D g2 = (Graphics2D) g;
	  int width = getWidth();		// width of the Component
	  int height = getHeight();		// height of the Component
	  
	  	  /* Scenery
	  	   * Sky is drawn using a scalable rectangle filled with Cyan. Color is then changed to white
	  	   * and 3 overlapping ellipses are filled to create clouds. Color is then set to yellow and
	  	   * a scalable rectangle and ellipse are drawn to create the beach and sun, respectively.
	  	   * Color is then set to blue and one more scalable rectangle is filled to create the ocean.
	  	   */																											
	  	  g2.setColor(Color.cyan);																			
	  	  Rectangle sky = new Rectangle(0, 0, width, 2*height/3);                                           
	  	  g2.fill(sky);                                                 								    
	  	  g2.setColor(Color.white);
	  	  Ellipse2D.Double cloudA = new Ellipse2D.Double(3*width/4, height/16, width/8, height/16);
	  	  g2.fill(cloudA);
	  	  Ellipse2D.Double cloudB = new Ellipse2D.Double(25*width/32, 3*height/32, width/8, height/16);
	  	  g2.fill(cloudB);
	  	  Ellipse2D.Double cloudC = new Ellipse2D.Double(22*width/32, 3*height/32, width/8, height/16);
	  	  g2.fill(cloudC);
	  	  g2.setColor(Color.yellow);
	  	  Rectangle beach = new Rectangle(0, 2*height/3, width, height);
	  	  g2.fill(beach);
	  	  Ellipse2D.Double sun = new Ellipse2D.Double(-10, 0, width/8, height/8);
	  	  g2.fill(sun);
	  	  g2.setColor(Color.blue);
	  	  Rectangle ocean = new Rectangle(0, 2*height/3, width, height/32);
	  	  g2.fill(ocean);
	  	  
	      /* Legs
	       * Color is set to black and the stroke set to 12 to create a thicker line to represent the legs.
	       * The legs are drawn as two lines that scale as height and width change. 
	       */
	  	  g2.setColor(Color.black);
	      g2.setStroke(new BasicStroke(12));
	      Line2D.Double rightLeg = new Line2D.Double(17*width/32, 2*height/3, 20*width/32, height);
	      g2.draw(rightLeg);
	      Line2D.Double leftLeg = new Line2D.Double(15*width/32, 2*height/3, 12*width/32, height);
	      g2.draw(leftLeg);	
	      
	      /* Arms
	       * Arms are drawn as lines in the same fashion as the legs.
	       */
	      Line2D.Double leftArm = new Line2D.Double(9*width/32, 6*height/16, width/16, 3*height/4);
	      g2.draw(leftArm);
	      Line2D.Double rightArm = new Line2D.Double(23*width/32, 6*height/16, 15*width/16, height/8);
	      g2.draw(rightArm);
	      
	      /* Torso
	       * Stroke is set back to 1 for thin lines and the color is set to magenta in preparation to draw
	       * the torso. A scalable ellipse is then filled. Color is changed to black and 4 lines are drawn
	       * in order to add some detail to the torso.
	       */
	      g2.setStroke(new BasicStroke(1));
		  g2.setColor(Color.magenta);
		  Ellipse2D.Double body = new Ellipse2D.Double(width/4, height/6, width/2, height/2); //draws the body ellipse
		  g2.fill(body);
		  g2.setColor(Color.BLACK);
		  Line2D.Double centerLine = new Line2D.Double(width/2, 2*height/3, width/2, height/2);
		  g2.draw(centerLine);
		  Line2D.Double leftLine = new Line2D.Double(width/2, height/2, width/4, 7*height/16);
		  g2.draw(leftLine);
		  Line2D.Double rightLine = new Line2D.Double(width/2, height/2, 3*width/4, 7*height/16);
		  g2.draw(rightLine);
		  Line2D.Double topLine = new Line2D.Double(width/4, 7*height/16, 3*width/4, 7*height/16);
		  g2.draw(topLine);
		  
		  /* Ears
		   * Color is set to red and 2 scalable ellipses are created and filled to represent the ears.
		   */
		  g2.setColor(Color.red);
		  Ellipse2D.Double leftEar = new Ellipse2D.Double(93*width/256, 10*height/64, 2*width/64, height/32);
		  g2.fill(leftEar);
		  Ellipse2D.Double rightEar = new Ellipse2D.Double(155*width/256, 10*height/64, 2*width/64, height/32);
		  g2.fill(rightEar);
		  
		  /*Head
		   * Color is set to Dark Gray and a scalable ellipse is created and filled to create the head.
		   */
		  g2.setColor(Color.DARK_GRAY);
		  Ellipse2D.Double head = new Ellipse2D.Double(3*width/8, height/16 , width/4, height/4); //draws the head
		  g2.fill(head);
		  
		  /* Hair
		   * Color is set to green and a scalable rectangle is created and filled. The mutator, .translate, is then used
		   * to create copies of the rectangle which are filled with the same green. Color is then set to black and more
		   * rectangles are added, but are drawn instead of filled, creating texture for the hair.
		   */
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
		  g2.setColor(Color.black);
		  Rectangle hairLines = new Rectangle(13*width/32, 0, width/32, 7*height/64);
		  g2.draw(hairLines);
		  hairLines.translate(width/32, -height/64);
		  g2.draw(hairLines);
		  hairLines.translate(width/32, -height/64);
		  g2.draw(hairLines);
		  hairLines.translate(width/32, 0);
		  g2.draw(hairLines);
		  hairLines.translate(width/32, height/64);
		  g2.draw(hairLines);
		  hairLines.translate(width/32, height/64);
		  g2.draw(hairLines);
		  
		  /* Eyeballs
		   * Color is set to white and 2 scalable ellipses are drawn to create the whites of
		   * the eyeballs.
		   */
		  g2.setColor(Color.WHITE);
		  Ellipse2D.Double eyeL = new Ellipse2D.Double(7*width/16, height/8, width/32, height/16);
		  g2.fill(eyeL);
		  Ellipse2D.Double eyeR = new Ellipse2D.Double(17*width/32, height/8, width/32, height/16);
		  g2.fill(eyeR);
		  
		  /* Pupils
		   * Color is set to black and 2 scalable ellipses are drawn to create the pupils of the
		   * eyeballs.
		   */
		  g2.setColor(Color.black);
		  Ellipse2D.Double eyeballL = new Ellipse2D.Double(7*width/16, 5*height/32, width/32, height/32);
		  g2.fill(eyeballL);
		  
		  Ellipse2D.Double eyeballR = new Ellipse2D.Double(17*width/32, 5*height/32, width/32, height/32);
		  g2.fill(eyeballR);
		  
		  /* Nose
		   * Color is set to orange and three line segments are used to create a nose in the shape of a triangle.
		   */
		  g2.setColor(Color.ORANGE);
		  Line2D.Double noseL = new Line2D.Double(width/2, 3*height/16, 31*width/64, 13*height/64);
		  g2.draw(noseL);
		  Line2D.Double noseB = new Line2D.Double(31*width/64, 13*height/64, 33*width/64, 13*height/64);
		  g2.draw(noseB);
		  Line2D.Double noseR = new Line2D.Double(33*width/64, 13*height/64, width/2, 3*height/16);
		  g2.draw(noseR);
		  
		  /* Teeth
		   * Color is set to white and a scalable rectangle is created and filled. Translate and fill are 
		   * again used to generate copies of the rectangle to form the whites of the teeth.
		   */
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
		  
		  /* Teeth Outline
		   * Color is set to red and the same code from the Teeth section is reused with the exception of
		   * fill has been changed to draw to create outlines instead of solid rectangles.
		   */
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
