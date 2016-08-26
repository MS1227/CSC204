import java.util.regex.Pattern;

public class Stringy {
	
private int vCount;	
private String word;
private String palindrome;
private char a,e,i,o,u,y;
private char [] cArray;
private char[] revCArray;

Stringy(String a)
{
	word = a;
}
//A method to reverse a string
public void revString() {
	

	revCArray = new char[word.length()]; //Array of Chars initialized to the length of the users word.
	cArray = word.toCharArray(); //Word that is passed in is put into an array called cArray.
    
	for(int r = cArray.length-1, rev = 0; r>0 || rev<cArray.length; r-- ,rev++)//For loop takes the last letter in cArray 
		                                                                       //and puts it in the first letter of revCArray.
	{
		revCArray[rev] = cArray[r];
	}
	
	System.out.print("Your reversed word is: " ); //Reversed array is printed out.
	System.out.println(revCArray);
}
//A method to count the number of vowels in the inputed string.
public void countVowels() {
    a = 'a';   //Chars initialized with the corresponding vowel letters for use in testing for vowels.
    e = 'e';
    o = 'o';
    u = 'u';
    i = 'i';
    y = 'y';
    word = word.toLowerCase(); //toLowerCase method used to eliminate multiple testing for capital letters.
	for(int index = 0; index < word.length(); index++ )//For loop tests all chars in string and increments vCount if a match is found.
	{
		if(word.charAt(index) == a || word.charAt(index) == e || word.charAt(index) == i || word.charAt(index) == o || word.charAt(index) == u || word.charAt(index) == y)
			vCount++;
		
	}
	System.out.println("The number of vowels is: " + vCount); //vCount is printed out.
	
}
//A method to determine if the inputed word is a palindrome.
public void isPalindrome() {
	palindrome = String.copyValueOf(revCArray); //The value of the char array, revCArray, is copied into a string, palindrome, for comparison.
	if(word.contentEquals(palindrome) == true)// if the content of word is equal to palindrome, the result is true, else the result is false.
	{
		System.out.println("Your word is a palindrome!"); //true result prints this statement out.
	}
	else 
	{
		System.out.println("Your word is not a palindrome."); //false result prints this statement out.
	}
	
}
//A method to count the number of words in the users input.
public void wordCount() {
	word.trim();
	String p = "\\w+";
	Pattern pattern = Pattern.compile(p);
	System.out.println(pattern.matcher(word));
	
	
}

 	
}
