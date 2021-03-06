

import java.awt.Graphics; 
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.Timer;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.geom.Rectangle2D;
import java.awt.Canvas;

import javax.swing.JPanel;

public class RandomColoredBoxes extends JPanel
{
private int width;
private int height;
private int numberOfBoxes;

	private Timer timer;
	private final static int SLEEP = 110;
	
	public RandomColoredBoxes(int count)
	{		
		setBackground(Color.BLACK);
		setVisible(true);
		numberOfBoxes = count;
		ActionListener paintCaller = new ActionListener(){
			public void actionPerformed(ActionEvent event)
			{
				repaint();  
			}
		};
		timer = new Timer(SLEEP, paintCaller);
		timer.start();
	}	

	public void paintComponent( Graphics window )
	{
		super.paintComponent(window);
		
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
	  	window.drawString("Graphics Lab Lab11k ", 20, 40);
	  	window.drawString("Drawing boxes with nested loops ", 20, 80);
	  	width = getWidth();
		height = getHeight();
	  	drawBoxes(window);
	}

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
}