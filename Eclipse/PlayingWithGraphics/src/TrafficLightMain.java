
/*
 * Bob Allen
 * Spring 2016
 * GraphicDemo is a simple example file demonstrating some of
 * Java's basic graphic classes.  This file creates a frame and
 * puts a SimpleGraphics inside.  SimpleGraphics demonstrates: 
 * Rectangle, Ellipse, and Line.
 */

import javax.swing.JFrame;

public class TrafficLightMain {

	public static void main(String[] args) {
	      JFrame frame = new JFrame();

	      frame.setSize(500, 800);
	      frame.setTitle("Traffic Light");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      TrafficLight component = new TrafficLight();
	      frame.add(component);

	      frame.setVisible(true);
	}

}
