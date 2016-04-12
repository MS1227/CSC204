
public class ArrayExample {

	public static void main(String[] args) {
		System.out.println("a1 before playing....");
		int a1 [] = {1, 2, 3, 4, 5};
		
		printArray(a1);
		
		int a2 [] = new int [a1.length+1];
		System.out.println("looking at a2 before playing.....");
		printArray(a2);
		
		for(int i = 0; i<a1.length; i++)
		{
			a2[i] = a1[i];
		}
		System.out.println("After copying of a1 into a2");
		printArray(a2);
		a2[5] = 6;
		printArray(a2);
		
		a1 = a2; //a1 refers to a2
		System.out.println("a1 after the update");
		printArray(a2);
		a1 = grow(a1,7);
		System.out.println("After testing grow.....");
		printArray(a1);
		for( int val = 10; val < 100; val+=10)
		{
			a1 = grow(a1, val);
			printArray(a1);
		}
	}
		

	private static int[] grow(int[] a1, int newVal) {
		int []newArray = new int[a1.length +1 ];
		for(int i = 0; i <a1.length; i++)
		{
			newArray[i]=a1[i];
		}
		newArray[newArray.length-1] = newVal;
		return newArray;
	}


	private static void printArray(int[] theArray) {
		for(int i = 0; i<theArray.length;i++)
		{
			System.out.print(theArray[i]+" ");
			
			
		}
		System.out.println();
	}

}