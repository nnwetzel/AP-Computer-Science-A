public class DayTester {

   public static void main(String[] args)
   {
      System.out.println("This main method helps test the Day changes for you.");
   
   	// PART 1
      System.out.println("This should say \"Halloween\"");
      Day spookyDay = new Day(2014, 10, 31);
      System.out.println(spookyDay.holidayName());
   
      System.out.println("This should say \"Valentine's Day\"");
      Day valentinesDay = new Day(2014, 2, 14);
      System.out.println(valentinesDay.holidayName());
   	
      System.out.println("This should say \"Christmas Day\"");
      Day xMasDay = new Day(2014, 12, 25);
      System.out.println(xMasDay.holidayName());
   	
   	//TODO:Add a test for making sure today is not a holiday
      System.out.println("This should say null");
      Day today = new Day();
      System.out.println(today.holidayName());
            
      if (today.noSchool()) {
         System.out.println("No school");
      } else System.out.println("School");
      

      
   }
}
