import java.util.Random;

public class DiceRoll {

   public static final int NUM_ROLLS = 1000;
   public static final int NUM_SIDES = 6;
   
   // Possible values when there are 2 die
   public static final int NUM_POSSIBLE_VALUES = (NUM_SIDES * 2) - 1;
   
   // Minimum possible value
   public static final int MIN_VALUE_STORED = 2;
   
   public static void main(String[] args) {
   	
   	// Store counts of the possible values
      int [] dieValues = new int[NUM_POSSIBLE_VALUES];

      Random randGen = new Random();
   	
   	// Roll a die a certain amount of times, incrementing the counts
      for (int i = 0; i < NUM_ROLLS; i++) {
      
         // nextInt(n) gives a number from 0 to n-1, so we adjust it to 1-6
         int rolledNum1 = randGen.nextInt(NUM_SIDES);
         int rolledNum2 = randGen.nextInt(NUM_SIDES);
         
         dieValues[(rolledNum1 + rolledNum2)]++;
      }
   	
   	// Print out the stored values
      for (int i = 0; i < NUM_POSSIBLE_VALUES; i++) {
      
         System.out.println("Number of " + (i + MIN_VALUE_STORED) + "'s: " + dieValues[i]);
      }
   }
}