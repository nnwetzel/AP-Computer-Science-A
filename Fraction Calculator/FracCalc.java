import java.util.Scanner;

public class FracCalc {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      boolean done = false;

      System.out.println("Welcome to Fraction Calculator.");
      System.out.println("Type \"quit\" to exit the program.\n");

      do {

         System.out.println("Please enter an equation that you want solved.");
         System.out.println("For example, \"2_1/3 + 1_1/5\".");

         String userInput = input.nextLine();

         if (userInput.equalsIgnoreCase("quit")) { // Ends program if "quit" is entered.

            done = true;
         }
         else {

            Fraction result = calculate(userInput);
            System.out.println(result.toString());
         }

      } while (!done);

      input.close();
   } 

   /**
   *  Splits the fraction and solves accordingly. 
   *  @param - the equation
   */
   public static Fraction calculate(String input) {

      Fraction result = null;

      input = input.trim().replaceAll(" +", " ");

      String[] parts = input.split(" "); // Splits the string into fraction, operand, and fraction.

      Fraction frac1 = new Fraction(parts[0]);
      String operand = parts[1];
      Fraction frac2 = new Fraction(parts[2]);

      int num = 0;
      int den = 0;

      if (operand.charAt(0) == '+') { // If the operand is addition, solves the equation accordingly.

         num = (frac1.getNum() * frac2.getDen()) + (frac2.getNum() * frac1.getDen());
         den = frac1.getDen() * frac2.getDen();
      }
      if (operand.charAt(0) == '-') { // If the operand is subtraction, solves the equation accordingly.

         num = (frac1.getNum() * frac2.getDen()) - (frac2.getNum() * frac1.getDen());
         den = frac1.getDen() * frac2.getDen();
      }
      if (operand.charAt(0) == '*') { // If the operand is multiplication, solves the equation accordingly.

         num = frac1.getNum() * frac2.getNum();
         den = frac1.getDen() * frac2.getDen();
      }
      if (operand.charAt(0) == '/') { // If the operand is division, solves the equation accordingly.

         num = frac1.getNum() * frac2.getDen();
         den = frac2.getNum() * frac1.getDen();
      }

      result = new Fraction(num, den);

      return result;
   }
}