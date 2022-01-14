import java.util.ArrayList;

public class Hangman {

   public static final int AMOUNT_OF_GUESSES = 6;
   
   private static String[] words = { "weird","handkerchief","bandwagon","computer","sphynx", "france", "automobile", "puppy", "blizzard", "soccer", "programming" };
   private static ArrayList<Character> guessList = new ArrayList();
   public static String word;
   public static String decodedWord;
   public static int count;


   public Hangman() {
   
      // Clears the list of guesses.
      guessList.clear();
      // Selects a random word from the words array.
      word = words[(int) (Math.random() * words.length)];
      // Creates a decoded version of the selected word.
      decodedWord  = new String(new char[word.length()]).replace("\0", "*");
      // Sets the count to 0.
      count = 0;
   }
   
   /**
   *  Creates a decoded version of a generated word and updates it based on the user's guess.
   *  If the user incorrectly guesses a letter, the user will lose a guess.
   *  If the user has already guessed a letter, a list of all the user's guesses will be printed.
   *  Then a message will be printed regarding how many guesses the user has left.
   *  Once the user has guessed the word or has used up all their guesses, the method ends.
   *  @param - the user's guess
   */
   public static void hangmanGame(char guess) {
   
      String updatedDecodedWord = "";
   
      // Checks if the user's guess matches every letter in the word.
      // If the user has successfully guessed a letter, '*' will be replaced with the guess in the correct location.
      for (int i = 0; i < word.length(); i++) { 
         if (word.charAt(i) == guess) {
            updatedDecodedWord += guess;
         }
         else if (decodedWord.charAt(i) != '*') {
            updatedDecodedWord += word.charAt(i);
         }
         else {
            updatedDecodedWord += "*";
         }
      }
      
      // If the user has made no correct guesses, the user will lose a guess.
      if (decodedWord.equals(updatedDecodedWord) && !guessList.contains(guess)) {
         count++;
      }
      // If the user has correctly guessed atleast once, the decoded word has to be updated..
      else {
         decodedWord = updatedDecodedWord;
      }
   
      System.out.println(decodedWord);
      
      // Checks if the user's has used up all their guesses and the word hasn't been revealed.
      if (count < AMOUNT_OF_GUESSES && !decodedWord.equals(word)) {
         
         // If the guess is in the list of guesses, prints a list of the user's guesses.
         if (guessList.contains(guess)) {
            System.out.println("You have already guessed: " + guessList.toString().replace("[","").replace("]",""));
         
         }
         // If the guess is a correct guess and not on the list of guesses, prints an appropriate message and adds the guess to the list.
         else if (!guessList.contains(guess) && word.contains(String.valueOf(guess))) {
         
            System.out.println("Correct.");
            guessList.add(guess);
         }
         // If the guess is an incorrect guess, prints an appropriate message and adds the guess to the list.
         else {
            System.out.println("Incorrect.");
            guessList.add(guess);
         }   
            
         // Prints out the amount of guesses the user has.
         if ((AMOUNT_OF_GUESSES - count) == 1) {
            System.out.println("You have " + (AMOUNT_OF_GUESSES - count) + " guess left.");
         }
         else {
            System.out.println("You have " + (AMOUNT_OF_GUESSES - count) + " guesses left.");
         }
      
      }
      // If the user has successfully guessed the word, prints an appropriate message.
      else if (decodedWord.equals(word)) {
         System.out.print("You have won. ");
      }
      // If the user has used up all their guesses, prints an appropriate message.
      else if (count == AMOUNT_OF_GUESSES) {
         System.out.print("The correct word was: " + word + "\nYou have lost. ");
      }
   }
}