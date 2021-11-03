public class CalifornianTranslator {

   private String addedString;
   private String keyword1 = "is";
   private String keyword2 = "are";

   /**
      Constructs CalifornianTranslator object
      @param the string intended to be added
   */
   public CalifornianTranslator(String s) {
      addedString = s;
   }
   
   /**
      Returns the string intended to be translated and if keywords are detected, the string intended to be added is added after the keyword. Replaces extra space with a single space.
      @param the string intended to be translated
      @return the translated string
   */
   public String translate(String translatedString) {
      
      translatedString = translatedString.replace(keyword1, keyword1 + addedString);
      translatedString = translatedString.replace(keyword2, keyword2 + addedString);
      return translatedString.replaceAll("\\s+", " ");
   }
}
