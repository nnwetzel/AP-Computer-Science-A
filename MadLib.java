import java.util.Scanner;

class MadLib {

   String r1;
   String r2;
   String r3;
   String r4;
   String r5;
   String madlib1;
   
   /*
      Prompts the user to enter five responses, setting them as variables.
      @param the user's input
   **/
   MadLib() {
      Scanner MadLib = new Scanner(System.in);
      
      System.out.println("Enter a noun:");
      r1 = MadLib.nextLine();
      System.out.println("Enter a past-tense verb:");
      r2 = MadLib.nextLine();
      System.out.println("Enter a name:");
      r3 = MadLib.nextLine();
      System.out.println("Enter a vehicle:");
      r4 = MadLib.nextLine();
      System.out.println("Enter a food:");
      r5 = MadLib.nextLine(); 
   } 
   
   /*
      Returns the madlib after replacing the format specifiers with variables.
      @return the madlib
   **/
   public String toString() {
      return madlib1 = String.format("I went to school with my %s, however my teacher said it wasn't allowed so I %s her and ran out of the classroom. I called\n%s. When they arrived, I got into their %s and they drove me home. Once I arrived, I ran inside and grabbed some %s out\nof the refridgerator.", r1, r2, r3, r4, r5);
   } 
}
