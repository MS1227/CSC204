import java.util.Scanner;

import javax.swing.JFrame;


public class LoopDemo {

	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);
		System.out.print("Dim: ");
		int dim = in.nextInt();
		int lines;
		do
		{
		System.out.print("Lines (1-100)? ");
		lines = in.nextInt();
		} while (lines <= 0 || lines > 100);
		
		      JFrame frame = new JFrame();

		      frame.setSize(dim, dim);
		      frame.setTitle("Looping Graphics");
		      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		      LoopingGraphics component = new LoopingGraphics(lines);
		      frame.add(component);

		      frame.setVisible(true);
		

	}


	}


