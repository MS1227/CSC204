import java.util.Scanner;

import javax.swing.JFrame;

public class CowMein {

	
	public static void main(String[] args) {
		int poop;
		Scanner in = new Scanner(System.in);
		
		System.out.println("How full is your cow? ");
		poop = in.nextInt();
		
		JFrame frame = new JFrame();

	      frame.setSize(800, 600);
	      frame.setTitle("Sh!tty Cow");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      Cow betsy = new Cow(poop);
	      
	      frame.add(betsy);
	      betsy.shit();
	      
	      frame.setVisible(true);
	}
	}


