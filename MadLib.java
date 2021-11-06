import java.util.Scanner;

class MadLib {

   String madlibTemplate;

   /*
      Receives the user's input as variables and replaces the specifiers to display the completed madlib.
      @param   fillIn1 - the user's first response
      @param   fillIn2 - the user's second response
      @param   fillIn3 - the user's third response
      @param   fillIn4 - the user's fourth response
      @param   fillIn5 - the user's fifth response
   **/
   MadLib(String fillIn1, String fillIn2, String fillIn3, String fillIn4, String fillIn5) {

      madlibTemplate = String.format("I went to school with my %s, however my teacher said it wasn't allowed so I %s her and ran out of the classroom. I called\n%s. When they arrived, I got into their %s and they drove me home. Once I arrived, I ran inside and grabbed some %s out\nof the refridgerator.", fillIn1, fillIn2, fillIn3, fillIn4, fillIn5);
   } 

   /*
      Returns the completed madlib.
      @return  the completed madlib
   **/
   public String toString() {
      return madlibTemplate;
   } 
}