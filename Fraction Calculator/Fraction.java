import java.util.*;

public class Fraction {
   
   private int numerator;
   private int denominator;
   private int whole;

   public Fraction(String fraction) {
      // TODO: parse the fraction into the numerator and denominator
      // e.g., -8_1/5
      
      if (fraction.contains("_") && fraction.contains("/")) { // 
      
         whole = Integer.parseInt(fraction.substring(0, fraction.indexOf('_'))); // -8
         numerator = Integer.parseInt(fraction.substring(fraction.indexOf('_') + 1, fraction.indexOf('/'))); // 1
         denominator = Integer.parseInt(fraction.substring(fraction.indexOf('/') + 1)); // 5
      
         numerator += Math.abs(whole) * denominator;
         
         if (whole < 0) {
         
            numerator *= -1;
         
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
      System.out.println("1: " + numerator + "/" + denominator);
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


   public String toString() {
      
      // The string that stores the formatted output for this class when printed
   
      String output = "";
   
      // TODO: make this reduce the fraction and create the string to return
      System.out.println("2: " + numerator + "/" + denominator);
      for (int i = Math.abs(numerator); i >= 1; i--) {
      
         if (Math.abs(numerator) % i == 0 && Math.abs(denominator) % i == 0) {
         
            int gcd = i;
            numerator /= gcd;
            denominator /= gcd;
         
            System.out.println("GCD: " + gcd);
         
         }
      }
   
      System.out.println("3: " + numerator + "/" + denominator);
      if (numerator < 0 && denominator < 0) { 
      
         numerator = Math.abs(numerator);
         denominator = Math.abs(denominator);
      
      }
      
      if (Math.abs(numerator) > Math.abs(denominator)) {
      
         if (numerator < 0 || denominator < 0) {
         
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
      else if (Math.abs(numerator) < Math.abs(denominator)) {
      
      
         if (numerator < 0 || denominator < 0) {
         
            numerator *= -1;
         }
      
         output = numerator + "/" + denominator;
      
      }
      
      if (denominator == 1) {
      
         output = numerator + "";
      
      }
      
      if (numerator == 0) {
      
         output = whole + "";
         
      }
      
   
   
      // return the formatted string
      System.out.println("4: " + numerator + "/" + denominator);
      return output;
      
   } // end toString

} // end Fraction class