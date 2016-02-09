import javax.swing.JFrame;


public class FourCircleViewer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  JFrame frame = new JFrame();
		  frame.setSize(500,500);
		  frame.setTitle("Four Circles");
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  
		  // Create the Centered Circle
		  FourCircles fc = new FourCircles();
		  frame.add(fc);
		  
		 // Show Circle in the frame
		  frame.setVisible(true);

	}

}
