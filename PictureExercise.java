
public class PictureExercise
{
   public static void main(String[] args)
   {    	
      // Creates a new picture and loads it (not based on the pick method)
      Picture pic = new Picture("nature.jpeg");
      
      
      // Draws the picture
      pic.draw();
      
      // Finds the picture's width and height   
      int x = pic.getWidth();
      int y = pic.getHeight();
      
      // Prints the picture's width and height
      System.out.println("Width: " + x);
      System.out.println("Height: " + y);
   
   }
}
