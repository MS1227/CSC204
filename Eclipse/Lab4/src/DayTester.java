public class DayTester
{
   public static void main(String[] args)
   {
      Day today = new Day(2016, 2, 3); // February 15, 2010
      Day later = new Day(2016, 12, 25);
      System.out.println(later.getYear());
      System.out.println("Expected: 2010");
      System.out.println(later.getMonth());
      System.out.println("Expected: 3");
      System.out.println(later.getDate());
      System.out.println("Expected: 13");
      System.out.println(later.daysFrom(today)); 
      System.out.println("Expected: 30");
   }
}
