import java.util.*;

public class FracCalc {
	
	public static void main(String[] args) {
		
		// main variables for the user input and loop control
		Scanner console_input = new Scanner(System.in);
		boolean done = false;

		// Instructions
		// TODO: Make these instructions your own - making sure to explain what the user needs to do
		System.out.println("Enter a fraction equation for me to calculate");
		System.out.println("(I.E.: 2_1/3 + 1_1/5)");
		System.out.println("Type \"quit\" to exit the program.");
		
		// Calculator
		do {

			// Get the input from the user
			System.out.println("Please enter your fraction to be calculated (i.e.: 2_1/3 + 1_1/5)");
			String user_input = console_input.nextLine();
			
			if (user_input.equalsIgnoreCase("quit") )
			{
				done = true;
			}
			else
			{
				Fraction result = calculate(user_input);
				System.out.println(result);
			}
			
		// Exit condition met?  If not go around again!
		} while (!done);
		
		console_input.close();
		
	} // end main
	
	public static Fraction calculate(String input) {
		
		// a fraction object to hold the resultant fraction
		Fraction result = null;
		
		// TODO: Split the user input into the components (f1 op f2)
		
		// TODO: Do the calculation based on the operator
		
		// TODO: Create the resultant Fraction and return it
		
		return result;
		
	} // end calculate
	
} // end FracCalc class