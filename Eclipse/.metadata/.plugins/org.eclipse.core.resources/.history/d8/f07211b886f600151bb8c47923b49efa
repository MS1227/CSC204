//Student

import java.util.Scanner;

import javax.swing.JFrame; 

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
	int count;

	public GraphicsRunner()
	{
		super("Graphics Runner");
		setSize(WIDTH,HEIGHT);
		Scanner in = new Scanner(System.in);
		
		System.out.print("Number of rows & columns: ");
		count = in.nextInt();
		
		
						
		getContentPane().add(new RandomColoredBoxes(count));					
						
		
				
		setVisible(true);
	}
	
	public static void main( String args[] )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}