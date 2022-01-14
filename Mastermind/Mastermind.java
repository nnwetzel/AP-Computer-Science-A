import java.util.Random;

public class Mastermind {

   public static final int RANDOMIZER = 7;
   
   int randomNum1;
   int randomNum2;
   int randomNum3;
   int randomNum4;
   
   int correctNum;
   int correctSpot;
   
   /**
   *  Sets randomNum1, randomNum2, randomNum3, randomNum4 as a random integer that is not 0 or repeated.
   */
   public void randomize() {
   
      Random gen = new Random();
      
      do {
         randomNum1 = gen.nextInt(RANDOMIZER);
      }
         while (randomNum1 == 0);
      
      do {
         randomNum2 = gen.nextInt(RANDOMIZER);
      }
         while (randomNum2 == 0
         || randomNum2 == randomNum1);
         
      do {
         randomNum3 = gen.nextInt(RANDOMIZER);
      }
         while (randomNum3 == 0
         || randomNum3 == randomNum1
         || randomNum3 == randomNum2);
          
      do {
         randomNum4 = gen.nextInt(RANDOMIZER);
      }
         while (randomNum4 == 0
         || randomNum4 == randomNum1
         || randomNum4 == randomNum2
         || randomNum4 == randomNum3);
   }
   
   /**
   *  Returns the first generated integer.
   *  @return the first generated integer
   */
   public int getRandomNum1() {
      return randomNum1;
   }
   
   /**
   *  Returns the second generated integer.
   *  @return the second generated integer
   */
   public int getRandomNum2() {
      return randomNum2;
   }
   
   /**
   *  Returns the third generated integer.
   *  @return the third generated integer
   */
   public int getRandomNum3() {
      return randomNum3;
   }
   
   /**
   *  Returns the fourth generated integer.
   *  @return the fourth generated integer
   */
   public int getRandomNum4() {
      return randomNum4;
   }

   /**
   *  Returns the amount of correct numbers after comparing the user's guess with the generated integers.
   *  @param guess1 the user's first guess
   *  @param guess2 the user's second guess
   *  @param guess3 the user's third guess
   *  @param guess4 the user's fourth guess
   *  @return the amount of correct numbers
   */
   public int correctNumChecker(int guess1, int guess2, int guess3, int guess4) {
   
      if (guess1 == getRandomNum1()
      || guess2 == getRandomNum1()
      || guess3 == getRandomNum1()
      || guess4 == getRandomNum1()) {
      
         correctNum++;
      }
      
      if (guess1 == getRandomNum2()
      || guess2 == getRandomNum2()
      || guess3 == getRandomNum2()
      || guess4 == getRandomNum2()) {
      
         correctNum++;
      }
      
      if (guess1 == getRandomNum3()
      || guess2 == getRandomNum3()
      || guess3 == getRandomNum3()
      || guess4 == getRandomNum3()) {
      
         correctNum++;
      }
      
      if (guess1 == getRandomNum4()
      || guess2 == getRandomNum4()
      || guess3 == getRandomNum4()
      || guess4 == getRandomNum4()) {
      
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
   *  @param guess1 the user's first guess
   *  @param guess2 the user's second guess
   *  @param guess3 the user's third guess
   *  @param guess4 the user's fourth guess
   *  @return the amount of integers in the correct spot
   */  
   public int correctSpotChecker(int guess1, int guess2, int guess3, int guess4) {
      if (guess1 == getRandomNum1()) {
         correctSpot++;
      }
      
      if (guess2 == getRandomNum2()) {
         correctSpot++;
      }
      
      if (guess3 == getRandomNum3()) {
         correctSpot++;
      }
      
      if (guess4 == getRandomNum4()) {
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
   *  @param guess1 the user's first guess
   *  @param guess2 the user's second guess
   *  @param guess3 the user's third guess
   *  @param guess4 the user's fourth guess
   */
   public boolean winCondition(int guess1, int guess2, int guess3, int guess4) {
      if (guess1 == getRandomNum1()
      && guess2 == getRandomNum2()
      && guess3 == getRandomNum3()
      && guess4 == getRandomNum4()) {
         return true;
      }
      else {
         return false;
      }
   }
}