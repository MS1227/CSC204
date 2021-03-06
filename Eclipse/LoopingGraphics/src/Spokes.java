
	import java.awt.BasicStroke;

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Rectangle;
	import java.awt.geom.Ellipse2D;
	import java.awt.geom.Line2D;

	import javax.swing.JComponent;
	
	public class  Spokes    extends JComponent {

	
		private int lines;
		
		   public Spokes(int count) {
			lines = count;
		}

		public void paintComponent(Graphics g)
		   {  
		      // Recover Graphics2D
		      Graphics2D g2 = (Graphics2D) g;
		      double width = getWidth();
		      double height = getHeight();
		      
		      double r;
		      if(width < height)
		    	  r = width/4;
		      else
		    	  r = height/4;
		      
		      double centerX = width/2; // dim/2
		      double centerY = height/2; //dim/2
		      double increment = (2*Math.PI)/lines;
		      double x,y; //for calculating the points on the circle
		    		  
		      for(int spoke=1; spoke<=lines; spoke++)
		      {
		    	  g2.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
		    	  x = r*Math.cos(spoke*increment) + centerX;
		    	  y = r*Math.sin(spoke*increment) + centerY;
		    	  
		    	  Line2D.Double aLine = new Line2D.Double(centerX, centerY, x, y);
			      g2.draw(aLine);  
		
			     
		      }
		      
		      
		   }
	}





