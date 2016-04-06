import java.util.Random;


public class RandomArray {
	static Random rand;
	static int randVal;
	public static void main(String[] args) {
	
		int [] random = new int [50];

		for(int i=0; i<random.length; i++)
		{
			
			random[i] = (int)(Math.random()*42)+9;
		}
		
			for(int i = 0; i<random.length; i++)
			{
			System.out.printf("%-5d", random[i]);
			if((i+1)%10 == 0 && i>0)
				System.out.println();
			}
	}

}
