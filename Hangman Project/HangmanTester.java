import java.util.Scanner;

public class HangmanTester {

   public static void main(String[] args) {

      boolean replay = true;
      Scanner input = new Scanner(System.in);
      
      System.out.println("Welcome to hangman!");

      do {

         Hangman hangman = new Hangman();

         do {
            System.out.println("Please enter a letter: ");
            System.out.println(hangman.decodedWord);
            String guess = input.next();
            hangman.wordChecker(guess);
         }
         while (hangman.count < hangman.amountOfRounds && hangman.decodedWord.contains("*"));

         System.out.println("Would you like to play again? (y/n)");
         char choice = input.next().charAt(0);
         if (choice == 'n') {
            replay = false;
         }
      }
      while(replay);
      
      input.close();
   }
}