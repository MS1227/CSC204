
/*
 * Bob Allen
 * Spring 2016
 * GraphicDemo is a simple example file demonstrating some of
 * Java's basic graphic classes.  This file creates a frame and
 * puts a SimpleGraphics inside.  SimpleGraphics demonstrates: 
 * Rectangle, Ellipse, and Line.
 */

import javax.swing.JFrame;

public class GraphicDemo {

	public static void main(String[] args) {
	      JFrame frame = new JFrame();

	      frame.setSize(500, 500);
	      frame.setTitle("Some graphic shapes");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      SampleGraphics component = new SampleGraphics();
	      frame.add(component);

	      frame.setVisible(true);
	}

}
