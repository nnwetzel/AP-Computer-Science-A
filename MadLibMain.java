import java.util.Scanner;

public class MadLibMain {

   public static void main( String args[] ) {

      Scanner systemInput = new Scanner(System.in);

      System.out.println("Enter a noun:");
      String fillIn1 = systemInput.nextLine();
      System.out.println("Enter a past-tense verb:");
      String fillIn2 = systemInput.nextLine();
      System.out.println("Enter a name:");
      String fillIn3 = systemInput.nextLine();
      System.out.println("Enter a vehicle:");
      String fillIn4 = systemInput.nextLine();
      System.out.println("Enter a food:");
      String fillIn5 = systemInput.nextLine(); 

      MadLib madlibObj = new MadLib(fillIn1, fillIn2, fillIn3, fillIn4, fillIn5);

      System.out.println(madlibObject.toString());
   }
}