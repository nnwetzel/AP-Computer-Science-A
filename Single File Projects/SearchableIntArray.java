import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class SearchableIntArray
{

   public static Random generator = new Random();


   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      boolean quit = false;
      
      System.out.println("Enter the length of your new array.");
      int newArrayLength = Integer.parseInt(input.nextLine());
      
      System.out.println("Enter the number of possible random values of your new array.");
      int newArrayN = Integer.parseInt(input.nextLine());
      
      System.out.println("Array generated...");
      int[] createdArray = randomIntArray(newArrayLength, newArrayN);
      System.out.println(Arrays.toString(createdArray));
      
      do {
      
         System.out.println("Enter an integer to search for.");
         int searchableInt = Integer.parseInt(input.nextLine());
      
         System.out.println("Would you like to use linear or binary search? Type \"linear\" or \"binary\". (Type \"quit\" to exit.)");
         String searchMethod = input.nextLine();
      
         if (searchMethod.equals("linear"))
         {
            System.out.println("Index: " + linear(createdArray, searchableInt));
         }
         else if (searchMethod.equals("binary"))
         {
            System.out.println("Sorting array...");
            createdArray = sort(createdArray);
            System.out.println(Arrays.toString(createdArray));
            System.out.println("Index: " + binary(createdArray, searchableInt));
         }
         else if (searchMethod.equals("quit"))
         {
            quit = true;
         }
      }
      while (quit == false);
   }
   
   /**
    * Searches an array for an integer. Sequentially comparing the target to each int in the array. Starts at the beginning of the array.
    * @arr[] - The array being searched.
    * @n - The integer being searched for.
    * @return - The index of the integer being searched for, -1 if not found.
    */
   public static int linear(int arr[], int n)
   {
      for (int i = 0; i < arr.length; i ++)
      {
         if (arr[i] == n)
         {
            return i;
         }
      }
      return -1;
   }
   
   /**
    * Searches an array for an integer. Splits sorted array in half. The middle value is looked at to check if it is greater than or less than the value to be searched. Accordingly, a search is done to either half of the given list.
    * @arr[] - The array being searched.
    * @n - The integer being searched for.
    * @return - The index of the integer being searched for, -1 if not found.
    */
   public static int binary(int[] arr, int n)
   {
      int start = 0;
      int end = arr.length - 1;
      
      while (start <= end)
      {
         int mid = (start + end) / 2;
         if (n == arr[mid])
         {
            return mid;
         }
         else if (n > arr[mid])
         {
            start = mid + 1;
         }
         else
         {
            end = mid - 1;
         }
      }
      return -1;
   }
   
   /**
    * Sorts an array, using selection sort.
    * @a - The array to sort.
    */
   public static int[] sort (int[] a)
   {
      int length = a.length;
   
      for (int i = 0; i < length - 1; i++) {
      
         if (a[i] > a[i + 1]) {

            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
                
            i = -1;
         }
      }
   
      return a;
   }
      
   /**
    * Creates an array filled with random values.
    * @length - The length of the array.
    * @n - The number of possible random values.
    * @return - An array filled with length numbers between 0 and n - 1.
    */
   public static int[] randomIntArray(int length, int n)
   {
      int[] createdArray = new int [length];
      for (int i = 0; i < createdArray.length; i++)
      {
         createdArray[i] = generator.nextInt(n);
      }
      
      return createdArray;
   }
}