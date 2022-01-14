import java.util.Scanner;

public class HangmanTester {

   public static void main(String[] args) {
   
      boolean replay = true;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Welcome to Hangman!");
      
      while (replay) {
      
         Hangman h = new Hangman();
         System.out.println("You have a total of " + h.AMOUNT_OF_GUESSES + " guesses.");
      
         while (h.count < h.AMOUNT_OF_GUESSES && !h.decodedWord.equals(h.word)) {
         
            System.out.println("");
            System.out.println("Please enter a letter: ");
            String guess = input.next().toLowerCase();
            
            // Checks if the user's input is a single letter.
            boolean guessIsValid = Character.isLetter(guess.charAt(0)) && guess.length() == 1;
            
            if (guessIsValid) {
            
               h.hangmanGame(guess.charAt(0));
            }
            else {
               System.out.println("Invalid input.");
            }
         }
         
         System.out.println("Would you like to play again? (y/n)");
         char choice = input.next().charAt(0);
         
         if (choice == 'n') {
            replay = false;
         }
      }
      input.close();
   }
}