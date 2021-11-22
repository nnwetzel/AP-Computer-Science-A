import java.util.Scanner;

public class MastermindTester {

   public static void main(String args[]) {
   
      int amountOfRounds = 12;
      int i = 0;
      char choice;
   
      Mastermind mastermind = new Mastermind();
      
      Scanner in = new Scanner(System.in);
   
      do {
      
         mastermind.randomize(); // Generates 4 different random integers.
         System.out.println("Enter four different numbers in between 1-6: ");
         
         do {
         
            int firstGen = mastermind.getFirstGen();
            int secondGen = mastermind.getSecondGen();
            int thirdGen = mastermind.getThirdGen();
            int fourthGen = mastermind.getFourthGen();
            
            int firstGuess = in.nextInt();
            mastermind.setFirstGuess(firstGuess);
            int secondGuess = in.nextInt();
            mastermind.setSecondGuess(secondGuess);
            int thirdGuess = in.nextInt();
            mastermind.setThirdGuess(thirdGuess);
            int fourthGuess = in.nextInt();
            mastermind.setFourthGuess(fourthGuess);
            
            mastermind.guessChecker(); // Reports on whether the user's guess is in the correct spot or is a correct number (but in the wrong spot).
            
            i++;
               
            if (mastermind.winCondition()) { // If the win condition is met, overload i so the loop ends. 
               
               System.out.print("\nYou have won. ");
               i = amountOfRounds + 1;
            }
            
            if (i == amountOfRounds) { // If the user uses all of the rounds they are given to guess the number, they have lost.
            
               System.out.print("\nYou have lost. ");
            }
         }
            while (i < amountOfRounds);
         
         System.out.println("Would you like to play again? (y/n)");
         choice = in.next().charAt(0);
         
         if (choice == 'y') {
            i = 0; // Resets the loop.
         }
      
      }
         while (choice == 'y');
   }
}