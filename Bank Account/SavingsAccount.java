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
   
   public void deposit(double amount) {
   
      super.deposit(amount);
      
      double balance = super.getBalance();
      double interest = 0;
      
      if (balance > MAX_AMOUNT_FOR_HIGH_INTEREST) {
      
         interest = MAX_AMOUNT_FOR_HIGH_INTEREST * INTEREST_RATE_REST;
         
      
      } 
      else {
      
         interest = balance * MAX_AMOUNT_FOR_HIGH_INTERST;
      
      }
   }
}