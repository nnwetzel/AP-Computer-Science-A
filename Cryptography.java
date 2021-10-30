public class Cryptography
{
   private static final int ROTATIONS = 13;  // Modifying this value changes the extent to which the letters are rotated
   private static final int ALPHABET = 26;

   public Cryptography() { 
   }

   /**
   Returns the letter as a number after converting it to a zero based number
   @param each letter
   @return the letter as a number
   */
   public int convertToNumbers(char letter) {
      int letterAsNumber = letter - 'A';
      return ((int) letterAsNumber);
   }

   /**
   Returns the letter after converting it into a zero based number, rotating the number according to ROTATIONS, and then converting it back into a letter
   @param each letter
   @return the letter rotated
   */
   public char applyRotation(char letter) {
      int rotatedValue = (convertToNumbers(letter) + ROTATIONS) % ALPHABET + 'A'; // Modulus power!
      return ((char) rotatedValue);
   }
}
