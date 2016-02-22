/*
 * MercManComponent.java
 * by Bob Allen
 * Fall 2013
 * 
 * This file is the second in a three file example for placing multiple
 * MercMan objects on the screen.  The main method in MercManVillage 
 * prompts the user for a village and passes that integer code into 
 * this file.  Depending upon the code, this file generates the requested
 * MercMan objects. 
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;


public class MercManComponent extends JComponent
{  
	// Instance Variable to hold the user's desired village
	private int choice;
	
	// The lone constructor that is passed the user's choice
	public MercManComponent(int c)
	{
		super();
		choice = c;
	}
	
	// Part of the JComponent that draws things into the graphic window.
   public void paintComponent(Graphics g)
   {  
	   // Some local variables to be used throughout this method.
      Graphics2D g2 = (Graphics2D) g;
      int frameWidth = getWidth();
      int frameHeight = getHeight();

      // Now let's pick which village to generate based upon the user's choice
      switch (choice)
      {
      case 1: // Centered MercMan
    	  (new MercMan(frameWidth/2-50,frameHeight/2-100,100,200)).draw(g2);
 
    	  break;
    	  	
      case 2: // Four Corners
    	  (new MercMan(0,0,100,200)).draw(g2);
    	  (new MercMan(frameWidth-100,0,100,200)).draw(g2);
    	  (new MercMan(frameWidth-100,frameHeight-200,100,200)).draw(g2);
    	  (new MercMan(0,frameHeight-200,100,200)).draw(g2);
    	    break;
    	    
      case 3: // Line of Four
    	  int mmWidth = frameWidth/4;
    	  (new MercMan(0,0,mmWidth,frameHeight)).draw(g2);
    	  (new MercMan(mmWidth,0,mmWidth,frameHeight)).draw(g2);
    	  (new MercMan(2*mmWidth,0,mmWidth,frameHeight)).draw(g2);
    	  (new MercMan(3*mmWidth,0,mmWidth,frameHeight)).draw(g2);
   	  
    	    break;
    	    
      case 4: // Crowded
    	  int tinyWidth = frameWidth/10;
    	  int tinyHeight = frameHeight/10;
    	  for (int x=0; x<10; x++)
    		  for (int y=0; y<10; y++)
    			  (new MercMan(x*tinyWidth,y*tinyHeight,tinyWidth,tinyHeight)).draw(g2);
    	    break;
    	    
   /* Place holder for your code. Remove this comment and add code between 
    * the "case" and the "break".
    
      case 5:
      
      
      
            break;
    */
      default:
    	  
      }
    
   }
}