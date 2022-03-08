public class BankAccountTester {

   public static void main(String[] args) {
   
      BankAccount joe = new BankAccount("Joe Smith");
      BankAccount chris = new BankAccount("Chris Christopherson", 5000.0);
      SavingsAccount frank = new SavingsAccount("Frank Jones", 3500);
      
      double newBalance = frank.withdraw(500, SavingsAccount.MINIMUM_BALANCE);
      System.out.println("Frank's new balance after a withdrawl of 500 is: " + newBalance);
      
      newBalance = joe.withdraw(500, BankAccount.MINIMUM_BALANCE);
      System.out.println("Joe's new balance after a withdrawl of 500 is: " + newBalance);
   }

}