import java.util.*;

public class FracCalc {
	
   public static void main(String[] args) {
   	
   	// main variables for the user input and loop control
      Scanner input = new Scanner(System.in);
      boolean done = false;
   
   	// Instructions
   	// TODO: Make these instructions your own - making sure to explain what the user needs to do
      System.out.println("Welcome to Fraction Calculator.");
      System.out.println("Type \"quit\" to exit the program.\n");
      
   	
   	// Calculator
      do {
      
      	// Get the input from the user
         System.out.println("Please enter an equation that you want solved.");
         System.out.println("For example, \"2_1/3 + 1_1/5\".");

         String userInput = input.nextLine();

         if (userInput.equalsIgnoreCase("quit") )
         {
            done = true;
         }
         else
         {
            Fraction result = calculate(userInput);
            System.out.println(result.toString());
         }
      	
      // Exit condition met?  If not go around again!
      } while (!done);
   	
      input.close();
   	
   } // end main
	
   public static Fraction calculate(String input) {
   	
   	// a fraction object to hold the resultant fraction
      
      Fraction result = null;
   	
   	// TODO: Split the user input into the components (f1 op f2)
   
      input = input.trim().replaceAll(" +", " ");
   
      String[] parts = input.split(" ");
      
      Fraction frac1 = new Fraction(parts[0]);
      String operand = parts[1];
      Fraction frac2 = new Fraction(parts[2]);
   	
   	// TODO: Do the calculation based on the operator
      int num = 0;
      int den = 0;
      
      if (operand.contains("+")) {
      
         num = (frac1.getNum() * frac2.getDen()) + (frac2.getNum() * frac1.getDen());
         den = frac1.getDen() * frac2.getDen();
      }
      if (operand.contains("-")) {
      
         num = (frac1.getNum() * frac2.getDen()) - (frac2.getNum() * frac1.getDen());
         den = frac1.getDen() * frac2.getDen();
      }
      if (operand.contains("*")) {
      
         num = frac1.getNum() * frac2.getNum();
         den = frac1.getDen() * frac2.getDen();
      }
      if (operand.contains("/")) {
      
         num = frac1.getNum() * frac2.getDen();
         den = frac2.getNum() * frac1.getDen();
      }
   	// TODO: Create the resultant Fraction and return it
      result = new Fraction(num, den);
   	
      return result;
   	
   } // end calculate
	
} // end FracCalc class