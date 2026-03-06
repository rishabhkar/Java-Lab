package search;

import java.util.*;

// Simple demonstration of a linear search on an integer array.
public class LinearSearch {

      // Program entry point
      public static void main(String[] args) {

            // Random generator used to populate the array with sample values
            Random random = new Random();

            // Scanner to read the desired array size from standard input
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int input = sc.nextInt();

            System.out.println("\nEnter the maximum range of elements: ");
            int maxRange = sc.nextInt();

            // Close scanner after reading input to avoid resource leak
            sc.close();

            // Handle edge case where user requests an array of size 0
            if (input == 0) {
                  System.out.println("Input size is zero.");
                  return;
            }

            // Allocate the array with the requested size
            int[] arr = new int[input];

            // Populate the array with random values and print each element
            for (int i = 0; i < arr.length; i++) {
                  arr[i] = random.nextInt(maxRange); // values in range [0, 99]
                  System.out.format("Element %d: %d%n", i, arr[i]); // print index and value
            }

            // Select an element at a random index to search for
            int element = arr[random.nextInt(arr.length)];
            System.out.println("Finding for Element: " + element);

            // Perform linear search and print the found index (or -1 if not found)
            System.out.println("Element found at position: " + linearSearch(arr, element));


      }

      // Linear search: return index of first occurrence of element, or -1 if absent
      private static int linearSearch(int[] arr, int element) {

            // Iterate through the array comparing each element
            for (int i = 0; i < arr.length; i++) {
                  if (arr[i] == element) return i; // found — return index immediately
            }
            return -1; // not found
      }

}
