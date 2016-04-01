//Student

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.awt.Canvas;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

class ColoredBoxes extends Canvas
{
	private int width;
	private int height;
	private int numberOfBoxes;
	public ColoredBoxes(int count)
	{
		numberOfBoxes = count;
		
		setBackground(Color.WHITE);
	}
	
	//a method to  display a text message
	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
	  	window.drawString("Graphics Lab Lab11 ", 20, 40 );
	  	window.drawString("Drawing boxes with nested loops ", 20, 80 );
	  	width = getWidth();
		height = getHeight();
	  	drawBoxes(window);
	}
		// code to create a table with rows and coloumns
	public void drawBoxes(Graphics window)
	{
		double boxStepX = (double)width/numberOfBoxes;
		double boxStepY = (double)height/numberOfBoxes;
		Graphics2D window2 = (Graphics2D) window;
		for(int x = 0; x < numberOfBoxes; x++)
		{
		
			for(int y = 0; y < numberOfBoxes; y++)
			{
				window.setColor(new Color((int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256)));
				window2.fill(new Rectangle2D.Double(x*boxStepX, y*boxStepY, boxStepX, boxStepY));
			}
		}
	
}
		//nested loops to draw the pretty boxes
	}
