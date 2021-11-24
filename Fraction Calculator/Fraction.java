public class Fraction {
    
    private int numerator;
    private int denominator;

    public Fraction(String fraction) {
        // TODO: parse the fraction into the numerator and denominator

    } // end Fraction constructor

    public Fraction(int numerator, int denominator) {
        // TODO: store the numerator and denominator sent in into this object's data

    } // end Fraction constructor

    
    public String toString(){
        
        // The string that stores the formatted output for this class when printed
        String output = numerator + "/" + denominator;

        // TODO: make this reduce the fraction and create the string to return
        
        // return the formatted string
        return output;
        
    } // end toString

} // end Fraction class