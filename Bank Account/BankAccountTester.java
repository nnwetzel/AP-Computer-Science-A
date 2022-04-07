public class BankAccountTester {

   public static void main(String[] args) {
   
      BankAccount joe = new BankAccount("Joe Smith");
      BankAccount chris = new BankAccount("Chris Christopherson", 5000.0);
      SavingsAccount reyna = new SavingsAccount("Reyna Davis", 8750.5);
      SavingsAccount frank = new SavingsAccount("Frank Jones", 3500);
        
      double newBalance = joe.deposit(500);
      System.out.println(newBalance);
      
      newBalance = chris.withdraw(1000);
      System.out.println(newBalance);
      
      newBalance = reyna.withdraw(500, SavingsAccount.MINIMUM_BALANCE);
      System.out.println(newBalance);
      
      newBalance = frank.deposit(750, SavingsAccount.MINIMUM_BALANCE);
      System.out.println(newBalance);
      
   
   
   }

}