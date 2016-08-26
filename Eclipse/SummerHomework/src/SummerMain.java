import java.util.Scanner;

public class SummerMain {

	public static void main(String[] args)
	{
	 Scanner in = new Scanner(System.in); //Scanner for reading in data from the user.
	 System.out.print("Please type a word or sentence: ");
	 String word = new String(in.nextLine()); //The object, word, is instantiated and initialized with the user input.
	 
        System.out.println(word);
	
		
	 
	 Stringy test = new Stringy(word); //A new stringy object, test, is instantiated and passed the object, word.
	 System.out.println();
	 
	 
	test.revString(); //revString method call.
	test.countVowels(); //countVowels method call.
	test.isPalindrome(); //isPalindrome method call.
	test.wordCount();
	
	System.out.println();
	System.out.println("- word test ended successfully - "); // Message to tell the user all testing is complete.
	
	 
		
	}

}
