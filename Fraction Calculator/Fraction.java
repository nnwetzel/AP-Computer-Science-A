public class Fraction {
   
   private int numerator;
   private int denominator;

   /**
   
   
   */
   public Fraction(String fraction) {
   
      if (fraction.contains("_") && fraction.contains("/")) { // Parses the fraction if it is a mixed number.
      
         int whole = Integer.parseInt(fraction.substring(0, fraction.indexOf('_')));
         numerator = Integer.parseInt(fraction.substring(fraction.indexOf('_') + 1, fraction.indexOf('/')));
         denominator = Integer.parseInt(fraction.substring(fraction.indexOf('/') + 1));
         
         numerator += Math.abs(whole) * denominator;
         
         if (whole < 0) {
            
            numerator *= -1;
            
         }
      }
      else if (fraction.contains("/")) { // Parses the fraction.
         
         numerator = Integer.parseInt(fraction.substring(0, fraction.indexOf('/')));
         denominator = Integer.parseInt(fraction.substring(fraction.indexOf('/') + 1));
         
         if (numerator > 0 && denominator < 0) {
            
            numerator *= -1;
            denominator = Math.abs(denominator);
         }
      }
      else { // Parses the fraction if it is a whole number.
         numerator = Integer.parseInt(fraction);
         denominator = 1;
      }
   
   }

   public Fraction(int numerator, int denominator) {
   
      this.numerator = numerator;
      this.denominator = denominator;
   }
  
   public int getNum() { // Returns numerator.
   
      return numerator;
   }
   
   public int getDen() { // Returns denominator.
   
      return denominator;
   }
   
   public String toString() {
   
      int whole = 0;
      String output = "";
   
      for (int i = Math.abs(numerator); i >= 1; i--) { // Finds the GCD of two fractions and reduces them.
      
         if (Math.abs(numerator) % i == 0 && Math.abs(denominator) % i == 0) {
         
            int gcd = i;
            numerator /= gcd;
            denominator /= gcd;
         }
      }
   
      if (numerator < 0 && denominator < 0) { // Transforms the fraction into a positive fraction if numerator and denominator are negative.
      
         numerator = Math.abs(numerator);
         denominator = Math.abs(denominator);
      }
      
      if (Math.abs(numerator) > Math.abs(denominator)) { // Transforms and formats the fraction into a mixed number if it is improper.
      
         if (numerator < 0 || denominator < 0) { // If the numerator or denominator is negative, transforms the fraction accordingly.
         
            numerator = Math.abs(numerator);
            denominator = Math.abs(denominator);
         
            whole = numerator / denominator;
            numerator %= denominator; 
         
            whole *= -1;
         }
         else {
         
            whole = numerator / denominator;
            numerator %= denominator;
         }
         output = whole + "_" + numerator + "/" + denominator; 
      }
      else if (Math.abs(numerator) < Math.abs(denominator)) { // Formats the fraction if it is not improper.
      
         output = numerator + "/" + denominator;
      }
      
      if (denominator == 1) { // If the denominator is 1, formats the fraction accordingly.
         
         output = numerator + "";
      }
      if (numerator == 0) { // If the numerator is 0, formats the fraction accordingly.
         
         output = whole + "";
      }
      return output;
   }
}