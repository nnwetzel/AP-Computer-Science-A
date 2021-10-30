import java.awt.Point;

// Created by Nat Wetzel

public class Equestria {

   // circle's diameter
   public static final int CIRCLE_DIAMETER = 25;

   // point values
   public static final Point BALTIMARE = new Point(29, 16);
   public static final Point MANEHATTAN = new Point(34, 8);
   public static final Point LOS_PEGASUS = new Point(6, 19);
   public static final Point NEIGHAGRA_FALLS = new Point(22, 7);
   public static final Point BADLANDS = new Point (25, 24);
   public static final Point PONYVILLE = new Point (16, 14);
    
   public static void main(String[] args) {
   
      // exercise 1
      double circumference = roadTrip(CIRCLE_DIAMETER);
      
      System.out.println("For exercise 1, the circumference of the circle is: " + circumference);
      System.out.println("");
   
      // exercise 2
      double distance1 = findDistance(BALTIMARE, MANEHATTAN);
      double distance2 = findDistance(LOS_PEGASUS, NEIGHAGRA_FALLS);
      double distance3 = findDistance(BADLANDS, PONYVILLE);
      
      System.out.println("For exercise 2, the distance between Baltimare and Manehattan is: " + distance1);
      System.out.println("The distance between Los Pegasus and Neighagra Falls is: " + distance2);
      System.out.println("The distance between the Badlands and Ponyville is: " + distance3);
      System.out.println("");
         
      // exercise 3
      double distance4 = findDistance(MANEHATTAN, BALTIMARE);
      double distance5 = findDistance(BALTIMARE, LOS_PEGASUS);
      double distance6 = findDistance(LOS_PEGASUS, MANEHATTAN);
      
      System.out.println("For exercise 3, Princess Luna will travel to Manehattan, Baltimare, and Los Pegasus.");
      System.out.println("The distance between Manehattan and Baltimare is: " + distance4);
      System.out.println("The distance between Baltimare and Los Pegasus is: " + distance5);
      System.out.println("The distance between Los Pegasus Manehattan is: " + distance6);
      System.out.println("");
      
      // exercise 4
      double trip = totalTrip(MANEHATTAN, BALTIMARE, LOS_PEGASUS); 
      
      System.out.println("For exercise 4, the total distance between Manehattan, Baltimare, and Los Pegasus is: " + trip);
   }
   // returns the circumference by using the distance formula  
   public static double roadTrip(int diameter) {
   
      double circumference = Math.PI * diameter;
      return circumference;
   }
    
   // returns the distance by using the distance formula
   public static double findDistance(Point A, Point B) {
    
      double distance = Math.sqrt(Math.pow(B.getX() - A.getY(), 2 ) + Math.pow(B.getY() - A.getY(), 2 ) );
      return distance;
      
   }
   // returns the total distance by adding the distance of each point
   public static double totalTrip(Point A, Point B, Point C) {
   
      double city1 = findDistance(A, B);
      double city2 = findDistance(B, C);
      double city3 = findDistance(C, A);
      
      double totalDistance = city1 + city2 + city3;
      return totalDistance;
   }

}   
