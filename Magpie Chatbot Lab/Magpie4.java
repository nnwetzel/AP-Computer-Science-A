/**
 * A program to carry on conversations with a human user.
 * This version:
 *<ul><li>
 * 		Uses advanced search for keywords 
 *</li><li>
 * 		Will transform statements as well as react to keywords
 *</li></ul>
 * @author Laurie White
 * @version April 2012
 *
 */
public class Magpie4
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */	
   public String getGreeting()
   {
      return "Hello, let's talk.";
   }
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
   public String getResponse(String statement) {
      String response = "";
      if (statement.length() == 0) {
         response = "Say something, please.";
      }
      
      else if (findKeyword(statement, "no") >= 0) {
         response = "Why so negative?";
      }
      else if (findKeyword(statement, "mother") >= 0
      		|| findKeyword(statement, "father") >= 0
      		|| findKeyword(statement, "sister") >= 0
      		|| findKeyword(statement, "brother") >= 0) {
         response = "Tell me more about your family.";
      }
      
      // Responses which require transformations
      else if (findKeyword(statement, "I want to", 0) >= 0) {
         response = transformIWantToStatement(statement);
      }
      
      else if (findKeyword(statement, "I want", 0) >= 0) {
         response = transformIWantStatement(statement);
      }
      
      else
      {
      	// Look for a two word (you <something> me) pattern
         if (findDoubleKeyword(statement, "you", "me")) {
            response = transformYouMeStatement(statement);
         }
         // Look for a two word (I <something> you) pattern
         else if (findDoubleKeyword (statement, "I", "you")) {
            response = transformIYouStatement(statement);
         }
         
         else {
            response = getRandomResponse();
         }
      }
      
      return response;
   }
   
   
   
   /**
	 * Returns true if the statement contains the first keyword follow by the second keyword.
	 * @param statement the user statement, assumed to contain two keywords
    * @param firstKeyword the first word to searches for
    * @param secondKeyord the second word to searches for
	 */
   private boolean findDoubleKeyword (String statement, String firstWord, String secondWord) { 
      int psn = findKeyword(statement, firstWord, 0);
      
      return (psn >= 0 && findKeyword(statement, secondWord, psn) >= 0);
   }
   
   /**
	 * Take a statement with "I want <something>." and transform it into 
	 * "Would you be really happy if you had <something>?"
	 * @param statement the user statement, assumed to contain "I want"
	 * @return the transformed statement
	 */
   private String transformIWantStatement(String statement) {
   
      return transformSingleStatement(statement, "I want", "Would you really be happy if you had ", "?");
   }
	
	/**
	 * Take a statement with "I want to <something>." and transform it into 
	 * "What would it mean to <something>?"
	 * @param statement the user statement, assumed to contain "I want to"
	 * @return the transformed statement
	 */
   private String transformIWantToStatement(String statement) {
   
      return transformSingleStatement(statement, "I want to ", "What would it mean to ", "?");
   }
   
   /**
	 * Take a statement with "I <something> you" and transform it into 
	 * "Why do you <something> me?"
	 * @param statement the user statement, assumed to contain "I" followed by "you"
	 * @return the transformed statement
	 */
   private String transformIYouStatement(String statement) {
   
      return transformDoubleStatement(statement, "I", "you", "Why do you ", " me?");
   }

	/**
	 * Take a statement with "you <something> me" and transform it into 
	 * "What makes you think that I <something> you?"
	 * @param statement the user statement, assumed to contain "you" followed by "me"
	 * @return the transformed statement
	 */
   private String transformYouMeStatement(String statement) {
   
      return transformDoubleStatement(statement, "you", "me", "What makes you think that I ", " you?");
   }
	
   /**
	 * Take a statement and transforms the string after a specified keyword into a new statement, with a string before and after.
    * @param keyword the phrase to searches for
    * @param statementBefore the statement added before the statement within keywords
    * @param statementAfter the statement added after the statement within keywords
	 * @return the transformed statement
	 */
   public String transformSingleStatement(String statement, String keyword, String statementBefore, String statementAfter) {
   
   	//  Remove the final period, if there is one
      statement = statement.trim();
      String lastChar = statement.substring(statement
         	.length() - 1);
      if (lastChar.equals(".")) {
         statement = statement.substring(0, statement
            	.length() - 1);
      }
      int psn = findKeyword (statement, keyword, 0);
      String restOfStatement = statement.substring(psn + keyword.length()).trim();
      
      return statementBefore + restOfStatement + statementAfter;
   }
   
	/**
	 * Take a statement and transforms the string within two specified keywords into a new statement, with a string before and after.
    * @param firstKeyword the first phrase to search for
    * @param secondKeyord the second phrase to search for
    * @param statementBefore the statement added before the statement within keywords
    * @param statementAfter the statement added after the statement within keywords
	 * @return the transformed statement
	 */
   public String transformDoubleStatement(String statement, String firstKeyword, String secondKeyword, String statementBefore, String statementAfter) {
   
   	//  Remove the final period, if there is one
      statement = statement.trim();
      String lastChar = statement.substring(statement
         	.length() - 1);
      if (lastChar.equals(".")) {
         statement = statement.substring(0, statement
            	.length() - 1);
      }
   	
      int psnOfFirstKeyword = findKeyword (statement, firstKeyword, 0);
      int psnOfSecondKeyword = findKeyword (statement, secondKeyword, psnOfFirstKeyword + firstKeyword.length());
   	
      String restOfStatement = statement.substring(psnOfFirstKeyword + firstKeyword.length(), psnOfSecondKeyword).trim();
      
      return statementBefore  + restOfStatement  + statementAfter;
   }

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no").
	 *
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @param startPos
	 *            the character of the string to begin the
	 *            search at
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
   private int findKeyword(String statement, String goal, int startPos) {
      String phrase = statement.trim().toLowerCase();
      goal = goal.toLowerCase();
   
   	// The only change to incorporate the startPos is in
   	// the line below
      int psn = phrase.indexOf(goal, startPos);
   
   	// Refinement--make sure the goal isn't part of a
   	// word
      while (psn >= 0) {
      	// Find the string of length 1 before and after
      	// the word
         String before = " ", after = " ";
         if (psn > 0) {
            before = phrase.substring(psn - 1, psn);
         }
         if (psn + goal.length() < phrase.length()) {
            after = phrase.substring(
               	psn + goal.length(),
               	psn + goal.length() + 1);
         }
      
      	// If before and after aren't letters, we've
      	// found the word
         if (((before.compareTo("a") < 0) || (before
         		.compareTo("z") > 0)) // before is not a
         								// letter
         		&& ((after.compareTo("a") < 0) || (after
         				.compareTo("z") > 0))) {
                     
            return psn;
         }
      
      	// The last position didn't work, so let's find
      	// the next, if there is one.
         psn = phrase.indexOf(goal, psn + 1);
      
      }
   
      return -1;
   }
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
   private int findKeyword(String statement, String goal) {
   
      return findKeyword (statement, goal, 0);
   }
	
	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
   private String getRandomResponse() {
   
      final int NUMBER_OF_RESPONSES = 4;
      double r = Math.random();
      int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
      String response = "";
   	
      if (whichResponse == 0) {
         response = "Interesting, tell me more.";
      }
      else if (whichResponse == 1) {
         response = "Hmmm.";
      }
      else if (whichResponse == 2) {
         response = "Do you really think so?";
      }
      else if (whichResponse == 3) {
         response = "You don't say.";
      }
   
      return response;
   }

}
