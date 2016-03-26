/*LoopyPattern class file for assignment A8 by Matt Schnider that uses loops to draw 1 of 4
 * possible choices. Due March 25, 2016.
 */
 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import javax.swing.JComponent;
import java.awt.BasicStroke;
public class LoopyPattern extends JComponent  {
	// Instance variables to store data passed in by the constructor.
	private int dim, count, graphicNumber;
	private Color color1, color2, currentColor;
	
	//  Constructor that gathers data passed in by main and assigns it to the instance variables.
	public LoopyPattern(double d, double c, int g, Color c1, Color c2)
	{
		super();
		dim = (int) d;
		count = (int) c;
		graphicNumber = g;
		color1 = c1;
		color2 = c2;
		currentColor = c1;
	}
	
	// Method that is passed the user's choice and draws the corresponding code.
	 public void paintComponent(Graphics g)
	   {  
	      // Recover Graphics2D
	      Graphics2D g2 = (Graphics2D) g;
	      g2.setColor(currentColor);
	      
	      int step;
	      switch (graphicNumber)
	      {
	      /*
	       * ****Graph Paper ****
	       * Evenly spaces and draws the amount of lines specified by the user.
	       * Step contains the appropriate division size.
	       * Each time the for loop executes, a horizontal and vertical line
	       * of the same color are drawn and the color switched.
	       */
	      case 0:
	    	  step = dim/count;
	    	  for (int i=1; i<=count; i++)
	    	  {
	    		  g2.setColor(currentColor);
	    		  g2.draw(new Line2D.Float (0,i*step,dim,i*step));
	    		  g2.draw(new Line2D.Float (i*step,0,i*step,dim));
	    		  switchColors();
	    	  }
	    	  break;
	    	  /*
	    	   * ****Concentric Circles****
	    	   * 
	    	   */
	      case 1:  							
	    	
	    	  double step1 = (double)dim/count;
	    	  double xYDouble;
	    	  for (int i=count, z=0; i>0 && z<count ; i--, z++)
	    	  {	    		  
	    			  xYDouble = (double)(z*dim)/(2*count);
	    			  g2.setColor(currentColor);
		    		  g2.fill(new Ellipse2D.Double(xYDouble, xYDouble , i*step1, i*step1));
		    		  switchColors(); 
		    		  	    		  		    		 
	    		  
	    		
	    	  }
	    	  
	    	  break;
	      case 2:							///// Grid of Circles
	       	  
	    	  double circleD = (double)dim/count; 	  
	    	  for(int x = 0; x<count; x++)
	    		  
	    	  {
	    		  for(int y = 0; y<count; y++)
	    		  {
	    		  g2.setColor(currentColor);
	    	  	  g2.fill(new Ellipse2D.Double(x*circleD,y*circleD,circleD,circleD));
	    	  	  switchColors();
	    	  	  
	    		  }
	    		  if(count%2 == 0)
	    			  switchColors();
	    	  }
	    	  break;
	      case 3:
	    	  double squareD = (double)dim/count; 	  
	    	  for(int x = 0; x<count; x++)
	    		  
	    	  {
	    		  for(int y = 0; y<count; y++)
	    		  {
	    		  g2.setColor(currentColor);
	    	  	  g2.fill(new Rectangle2D.Double(x*squareD,y*squareD,squareD,squareD));
	    	  	  switchColors();
	    	  	  
	    		  }
	    		  if(count%2 == 0)
	    			  switchColors();
	    	  }
	    	  break;
	      case 4:						
	       	  
	    	  double circleD1 = (double)dim/count; 	  
	    	  for(int x = 0; x<count; x++)
	    		  
	    	  {
	    		  for(int y = 0; y<count; y++)
	    		  {
	    		  g2.setColor(currentColor);
	    	  	  g2.fill(new Ellipse2D.Double(x*circleD1,y*circleD1,2*circleD1,circleD1));
	    	  	  switchColors();
	    	  	  
	    		  }
	    		  if(count%2 == 0)
	    			  switchColors();
	    		  	
	      }
	    	  break;
	      }	
	      
	   }
	 
	 private void switchColors()
	 {
		if(currentColor == color1)
		{
			currentColor = color2;// Code to alternate between color1 and color2, saving in currentColor
		}
		else 
			currentColor = color1;
	 }
	 
}
