import java.util.*;

public class Fraction {
   
   private int numerator;
   private int denominator;
   private int operand;

   public Fraction(String fraction) {
      // TODO: parse the fraction into the numerator and denominator
      // e.g., -8_1/5
      
      if (fraction.contains("_") && fraction.contains("/")) { // 
      
         int whole = Integer.parseInt(fraction.substring(0, fraction.indexOf('_'))); // -8
         numerator = Integer.parseInt(fraction.substring(fraction.indexOf('_') + 1, fraction.indexOf('/'))); // 1
         denominator = Integer.parseInt(fraction.substring(fraction.indexOf('/') + 1)); // 5
         
         if (whole < 0) { // true
         
            whole = whole * -1; // 8
            numerator += whole * denominator; // 41
            numerator = numerator * -1; // -41
         
         }
         else {
         
            numerator += whole * denominator;
            
         }
      
      }
      else if (fraction.contains("/")) {
      
         numerator = Integer.parseInt(fraction.substring(0, fraction.indexOf('/')));
         denominator = Integer.parseInt(fraction.substring(fraction.indexOf('/') + 1));
      
      }
      else {
      
         numerator = Integer.parseInt(fraction);
         denominator = 1; 
      }
      
   } // end Fraction constructor

   public Fraction(int numerator, int denominator) {
      // TODO: store the numerator and denominator sent in into this object's data
      this.numerator = numerator;
      this.denominator = denominator;
   } // end Fraction constructor
   
   public int getNum() {
   
      return numerator;
      
   }
   
   public int getDen() {
   
      return denominator;
   
   }

   
   public String toString(){
      
      // The string that stores the formatted output for this class when printed
      String output = numerator + "/" + denominator;
   
      // TODO: make this reduce the fraction and create the string to return
      
      // return the formatted string
      return output;
      
   } // end toString

} // end Fraction class