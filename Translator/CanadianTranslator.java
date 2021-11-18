public class CanadianTranslator {

   private String addedString;
   
   /**
      Constructs CanadianTranslator object
      @param the string intended to be added
   */
   public CanadianTranslator(String s) {
      addedString = s;
   }
   
   /**
      Returns the string intended to be translated combined with the string intended to be added. Replaces "about" with "aboot".
      @param the string intended to be translated
      @return the translated string
   */
   public String translate(String translatedString) {

      translatedString = translatedString.replace("about", "aboot");
      translatedString = translatedString.replace("About", "Aboot");
      translatedString = translatedString.replace("ABOUT", "ABOOT");
      return translatedString + addedString;
   }
}