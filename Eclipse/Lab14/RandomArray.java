import java.util.ArrayList;
import java.util.Random;


public class RandomArray {

	public static void main(String[] args) {
		ArrayList<Integer> random = new ArrayList<Integer> ();
		Random r = new Random();
		for(int i = 0; i<50; i++)
		{
			random.add((new Integer (r.nextInt(41)+10)));
		}
		for(int i = 0; i < random.size(); i++)
		{
			if(i%10 == 0) System.out.println();
		System.out.print(random.get(i) + "\t ");
			
			
		}
	}

}
