

	import java.util.Scanner;

	import javax.swing.JFrame;


	public class MakeSpokesInWheel {

		public static void main(String[] args) {
				
			Scanner in = new Scanner(System.in);
			System.out.print("Dim for spokes frame: ");
			int dim = in.nextInt();
			int lines;
			do
			{
			System.out.print("Lines (1-100)? ");
			lines = in.nextInt();
			} while (lines <= 0 || lines > 1000);
			
			      JFrame frame = new JFrame();

			      frame.setSize(dim, dim);
			      frame.setTitle("Spokes in a wheel");
			      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			      Spokes component = new Spokes(lines);
			      frame.add(component);

			      frame.setVisible(true);
			

		}


		}





