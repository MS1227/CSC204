public class CounterDemo
{
   public static void main(String[] args)
   {
      Counter tally = new Counter(0);
      
      tally.click();
      tally.click();
      tally.click();
      tally.click();
      System.out.println("Right now the value is: "+tally.getValue());
      
      Counter clicker = new Counter(tally.getValue());
      System.out.println("Clicker has a value of: "+ clicker.getValue());
      
      
      tally.click();
      tally.click();
      clicker.click();
      clicker.click();
      clicker.click();
      tally.click();
      tally.click();
      tally.click();
      
      int result = tally.getValue(); // Sets result to 2
      System.out.print("Tally result: ");
      System.out.println(result);
      System.out.println("clicker value is: "+clicker.getValue());
   }
}
