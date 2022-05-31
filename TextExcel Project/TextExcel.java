package Code;

import java.util.Scanner;

/**
*  Nat and Safiya's TextExcel Project
*/

public class TextExcel {

   // Spreadsheet rows and columns.
   private static final int ROW = 10;
   private static final int COL = 7;
   public static final Spreadsheet mySpreadsheet = new Spreadsheet(ROW, COL);

   public static void main(String args[]) {
   
      Scanner mainScanner = new Scanner(System.in);
      boolean quit = false;
   
      // Welcome message.
      System.out.println("Welcome to TextExcel!");
         
      do {
         // Message that prompts user to enter input.
         System.out.println("Please enter a command. You may type \"help\" if you need further directions or \"quit\" if you would like to close the program.");
         String userInput = mainScanner.nextLine();
         // User input is parsed into command executor method.
         commandExecutor(userInput);
      
         // Ends program if "quit" is entered.
         if (userInput.contains("quit")) {
         
            quit = true;
            mainScanner.close();
         }
      } 
      while (quit == false);
   }
   
   /**
   *  Executes a command based on the user's input.
   *  @input - The user's input.
   */
   public static void commandExecutor(String input) {
   
      // Prints out instructions.
      if (input.contains("help")) {
      
         printInstructions(input);
      }
      // Assigns data to reference.
      else if (input.contains(" = ")) {
            
         String[] parts = input.split(" = ");
         String cellLocation = parts[0];
         String cellData = parts[1];
         
         int rowLocation = mySpreadsheet.getRowLocation(cellLocation);
         int colLocation = mySpreadsheet.getColLocation(cellLocation);
         
         mySpreadsheet.addToSpreadsheet(rowLocation, colLocation, cellData);
         
      }
      // Prints out the value of a cell.
      else if (mySpreadsheet.isCell(input)) {
         
         int rowLocation = mySpreadsheet.getRowLocation(input);
         int colLocation = mySpreadsheet.getColLocation(input);
         
         Cell myCell = new Cell(mySpreadsheet.getCellData(rowLocation, colLocation));
         System.out.println(input + " = " + myCell.toString());
      }
      else if (input.contains("sort")) {
         
         String cellLocation = input;
         mySpreadsheet.rangeEvaluation(cellLocation);
      }
      // Clears the spreadsheet.
      else if (input.contains("clear")) {
      
         // Clears entire spreadsheet.
         if (input.equals("clear")) {
         
            mySpreadsheet.clearSpreadsheet();
         }
         // Clears a range of the spreadsheet.
         else if (input.contains("-")) {
         
            String cellLocation = input;
            mySpreadsheet.rangeEvaluation(cellLocation);
         }
         // Clears specific cell of the spreadshe1et.
         else {
         
            String cellLocation = input.substring(6);
            
            int rowLocation = mySpreadsheet.getRowLocation(cellLocation);
            int colLocation = mySpreadsheet.getColLocation(cellLocation);
         
            mySpreadsheet.clearSpecificCell(rowLocation, colLocation);
         }
      }  
      
      // Prints out the spreadsheet.
      else if (input.equals("print")) {
         
         mySpreadsheet.printSpreadsheet();
      }
      // Prints out goodbye message.
      else if (input.equals("quit")) {
      
         System.out.println("Thank you for using our Text Excel program. Goodbye!");
      }
      
      // Prints error message if input is incorrectly entered.
      else {
         
         System.out.println("You have entered invalid input.");
      }
   }
   
   /**
   *  Prints out instructions for the user.
   */
   public static void printInstructions(String command) {
   
      if (command.equals("help")) {
         System.out.println("Help Guide");
         System.out.println("Commands can be written as follows:\n");
         System.out.println("clear - This command will empty a cell or range of cells that will be set to \"empty\" when printed out.");
         System.out.println("Example - clear (will clear all values in the chart), clear A7 (will clear the value stored in A7), clear F2-F6 (will clear the values in all cells between and including F2 and F6).\n");
         System.out.println("= - When using a =, you can set a given cell to a value and store data inside. This can be in the form of a number, formula (use parenthesis), or sentence (use quotation marks).");
         System.out.println("Example - C3 = 8 (Set's the value pf C3 to 8), G9 = 7 * 8 - 9 (sets the value of G9 as the value of this formulae. When printed out, will print out the formulae), D5 = \"rain\" (sets D5 to rain).\n");
         System.out.println("sum - This command will allow for you to add multiple (number) cells together");
         System.out.println("Example - ( sum G7 & B7 ) (will find the sum of the two cells and print the result), ( sum A8 - D10 ) (will add all number cells betweeen and including A8 and D10 and print out the result).\n");
         System.out.println("avg - This command will calculate the average of the number cells that you specify");
         System.out.println("Example - ( avg G1 - G7 ) (will find the average of all values between and including G1 and G7) ( avg F4 - A4 ) (will calculate the average of he values in F4 and A4 if they are both values).\n");
         System.out.println("If you would like to quit the program, please type quit when prompted to enter a command.");
      }
      else if (command.equals("help =")) {
      
         System.out.println("= - When using a =, you can set a given cell to a value and store data inside. This can be in the form of a number, formula (use parenthesis), or sentence (use quotation marks).\n");
      }
      else if (command.equals("help clear")) {
      
         System.out.println("clear - This command will empty a cell or range of cells that will be set to \"empty\" when printed out.");
         System.out.println("Example - clear (will clear all values in the chart), clear A7 (will clear the value stored in A7), clear F2-F6 (will clear the values in all cells between and including F2 and F6).\n");
      }
      else if (command.equals("help sum")) {
      
         System.out.println("sum - This command will allow for you to add multiple numeric cells together.");
         System.out.println("Example - ( sum G7 & B7 ) (will find the sum of the two cells and print the result), ( sum A8 - D10 ) (will add all number cells betweeen and including A8 and D10 and print out the result).\n");
      }
      else if (command.equals("help avg")) {
      
         System.out.println("avg - This command will calculate the average of the number cells that you specify.");
         System.out.println("Example - ( avg G1 - G7 ) (will find the average of all values between and including G1 and G7), ( avg F4 & A4 ) (will calculate the average of he values in F4 and A4 if they are both values).\n");
      }
      else if (command.equals("help sort")) {
         System.out.println("sort - This command will sort a rectangular range of cells in either ascending or descending order.");
         System.out.println("Example - sorta A1-C10 (will sort the range of cells into ascending order), sortd C7-G10 (will sort the range of cells into descending order).");
      }
   }
}