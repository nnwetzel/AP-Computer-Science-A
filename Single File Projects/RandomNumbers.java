import java.util.Random;

// RandomNumbers outputs 6 lines of random numbers between 1-50
public class RandomNumbers {

   public static void main (String[] args) {
   
   // Assigns randomizer value of 51 (won't print 51 but numbers 50 or less) (no magic numbers)
   int randomizer = 2;
   // Uses Math.random() to assign variables a number between 1-50
   int a = (int)(Math.random() * randomizer);
   int b = (int)(Math.random() * randomizer);
   int c = (int)(Math.random() * randomizer);
   
   // Uses the Random class to assign variables a number between 1-50
   Random gen = new Random();
   int d = gen.nextInt(randomizer);
   int e = gen.nextInt(randomizer);
   int f = gen.nextInt(randomizer);
   
   // Outputs variables
   System.out.println(a);
   System.out.println(b);
   System.out.println(c);
   System.out.println(d);
   System.out.println(e);
   System.out.println(f);
   
   }
}