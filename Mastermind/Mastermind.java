import java.util.Random;

public class Mastermind {

   int randomizer = 7;
   
   int firstGen;
   int secondGen;
   int thirdGen;
   int fourthGen;
   
   int correctNum;
   int correctSpot;
   
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
   *  Returns the amount of correct numbers after comparing the user's guess with the generated integers.
   *  @param firstGuess the user's first guess
   *  @param secondGuess the user's second guess
   *  @param thirdGuess the user's third guess
   *  @param fourthGuess the user's fourth guess
   *  @return the amount of correct numbers
   */
   public int correctNumChecker(int firstGuess, int secondGuess, int thirdGuess, int fourthGuess) {
   
      if (firstGuess == getFirstGen()
      || secondGuess == getFirstGen()
      || thirdGuess == getFirstGen()
      || fourthGuess == getFirstGen()) {
      
         correctNum++;
      }
      
      if (firstGuess == getSecondGen()
      || secondGuess == getSecondGen()
      || thirdGuess == getSecondGen()
      || fourthGuess == getSecondGen()) {
      
         correctNum++;
      }
      
      if (firstGuess == getThirdGen()
      || secondGuess == getThirdGen()
      || thirdGuess == getThirdGen()
      || fourthGuess == getThirdGen()) {
      
         correctNum++;
      }
      
      if (firstGuess == getFourthGen()
      || secondGuess == getFourthGen()
      || thirdGuess == getFourthGen()
      || fourthGuess == getFourthGen()) {
      
         correctNum++;
      }
      return correctNum;
   }
   
   /**
   *  Sets the correct number counter to 0.
   *  @return the amount of correct numbers
   */
   public int resetCorrectNum() {
      correctNum = 0;
      return correctNum;
   }
   
   /**
   *  Returns the amount of integers in the correct spot after comparing the user's guess with the generated integers.
   *  @param firstGuess the user's first guess
   *  @param secondGuess the user's second guess
   *  @param thirdGuess the user's third guess
   *  @param fourthGuess the user's fourth guess
   *  @return the amount of integers in the correct spot
   */  
   public int correctSpotChecker(int firstGuess, int secondGuess, int thirdGuess, int fourthGuess) {
      if (firstGuess == getFirstGen()) {
         correctSpot++;
      }
      
      if (secondGuess == getSecondGen()) {
         correctSpot++;
      }
      
      if (thirdGuess == getThirdGen()) {
         correctSpot++;
      }
      
      if (fourthGuess == getFourthGen()) {
         correctSpot++;
      }
      return correctSpot;
   }
   
   /**
   *  Sets the correct spot counter to 0.
   *  @return the amount of integers in the correct spot
   */
   public int resetCorrectSpot() {
      correctSpot = 0;
      return correctSpot;
   }

   /**
   *  Checks and see if all of the user's guesses match up with the generated integers.
   *  @param firstGuess the user's first guess
   *  @param secondGuess the user's second guess
   *  @param thirdGuess the user's third guess
   *  @param fourthGuess the user's fourth guess
   */
   public boolean winCondition(int firstGuess, int secondGuess, int thirdGuess, int fourthGuess) {
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