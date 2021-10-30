public class InterestingDays {

   public static void main (String[] args) {
   
      // Represents today's date
      Day today = new Day();

      // Represents my birthday
      Day birthday = new Day(2005, 6, 15);
      // Returns the number of days between my birthday and today
      int daysAlive = today.daysFrom(birthday);

      // Represents day of the AP test
      Day APTest = new Day (2022, 5, 4);
      // Returns the number of days between today and the AP test
      int daysUntilAPTest = APTest.daysFrom(today);
      
      // Prints Prints out how many days I've been alive and how many days until the AP test
      System.out.println("Days I've been alive: " + daysAlive);
      System.out.println("Days until the AP test: " + daysUntilAPTest);
   
   }

}