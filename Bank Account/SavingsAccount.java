public class SavingsAccount extends BankAccount {

   public static final double INTEREST_RATE_FIRST_500 = 0.005;
   public static final double INTEREST_RATE_REST = 0.00001;
   
   public static final double MAX_AMOUNT_FOR_HIGH_INTEREST = 500;
   
   public SavingsAccount(String accountHolder) {
   
      super(accountHolder, 0);
   }
   
   public SavingsAccount(String accountHolder, double startingBalance) {
   
      super(accountHolder, startingBalance);   
   }
   
   /**
   *  Takes away from the balance.
   *  @amount - The amount taken away from the balance.
   *  @minBal - The minimum balance required for the withdraw.
   */
   public double withdraw(double amount, double minBal) {
   
      double balance = super.getBalance();
      
      if (balance < minBal) {
      
         System.out.println("You have insufficent funds for this withdraw.");
      }
      else {
      
         super.withdraw(amount);
         balance = super.getBalance();
      }

      return balance;
   }
   
   /**
   *  Adds to balance. Calculates and adds interest to balance.
   *  @amount - The amount added to the balance.
   *  @minBal - The minimum balance for the deposit.
   */
   public double deposit(double amount, double minBal) {
      
      double balance = super.getBalance();
      
      if (balance < minBal) {
      
         System.out.println("You have insufficent funds for this withdraw.");
      }
      else {
      
         super.deposit(amount);
         balance = super.getBalance();
      }
   
      double interest = 0;
      
      if (balance > MAX_AMOUNT_FOR_HIGH_INTEREST) {
      
         interest = MAX_AMOUNT_FOR_HIGH_INTEREST * INTEREST_RATE_REST;
         
      } 
      else {
      
         interest = balance * MAX_AMOUNT_FOR_HIGH_INTEREST;
      
      }

      return balance + (balance * interest);
   }
}