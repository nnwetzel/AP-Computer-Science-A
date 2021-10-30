import java.util.Scanner;

/**
 * Created by Nat Wetzel
 */
public class QuadraticCalculator {

   public static void main(String args[]) {

      boolean done = false;
      Scanner inputScanner = new Scanner(System.in);
        
      while (!done) {

         // enter code to get the information for the equation here
         System.out.println("Please enter the three numbers you want to solve for a, b and c of a quadratic equation:");
         System.out.println("(enter all numbers with spaces, or enter quit to stop the program)");
   
         // if the first input is a string, then make sure it is time to quit
         if (inputScanner.hasNext("quit")) {
         done = true;
   
         }
         // otherwise check to see if it is something we can use, if so grab the rest of the data
         else if (inputScanner.hasNextDouble() ) {
         double a = inputScanner.nextDouble();
         double b = inputScanner.nextDouble();
         double c = inputScanner.nextDouble();
         
         // do quadratic calculation and output possible answers (there are two)
         double root1;
         double root2;
         root1 = (-b + Math.sqrt(b * b - 4 * a * c))/(2 * a);
         root2 = (-b - Math.sqrt(b * b - 4 * a * c))/(2 * a);    
         System.out.println("x1 = " + root1);
         System.out.println("x2 = " + root2);
         System.out.println();
               
         }
         // if it is none of the above, it is probably invalid input
         else {
            inputScanner.next();
         }
      }

      // we should always clean up after ourselves! Close the scanner object
      inputScanner.close();
      System.out.println("Goodbye!");
   }
}