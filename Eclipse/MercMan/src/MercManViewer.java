import javax.swing.JFrame;
/*
 * MercMan Viewer Main by Matt Schnider
 * Due February 15, 2016
 */

public class MercManViewer {

	public static void main(String[] args) {
		
		
		  JFrame frame = new JFrame(); //Creates a new object, frame, of the JFrame class.
	      frame.setSize(400, 550);     //Sets JFrame size to 400px x 550px.
	      frame.setTitle("Matt's MercMan"); //Sets JFrame title to Matt's MercMan
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Terminates program on window close

	      MercMan component = new MercMan(); //Instantiates an object called component of the MercMan class.
	      frame.add(component); //Adds the new component to the JFrame

	      frame.setVisible(true); //Makes the frame visible.

	}

}
