import java.util.ArrayList;
import java.util.Random;


public class RandomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randGen = new Random();
		 ArrayList<Integer> random = new ArrayList<Integer> ();
		 
		 for (int i=0; i<50; i++)
			 random.add(randGen.nextInt(41)+10);
		 
		 System.out.println(random);
		 // Print them in table form
		 for (int i=0; i<random.size(); i++)
		 {
			 if (i%10 == 0) System.out.println();
			 System.out.print(random.get(i) + "\t");
		 }
	}

}
