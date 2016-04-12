import java.awt.Color;

/**
 * This is some example code that plays around with merging
 * two pictures together based upon the color green.  You pick 
 * a background image and then a foreground image. Wherever 
 * "green" is not found in the foreground, that pixel is placed 
 * at the corresponding pixel in the background.
 * 
 * This program uses the Picture class from our textbook.
 *   
 * @author Bob Allen
 * @version Beta
 *
 */
public class PlayWithGreenScreen {

	public static void main(String[] args) {

	// Prompt and get a background picture
		System.out.println("Pick a BACKGROUND Picture.");
		Picture bgPic = new Picture();
		bgPic.pick();

	// Prompt and get a foreground picture
		System.out.println("Pick a FOREGROUND Picture.");
		Picture fgPic = new Picture();
		fgPic.pick();
		
	// Determine the smaller width and height
		int minWidth = bgPic.getWidth();
		if (minWidth > fgPic.getWidth())
			minWidth = fgPic.getWidth();
		
		int minHeight = bgPic.getHeight();
		if (minHeight > fgPic.getHeight())
			minHeight = fgPic.getHeight();
		
	// Loop over each pixel in the (minWidth,minHeight) region of each picture
		int w,h;
		for (w=0; w<minWidth; w++)
		{
			for (h=0; h<minHeight; h++)
			{
				// Get the 'current' pixel for the foreground picture
				Color fgPixel = fgPic.getColorAt(w,h);
								
				// Get the RGB values for the foreground picture
				int r = fgPixel.getRed();
				int g = fgPixel.getGreen();
				int b = fgPixel.getBlue();
				
				// Now we have to decide if the foreground's
				// 'green' is green enough to swap it for the
				// background pixel.
				
				if(!(g>215 && r<25 && b<25))  // THIS IS WHERE YOU DECIDE IF IT IS NOT GREEN
					bgPic.setColorAt(w,h,fgPixel);
					
					
			}
		}

	}

}