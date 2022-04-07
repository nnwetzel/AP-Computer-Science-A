public class BankAccount {

   public static final double MINIMUM_BALANCE = 50.0;
   public String accountHolder;
   private double balance;
   
   public BankAccount(String accountHolder) {
   
      this(accountHolder, MINIMUM_BALANCE);
   }
   
   
   public BankAccount(String accountHolder, double startingBalance) {
   
      this.accountHolder = accountHolder;
      balance = startingBalance;
   }
   
   /**
   *  Adds to balance.
   *  @amount - The amount added to the balance.
   */
   public double deposit(double amount) {
   
      balance += amount;
      
      System.out.println(accountHolder + "'s new balance after a withdraw of " + amount + " is:");
      return balance;
   }
   
   /**
   *  Takes away from balance.
   *  @amount - The amount taken away from balance.
   */
   public double withdraw(double amount) {
   
      double tempBalance = balance - amount;
      
      if (tempBalance < MINIMUM_BALANCE) {
         
         tempBalance = -1;
         System.out.println("You have insufficent funds for this withdraw.");
         
      }
      else {
      
         balance = tempBalance;
         
      }
      System.out.println(accountHolder + "'s new balance after a withdraw of " + amount + " is:");
      return balance;
   }
   
   /**
   *  Returns balance.
   *  @balance - The balance.
   */
   public double getBalance() {
   
      return balance;
   
   }
}