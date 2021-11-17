/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "The quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		
		//  Try other methods here:
      int notFoundPsn = sample.indexOf("slow");
      System.out.println("sample.index(\"slow\") = " + notFoundPsn);
      
      int notFoundPsn2 = sample.indexOf("brown");
      System.out.println("sample.index(\"brown\") = " + notFoundPsn2);
      
      int notFoundPsn3 = sample.indexOf("brown", 11);
      System.out.println("sample.index(\"brown\") = " + notFoundPsn3);

	}

}
