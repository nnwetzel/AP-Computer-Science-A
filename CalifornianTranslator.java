public class CalifornianTranslator {

private String strToBeAdded;
private String strToBeTranslated;

   public CalifornianTranslator(String s) {
      strToBeAdded = s;
   }

      public String translate(String strToBeTranslated) {
      // Objective: If "is" or are" is detected, add strToBeAdded after it in strToBeTranslated

      return strToBeTranslated + strToBeAdded;
   }
}
