public class CanadianTranslator {

   private String strToBeAdded;
   private String strToBeTranslated;
   
   /**
   Assigns the string inteded to be added a value
   @param the string intended to be added
   */
   public CanadianTranslator(String s) {
      strToBeAdded = s;
   }
   
   /**
   Returns the string intended to be translated combined with the string inteded to be added after replacing about with aboot
   @param the string intended to be translated
   @return the post-translated string
   */
   public String translate(String strToBeTranslated) {
   
      strToBeTranslated = strToBeTranslated.replace("about", "aboot");
      return strToBeTranslated + strToBeAdded;
   }
}