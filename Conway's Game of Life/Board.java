import java.util.Arrays;

public class Board {

   private static int row = 20;
   private static int col = 20;
   
   String[][] data = new String[row][col];
   
   public Board(String fileName) {
   
      BoardReader b = new BoardReader(fileName);
      int count = 0;
   
      for (int i = 0; i < col; i++) {
      
         for (int j = 0; j < row; j++) {
            
            // Checks if the iteration corresponds with the cell in the bottom right corner.
            if (i == col - 1 && j == row - 1) {
               // Checks if the cell up 1 is alive.
               if (data[i-1][j] == "#") {
                  count++;
               }
               // Checks if the cell left 1 is alive.
               if (data[i][j-1] == "#") {
                  count++;
               }
               // Checks if the cell up 1 and left 1 is alive. 
               if (data[i-1][j-1] == "#") {
                  count++;
               }
            }
            // Checks if the iteration corresponds with the cell in the bottom left corner.
            else if (i == col - 1 && j == 0) {
               // Checks if the cell up 1 is alive.
               if (data[i-1][j] == "#") {
                  count++;
               }
               // Checks if the cell right 1 is alive.
               if (data[i][j+1] == "#") {
                  count++;
               }
               // Checks if the cell up 1 and right 1 is alive.
               if (data[i-1][j+1] == "#") {
                  count++;
               }
            }
            // Checks if the iteration corresponds with the row of cells at the bottom, except the first cell.
            else if (i == col - 1 && j > 0){
               // Checks if the cell up 1 is alive.
               if (data[i-1][j] == "#") {
                  count++;
               }
               // Checks if the cell left 1 is alive.
               if (data[i][j-1] == "#") {
                  count++;
               }
               // Checks if the cell right 1 is alive.
               if (data[i][j+1] == "#") {
                  count++;
               }
               // Checks if the cell up 1 and left 1 is alive.
               if (data[i-1][j-1] == "#") {
                  count++;
               }
               // Checks if the cell up 1 and right 1 is alive.
               if (data[i-1][j+1] == "#") {
                  count++;
               }
            }
            // Checks if the iteration corresponds with the cell in the top left corner.
            else if (i == 0 && j == 0) {
               // Checks if the cell down 1 is alive.
               if (data[i+1][j] == "#") {
                  count++;
               }
               // Checks if the cell right 1 is alive.
               if (data[i][j+1] == "#") {
                  count++;
               }
               // Checks if the cell down 1 and right 1 is alive.
               if (data[i+1][j+1] == "#") {
                  count++;
               }
            }
            // Checks if the iteration corresponds with the cell in the top right corner.
            else if (i == 0 && j == row - 1) {
               // Checks if the cell left 1 is alive.
               if (data[i][j-1] == "#") {
                  count++;
               }
               // Checks if the cell down 1 is alive.
               if (data[i+1][j] == "#") {
                  count++;
               }
               // Checks if the cell down 1 and left 1 is alive.
               if (data[i+1][j-1] == "#") {
                  count++;
               }
            }
            // Checks if the iteration corresponds with the row of cells on the top, except the first cell.
            else if (i == 0 && j > 0) {
               // Checks if the cell left 1 is alive.
               if (data[i][j-1] == "#") {
                  count++;
               }
               // Checks if the cell down 1 is alive.
               if (data[i+1][j] == "#") {
                  count++;
               }
               // Checks if the cell right 1 is alive.
               if (data[i][j+1] == "#") {
                  count++;
               }
               // checks if the cell down 1 and right 1 is alive.
               if (data[i+1][j+1] == "#") {
                  count++;
               }
               // Checks if the cell down 1 and left 1 is alive.
               if (data[i+1][j-1] == "#") {
                  count++;
               }
            }
            else if (j == col) {
               if (data[i-1][j] == "#") {
                  count++;
               }
               if (data[i][j-1] == "#") {
                  count++;
               }
               if (data[i+1][j] == "#") {
                  count++;
               }
               if (data[i-1][j-1] == "#") {
                  count++;
               }
               if (data[i+1][j-1] == "#") {
                  count++;
               }
            }
            else if (j == 0){
               if (data[i-1][j] == "#") {
                  count++;
               }
               if (data[i+1][j] == "#") {
                  count++;
               }
               if (data[i][j+1] == "#") {
                  count++;
               }
               if (data[i+1][j+1] == "#") {
                  count++;
               }
               if (data[i-1][j+1] == "#") {
                  count++;
               }
            }
            else {
               if (data[i-1][j] == "#") {
                  count++;
               }
               if (data[i][j-1] == "#") {
                  count++;
               }
               if (data[i+1][j] == "#") {
                  count++;
               }
               if (data[i][j+1] == "#") {
                  count++;
               }
               if (data[i-1][j-1] == "#") {
                  count++;
               }
               if (data[i+1][j+1] == "#") {
                  count++;
               }
               if (data[i-1][j+1] == "#") {
                  count++;
               }
               if (data[i+1][j-1] == "#") {
                  count++;
               }
            }
            
            if (count <= 1) {
               data[i][j] = ".";
            }
            else if (count == 2 || count == 3) {
               data[i][j] = "#";
            }
            else if (count >= 3) {
               data[i][j] = ".";
            }
            else if (count == 3) {
               data[i][j] = "#";
            }
            else {
               data[i][j] = b.getNextCell();
            }
            
            count = 0;
         }
      }
   }
   
   public String toString() {
   
      return Arrays.deepToString(data).replace("], [", "\n").replace("[","").replace("]","").replace(",","");
   }
}