import java.util.Scanner;

public class MagicSquareMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in) ;
		
		Matrix test1 = new Matrix();
		int userVal;
		
		for(int r=0; r<test1.size(); r++)
		{
		
			for(int c=0; c<test1.size(); c++)
				{
				userVal = 0;
				System.out.print("Please input row"+" "+(r+1)+","+" column"+" "+(c+1)+":");
				userVal = in.nextInt();
				test1.add(r, c, userVal);
				}
		}
		System.out.println();
		System.out.println("The matrix has the values:");
		for(int r=0; r<test1.size(); r++)
			{
		
				for(int c=0; c<test1.size(); c++)
					{System.out.print(test1.getVal(r, c)+" ");
					if(c == 2)
					{
					System.out.println();
					}
		}
	}
		test1.isMagicSquare();
	}
}
