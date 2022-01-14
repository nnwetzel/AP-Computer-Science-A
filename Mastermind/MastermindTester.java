import java.util.Scanner;

public class MastermindTester {

   public static final int AMOUNT_OF_ROUNDS = 12;

   public static void main(String args[]) {
   
      boolean replay = true;
   
      Mastermind mastermind = new Mastermind();
      
      Scanner in = new Scanner(System.in);
   
      do {
      
         mastermind.randomize(); // Generates 4 different random integers.
         System.out.println("Enter four different numbers in between 1-6: ");
         int i = 0;
         
         do {
         
            int firstGen = mastermind.getRandomNum1(); // Sets firstGen as the first generated integer.
            int secondGen = mastermind.getRandomNum2(); // Sets secondGen  as the second generated integer.
            int thirdGen = mastermind.getRandomNum3(); // Sets thirdGen as the third generated integer.
            int fourthGen = mastermind.getRandomNum4(); // Sets fourthGen as the fourth generated integer.
            
            int guess1 = in.nextInt();
            int guess2 = in.nextInt();
            int guess3 = in.nextInt();
            int guess4 = in.nextInt();
            
            System.out.println("There are " + mastermind.correctNumChecker(guess1, guess2, guess3, guess4) + " integers that are correct."); // Reports on the amount of integers that are correct.
            mastermind.resetCorrectNum(); // Resets the correct number counter.
            System.out.println("There are " + mastermind.correctSpotChecker(guess1, guess2, guess3, guess4) + " integers that are in the correct spot."); // Reports on the amount of integers that are in the correct spot.
            mastermind.resetCorrectSpot(); // Resets the correct spot counter.
            
            i++;
            
            if (mastermind.winCondition(guess1, guess2, guess3, guess4)) { // Checks if the win condition has been met.
               
               System.out.print("\nYou have won. ");
               i = AMOUNT_OF_ROUNDS + 1; // Overloads the round counter so the loop ends. 
            }
            
            if (i == AMOUNT_OF_ROUNDS) { // Checks if the user has used all the amount of rounds.
               
               System.out.println("\nThe correct answer was: " + firstGen + " " + secondGen + " " + thirdGen + " " + fourthGen);
               System.out.print("\nYou have lost. ");
            }
         }
            while (i < AMOUNT_OF_ROUNDS); // Ends the loop when the user has either used up all the amount of rounds or has won.
         
         System.out.println("Would you like to play again? (y/n)");
         char choice = in.next().charAt(0);
         
         if (choice == 'n') {
            replay = false;
         }
      
      }
         while (replay); // If the user wants to play again, redo the loop.
   }
}