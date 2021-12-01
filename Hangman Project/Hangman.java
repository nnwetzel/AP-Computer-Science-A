public class Hangman {

   private static String[] words = { "weird","handkerchief","bandwagon","computer","sphynx", "france", "automobile", "puppy", "blizzard" };
   public static String word;
   public static String decodedWord;
   public static int amountOfRounds = 6;
   public static int count = 0;

   public Hangman() {

      word = words[(int) (Math.random() * words.length)]; // Selects a random word from the array.
      decodedWord  = new String(new char[word.length()]).replace("\0", "*"); // Creates a decoded version of the selected word.
      count = 0;
   }

   /**
   *  Compares the user's guess with the selected word by checking each letter.
   *  When the user's guess is a letter that is in the selected word, the decoded version of the selected word is updated to show the user where the letter they have guessed is located.
   *  When the user's guess is not a letter that is in the selected word, the decoded version of the selected word is updated with asterisks.
   *  Prints out whether the user has won or lost the game.
   *  When the updated version of the selected word is the same with the selected word, the user has successfully guessed the word.
   *  When the user has used up all their guesses, the user has lost.
   *  @param the user's guess
   */
   public static void wordChecker(String guess) {

      String updatedDecodedWord = "";
      
      for (int i = 0; i < word.length(); i++) {
         if (word.charAt(i) == guess.charAt(0)) {
            updatedDecodedWord += guess.charAt(0);
         } 
         else if (decodedWord.charAt(i) != '*') {
            updatedDecodedWord += word.charAt(i);
         } 
         else {
            updatedDecodedWord += "*";
         }
      }

      if (decodedWord.equals(updatedDecodedWord)) {
         count++;
      } else {
         decodedWord = updatedDecodedWord;
      }
      if (decodedWord.equals(word)) {
         System.out.print("You have won. ");
      }
      if (count == amountOfRounds) {
         System.out.print("The correct was: " + word + "\n\nYou have lost. ");
      }
   }
}