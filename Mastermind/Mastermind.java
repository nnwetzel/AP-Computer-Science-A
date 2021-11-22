import java.util.Random;

public class Mastermind {

   int randomizer = 7;
   
   int firstGen;
   int secondGen;
   int thirdGen;
   int fourthGen;
   
   int firstGuess;
   int secondGuess;
   int thirdGuess;
   int fourthGuess;
   
   /**
   *  Sets firstGen, secondGen, thirdGen, fourthGen as a random integer that is not 0 or repeated.
   */
   public void randomize() {
   
      Random gen = new Random();
      
      do {
         firstGen = gen.nextInt(randomizer);
      }
         while (firstGen == 0);
      
      do {
         secondGen = gen.nextInt(randomizer);
      }
         while (secondGen == 0
         || secondGen == firstGen);
         
      do {
         thirdGen = gen.nextInt(randomizer);
      }
         while (thirdGen == 0
         || thirdGen == firstGen
         || thirdGen == secondGen);
          
      do {
         fourthGen = gen.nextInt(randomizer);
      }
         while (fourthGen == 0
         || fourthGen == firstGen
         || fourthGen == secondGen
         || fourthGen == thirdGen);
   }
   /**
   *  Returns the first generated integer.
   *  @return the first generated integer
   */
   public int getFirstGen() {
      return firstGen;
   }
   
   /**
   *  Returns the second generated integer.
   *  @return the second generated integer
   */
   public int getSecondGen() {
      return secondGen;
   }
   
   /**
   *  Returns the third generated integer.
   *  @return the third generated integer
   */
   public int getThirdGen() {
      return thirdGen;
   }
   
   /**
   *  Returns the fourth generated integer.
   *  @return the fourth generated integer
   */
   public int getFourthGen() {
      return fourthGen;
   }
   
   
   /**
   *  Sets the user's first guess as firstGuess.
   *  @param firstGuess the user's first guess
   */
   public void setFirstGuess (int firstGuess) {
      this.firstGuess = firstGuess;
   }
   
   /**
   *  Sets the user's second guess as secondGuess.
   *  @param secondGuess the user's second guess
   */
   public void setSecondGuess (int secondGuess) {
      this.secondGuess = secondGuess;
   }

   /**
   *  Sets the user's third guess as thirdGuess.
   *  @param thirdGuess the user's third guess
   */
   public void setThirdGuess (int thirdGuess) {
      this.thirdGuess = thirdGuess;
   }

   /**
   *  Sets the user's fourth guess as fourthGuess.
   *  @param fourthGuess the user's fourth guess
   */
   public void setFourthGuess (int fourthGuess) {
      this.fourthGuess = fourthGuess;
   }

   /**
   *  Compares the user's guess with the generated integers and reports if they are in the correct spot or is a correct number (but in the wrong spot).
   */
   public void guessChecker() {
   
      if (firstGuess == getSecondGen()
         || firstGuess == getThirdGen()
         || firstGuess == getFourthGen()) {
         
         System.out.println(firstGuess + " is a correct number, but in the wrong spot.");
      }
      if (secondGuess == getFirstGen()
         || secondGuess == getThirdGen()
         || secondGuess == getFourthGen()) {
         System.out.println(secondGuess + " is a correct number, but in the wrong spot.");
      }
      if (thirdGuess == getFirstGen()
         || thirdGuess == getSecondGen()
         || thirdGuess == getFourthGen()) {
         System.out.println(thirdGuess + " is a correct number, but in the wrong spot.");
      }
      if (fourthGuess == getFirstGen()
         || fourthGuess == getSecondGen()
         || fourthGuess == getThirdGen()) {
         System.out.println(fourthGuess + " is a correct number, but in the wrong spot.");
      }
      
      if (firstGuess == getFirstGen()) {
         System.out.println(firstGuess + " is in the correct spot.");
      }
      
      if (secondGuess == getSecondGen()) {
         System.out.println(secondGuess + " is in the correct spot.");
      }
      
      if (thirdGuess == getThirdGen()) {
         System.out.println(thirdGuess + " is in the correct spot.");
      }
      
      if (fourthGuess == getFourthGen()) {
         System.out.println(fourthGuess + " is in the correct spot.");
      }
   }
   
   /**
   *  Returns the user's first guess.
   *  @return the user's first guess
   */
   public int getFirstGuess() {
      return firstGuess;
   }
   
   /**
   *  Returns the user's second guess.
   *  @return the user's second guess
   */
   public int getSecondGuess() {
      return secondGuess;
   }
   
   /**
   *  Returns the user's third guess.
   *  @return the user's third guess
   */
   public int getThirdGuess() {
      return thirdGuess;
   }
   
   /**
   *  Returns the user's fourth guess.
   *  @return the user's fourth guess
   */
   public int getFourthGuess() {
      return fourthGuess;
   }
   
   /**
   *  If all of the user's guesses match up with the generated integers, return true.
   */
   public boolean winCondition() {
      if (firstGuess == getFirstGen()
      && secondGuess == getSecondGen()
      && thirdGuess == getThirdGen()
      && fourthGuess == getFourthGen()) {
         return true;
      }
      else {
         return false;
      }
   }
}