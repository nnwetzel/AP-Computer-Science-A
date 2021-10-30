public class CalifornianTranslator {

private String strToBeAdded;
private String strToBeTranslated;
private String keyword1 = "are";
private String keyword2 = "is";

   public CalifornianTranslator(String s) {
      strToBeAdded = s;
   }

      public String translate(String strToBeTranslated) {
      // Objective: If "is" or are" is detected, add strToBeAdded after it in strToBeTranslated
      
      strToBeTranslated = strToBeTranslated.replace(keyword2, keyword2 + strToBeAdded); // This does not work.
      strToBeTranslated = strToBeTranslated.replace(keyword1, keyword1 + strToBeAdded);
      return strToBeTranslated;
   }
}
