import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Ellipse2D.Double;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;

/*MercMan file to be used with the MercManVillage Main by Matt Schnider.
 * Due February 24, 2016
 * 
 * Below are instance variables that are passed values from constructors based
 * on user input.
 */
public class MercMan
{
	private int startX;
	private int startY;
	private int mmWidth;
	private int mmHeight;

/*Constructor that takes the value of four integers passed in from selected case in 
 * Component file and loads them into the respective instance variable.
 * 
 */
	public MercMan(int x, int y, int w, int h)
	{
		startX = x;
		startY = y;
		mmWidth = w;
		mmHeight = h;
	}

/* 
 * Graphics section that draws the MercPeople in the same fashion as prior MercMan project, but with some improvements.
 * Random number generators are used to vary color of both body and hair as well as the ending Y coordinate of the arms
 * creating a waving effect each time the frame is resized. Hair is drawn using a while loop to draw 19 concentric 
 * ellipses.
 * 
 */
	public void draw(Graphics2D g2)
	{
		//body, head, eyes, pupils, nose, mouth, teeth, lips, ears, and legs are instantiated.
		Ellipse2D.Double body = new Ellipse2D.Double(startX+mmWidth/4, startY+mmHeight/4, mmWidth/2, mmHeight/2);
		Ellipse2D.Double head = new Ellipse2D.Double(startX+mmWidth/4, startY+mmHeight/8, mmWidth/2, mmHeight/4);
		Ellipse2D.Double eyeL = new Ellipse2D.Double(startX+3*mmWidth/8, startY+3*mmHeight/16, mmWidth/16, mmHeight/16 );
		Ellipse2D.Double eyeR = new Ellipse2D.Double(startX+9*mmWidth/16, startY+3*mmHeight/16, mmWidth/16, mmHeight/16 );
		Ellipse2D.Double pupilL = new Ellipse2D.Double(startX+25*mmWidth/64, startY+7*mmHeight/32, mmWidth/32, mmHeight/32);
		Ellipse2D.Double pupilR = new Ellipse2D.Double(startX+37*mmWidth/64, startY+7*mmHeight/32, mmWidth/32, mmHeight/32);
		Point2D.Double nT = new Point2D.Double(startX+mmWidth/2,startY+mmHeight/4);
		Point2D.Double nL = new Point2D.Double(startX+7*mmWidth/16, startY+9*mmHeight/32);
		Point2D.Double nR = new Point2D.Double(startX+9*mmWidth/16, startY+9*mmHeight/32);
		Line2D.Double noseL = new Line2D.Double(nT, nL);
		Line2D.Double noseB = new Line2D.Double(nL, nR);
		Line2D.Double noseR = new Line2D.Double(nR, nT);
		Ellipse2D.Double mouth = new Ellipse2D.Double(startX+13*mmWidth/32, startY+10*mmHeight/32, 3*mmWidth/16, mmHeight/32);
		Ellipse2D.Double teeth = new Ellipse2D.Double(startX+13*mmWidth/32, startY+41*mmHeight/128, 3*mmWidth/16, mmHeight/64);
		Line2D.Double lips = new Line2D.Double(startX+13*mmWidth/32, startY+21*mmHeight/64, startX+19*mmWidth/32, startY+21*mmHeight/64);
		Ellipse2D.Double earL = new Ellipse2D.Double(startX+29*mmWidth/128, startY+7*mmHeight/32, mmWidth/16, mmHeight/32);
		Ellipse2D.Double earR = new Ellipse2D.Double(startX+91*mmWidth/128, startY+7*mmHeight/32, mmWidth/16, mmHeight/32);
		Line2D.Double legL = new Line2D.Double(startX+7*mmWidth/16, startY+11*mmHeight/16, startX+mmWidth/4, startY+mmHeight);
		Line2D.Double legR = new Line2D.Double(startX+9*mmWidth/16, startY+11*mmHeight/16, startX+3*mmWidth/4, startY+mmHeight);
		
		//Random generators for ending Y-coordinate of arms as well as the instantiation and drawing of the arms. 
		Random armY = new Random();
		int randArm = armY.nextInt(3*mmHeight/4 - mmHeight/4) +mmHeight/4;
		Random armY2 = new Random();
		int randArm2 = armY2.nextInt(3*mmHeight/4 - mmHeight/4) +mmHeight/4;
		g2.setStroke(new BasicStroke(12));
		Line2D.Double leftArm = new Line2D.Double(startX+5*mmWidth/16, startY+mmHeight/2, startX+mmWidth/8, startY+randArm );
		g2.draw(leftArm);
		Line2D.Double rightArm = new Line2D.Double(startX+11*mmWidth/16, startY+mmHeight/2, startX+7*mmWidth/8, startY+randArm2);
		g2.draw(rightArm);
		
		//Random number generator for body color
		Random rBody = new Random();
		float bR = rBody.nextFloat();
		float bG = rBody.nextFloat();
		float bB = rBody.nextFloat();
		
		//drawing of instantiated objects
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(12));
		g2.draw(legL);
		g2.draw(legR);
		g2.setStroke(new BasicStroke(1));
		g2.setColor(new Color(bR,bG,bB));
		g2.fill(body);
		g2.setColor(Color.magenta);
		g2.fill(earL);
		g2.fill(earR);
		g2.setColor(Color.CYAN);
		g2.fill(head);
		g2.setColor(Color.RED);
		g2.fill(mouth);
		g2.setColor(Color.WHITE);
		g2.fill(teeth);
		g2.fill(eyeL);
		g2.fill(eyeR);
		g2.setColor(Color.black);
		g2.fill(pupilL);
		g2.fill(pupilR);
		g2.draw(noseL);
		g2.draw(noseB);
		g2.draw(noseR);
		g2.draw(lips);
		
		
		/*
		 * While loop for drawing hair. The integer drawHair is reduced by one after each cycle of the loop as a 
		 * control to break out of the loop condition when it reaches 0.
		 */
		
		double hairStartX = startX+11*mmWidth/32;
		int drawHair = 20;
		
		//Random number generator for hair color.
		Random rand = new Random();
		float r = rand.nextFloat();
		float g = rand.nextFloat();
		float b = rand.nextFloat();
	
		while (drawHair > 0)
		{
			g2.setStroke(new BasicStroke(2));
			g2.setColor(new Color(r,g,b));
			Ellipse2D.Double hair = new Ellipse2D.Double(hairStartX, startY, mmWidth/32, 5*mmHeight/32);
			g2.draw(hair);
			hairStartX = hairStartX + mmWidth/64.0;
			g2.draw(hair);
			drawHair = drawHair - 1;
			
		}
		
		
		
	}
}
