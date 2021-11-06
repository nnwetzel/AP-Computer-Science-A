import java.awt.Point;

public class Equestria {

   public static final int CIRCLE_DIAMETER = 20;

   public static final Point BALTIMARE = new Point(29, 16);
   public static final Point MANEHATTAN = new Point(34, 8);
   public static final Point LOS_PEGASUS = new Point(6, 19);
   public static final Point NEIGHAGRA_FALLS = new Point(34, 8);
   public static final Point BADLANDS = new Point(25, 24);
   public static final Point PONYVILLE = new Point(16, 14);

   public static void main(String[] args) {
   
      // Exercise 1.
      double circumference = findCircumference(CIRCLE_DIAMETER);
      
      System.out.println("For exercise 1, the circumference of the circle is: " + circumference);
      
      // Exercise 2.
      double distance = findDistance(BALTIMARE, MANEHATTAN);
      
      System.out.println("For exercise 2, the distance between Baltimare and Manehattan is: " + distance);
   
      // Exercise 3.
      tour();

      // Exercise 4.
      double trip = totalTrip(MANEHATTAN, BADLANDS, PONYVILLE);

      System.out.println("For exercise 4, the total distance between Manehattan, Badlands, and Ponyville is: " + trip);
      
   }

   /*
      Returns the circumference of a circle by using the circumference formula.
      @param   diameter - the diameter of a circle
      @return  the circumference
   **/

   public static double findCircumference(int diameter) {

      double circumference = Math.PI * diameter;
      return circumference;
   }

   /*
      Returns the distance between two cities by using the distance formula.
      @param   pointA   the coordinate points of the first city
      @param   pointB   the coordinate points of the second city
      @return  the distance between the first and second city
   **/
   public static double findDistance(Point A, Point B) {

      double distance = Math.sqrt(Math.pow(B.getX() - A.getX(), 2 ) + Math.pow(B.getY() - A.getY(), 2 ) );
      return distance;
   }

   /*
      Outputs each distance between 3 cities in Princess Luna's tour using the findDistance method.
   **/
   public static void tour() {
      double cityDistance1 = findDistance(NEIGHAGRA_FALLS, PONYVILLE);
      double cityDistance2 = findDistance(PONYVILLE, LOS_PEGASUS);
      double cityDistance3 = findDistance(LOS_PEGASUS, NEIGHAGRA_FALLS);
      
      System.out.println("For exercise 3, the distance between Neighagra Falls and Ponyville is: " + cityDistance1);
      System.out.println("For exercise 3, the distance between Ponyville and Los Pegasus: " + cityDistance2);
      System.out.println("For exercise 3, the distance between Los Pegasus and Neighagra Falls is: " + cityDistance3);
   }

   /*
      Returns the total distance between 3 cities by using the distance formula for each city and adding them together.
      @param   A  the coordinate points of the first city
      @param   B  the coordinate points of the first city
      @param   B  the coordinate points of the first city
      @return  the distance between all 3 cities
   **/ 
   public static double totalTrip(Point A, Point B, Point C) {
      double cityDistance1 = findDistance(A, B);
      double cityDistance2 = findDistance(B, C);
      double cityDistance3 = findDistance(C, A);

      double totalDistance = cityDistance1 + cityDistance2 + cityDistance3;
      return totalDistance;
   }
}