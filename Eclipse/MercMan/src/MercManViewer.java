import javax.swing.JFrame;
/*
 * MercMan Viewer Main by Matt Schnider
 * Due February 15, 2016
 */

public class MercManViewer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 JFrame frame = new JFrame();
	      frame.setSize(400, 550);
	      frame.setTitle("Matt's MercMan");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      MercMan component = new MercMan();
	      frame.add(component);

	      frame.setVisible(true);

	}

}