
public class Test {

	public static void main(String[] args) {
		int [] N = {5,3,-6,1,0};
		
		for(int i = 0; i < N.length; i++)
		{
		System.out.println(N[i]);
		}
		System.out.println(sumUp(N));
	}

	private static int sumUp(int [] a) {
		
		int sum = 0;
		
		for(int i=0; i<a.length;i++)
		{
			sum += a[i];
		}
		return sum;
	}

}