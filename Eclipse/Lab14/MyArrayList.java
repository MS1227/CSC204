import java.util.ArrayList;
import java.util.Scanner;


public class MyArrayList
{
  final static int NUM_ITEMS = 6;
  

  public static void main(String[] args)
  {
	    
        ArrayList<Integer> a = new ArrayList<Integer>();


        fillUp (a);
        
        System.out.println();

        printOut(a);

       
        
        System.out.println("\nArrayList Sum :  " + sumUp(a));
        System.out.println("Num of Positive Values :  " + posCount(a));
  }


private static void printOut(ArrayList<Integer> a) {
	    System.out.println("*** PrintOut of ArrayList ***");
	    for(int i = 0; i<a.size();i++)
	    	System.out.print(a.get(i)+" ");
	    System.out.println();
	    System.out.println("*****************************");
	
}


private static void fillUp (ArrayList<Integer> a)
  {
	    Scanner in = new Scanner(System.in);
	    int userVal = 0;
        for(int i = 0; i < 6; i++)
        {
        	System.out.print("Enter value " + (i+1) +": ");
        	userVal = in.nextInt();
        	a.add(i, new Integer(userVal));
        }



  }


    private static int sumUp (ArrayList<Integer> a)
  {
        int sumTotal = 0;
        for(int i = 0; i<a.size();i++)
        	sumTotal += a.get(i);

      
     return sumTotal;
  }


  private static int posCount (ArrayList<Integer> a)
  {
        int posCount = 0;
        for(int i = 0; i<a.size(); i++)
        {
        	if(a.get(i) > 0)
        		posCount ++;
        }


     //  Dummy line   
     return posCount;
  }
}
