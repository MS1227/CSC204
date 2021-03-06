

	
	import java.awt.BasicStroke;

	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Rectangle;
	import java.awt.geom.Ellipse2D;
	import java.awt.geom.Line2D;

	import javax.swing.JComponent;
	
	public class LoopingGraphics   extends JComponent {

	
		private int lines;
		
		   public LoopingGraphics(int count) {
			lines = count;
		}

		public void paintComponent(Graphics g)
		   {  
		      // Recover Graphics2D
		      Graphics2D g2 = (Graphics2D) g;
		      double dim = getWidth();
		      double increment = dim/lines;
		    		  
		      for(int row=1; row<=lines; row++)
		      {
		    	  g2.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
		    	  Line2D.Double aLine = new Line2D.Double(0, 0, dim, row*increment);
			      g2.draw(aLine);  
		    	  //aLine = new Line2D.Double(row*increment,0 , row*increment, dim);
			      aLine = new Line2D.Double(dim/2, 0 , row*increment, dim);
			      g2.draw(aLine); 
		      }
		      
		      
		   }
	}


