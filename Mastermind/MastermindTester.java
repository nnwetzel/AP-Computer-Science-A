import java.util.Scanner;

public class MastermindTester {

   public static void main(String args[]) {
   
      int amountOfRounds = 12;
      char choice;
      boolean replay = true;
   
      Mastermind mastermind = new Mastermind();
      
      Scanner in = new Scanner(System.in);
   
      do {
      
         mastermind.randomize(); // Generates 4 different random integers.
         System.out.println("Enter four different numbers in between 1-6: ");
         int i = 0;
         
         do {
         
            int firstGen = mastermind.getFirstGen(); // Sets firstGen as the first generated integer.
            int secondGen = mastermind.getSecondGen(); // Sets secondGen  as the second generated integer.
            int thirdGen = mastermind.getThirdGen(); // Sets thirdGen as the third generated integer.
            int fourthGen = mastermind.getFourthGen(); // Sets fourthGen as the fourth generated integer.
            
            int firstGuess = in.nextInt();
            int secondGuess = in.nextInt();
            int thirdGuess = in.nextInt();
            int fourthGuess = in.nextInt();
            
            System.out.println("There are " + mastermind.correctNumChecker(firstGuess, secondGuess, thirdGuess, fourthGuess) + " integers that are correct."); // Reports on the amount of integers that are correct.
            mastermind.resetCorrectNum(); // Resets the correct number counter.
            System.out.println("There are " + mastermind.correctSpotChecker(firstGuess, secondGuess, thirdGuess, fourthGuess) + " integers that are in the correct spot."); // Reports on the amount of integers that are in the correct spot.
            mastermind.resetCorrectSpot(); // Resets the correct spot counter.
            
            i++;
            
            if (mastermind.winCondition(firstGuess, secondGuess, thirdGuess, fourthGuess)) { // Checks if the win condition has been met.
               
               System.out.print("\nYou have won. ");
               i = amountOfRounds + 1; // Overloads the round counter so the loop ends. 
            }
            
            if (i == amountOfRounds) { // Checks if the user has used all the amount of rounds.
               
               System.out.println("\nThe correct answer was: " + firstGen + " " + secondGen + " " + thirdGen + " " + fourthGen);
               System.out.print("\nYou have lost. ");
            }
         }
            while (i < amountOfRounds); // Ends the loop when the user has either used up all the amount of rounds or has won.
         
         System.out.println("Would you like to play again? (y/n)");
         choice = in.next().charAt(0);
         
         if (choice == 'n') {
            replay = false;
         }
      
      }
         while (replay); // If the user wants to play again, redo the loop.
   }
}