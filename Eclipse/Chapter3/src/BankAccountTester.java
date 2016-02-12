/**
   A class to test the BankAccount class.
*/
public class BankAccountTester
{
   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      BankAccount harrysChecking = new BankAccount(0);
      harrysChecking.deposit(2000);
      harrysChecking.withdraw(501);
      System.out.println("$"+harrysChecking.getBalance());
      System.out.println("Expected: 2500");
      
      BankAccount harrysSavings = new BankAccount(1000);
      harrysSavings.deposit(501);
      System.out.println("Harry's Checking: $"+harrysChecking.getBalance());
      System.out.println("Harry's Savings: $"+harrysSavings.getBalance());
      harrysChecking.transfer(500, harrysSavings);
      System.out.println("Harry's Checking: $"+harrysChecking.getBalance());
      System.out.println("Harry's Savings: $"+harrysSavings.getBalance());
      
      
   }
}
