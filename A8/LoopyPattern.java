/*
 YOUR GOOD COMMENTS GO HERE.......
 */
 
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.util.Random;
import javax.swing.JComponent;
import java.awt.BasicStroke;
public class LoopyPattern extends JComponent  {
	// COMMENT
	private int dim, count, graphicNumber;
	private Color color1, color2, currentColor;
	
	//  COMMENT
	public LoopyPattern(int d, int c, int g, Color c1, Color c2)
	{
		super();
		dim = d;
		count = c;
		graphicNumber = g;
		color1 = c1;
		color2 = c2;
		currentColor = c1;
	}
	
	// COMMENT
	 public void paintComponent(Graphics g)
	   {  
	      // Recover Graphics2D
	      Graphics2D g2 = (Graphics2D) g;
	      g2.setColor(currentColor);
	           
	      int step;
	      switch (graphicNumber)
	      {
	      
	      case 0:							////// Graph Paper
	    	  step = dim/count;
	    	  for (int i=1; i<=count; i++)
	    	  {
	    		  g2.setColor(currentColor);
	    		  g2.draw(new Line2D.Float (0,i*step,dim,i*step));
	    		  g2.draw(new Line2D.Float (i*step,0,i*step,dim));
	    		  switchColors();
	    	  }
	    	  break;
	      case 1:  							////// Concentric Circles
	    	  
	    	  break;
	      case 2:							///// Grid of Circles
	       	  
	    	  break;
	      }
	   }
	 
	 private void switchColors()
	 {
		 // Code to alternate between color1 and color2, saving in currentColor
		
	 }
	 
}
