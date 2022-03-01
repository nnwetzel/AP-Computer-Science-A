import java.io.*;

public class Life {
	public static void main(String[] args)
	{
		// Create a Board, using a filename.
		Board allCells = new Board("sampleData.txt");

		// Test printing out the cells
		System.out.println(allCells.toString());
	}
}
