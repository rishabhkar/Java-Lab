package search;

import java.util.*;

// Demonstration of binary search on a sorted integer array
public class BinarySearch {

      // Program entry point
      public static void main (String[] args) {

            // Read user input: number of elements and the range for random values
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number of elements: ");
            int size = sc.nextInt();

            System.out.print("\nEnter the range of elements: ");
            int range = sc.nextInt();

            // Random generator to populate the array
            Random random = new Random();
            int[] arr = new int[size];

            // Fill the array with random integers in [0, range)
            for(int i=0; i<size; i++) {
                  arr[i] = random.nextInt(range);
            }

            // Sort the array to meet binary search precondition
            Arrays.sort(arr);

            // Print the generated, sorted array for the user's reference
            System.out.println("Your generated array is as follows: ");
            for(int i=0; i<size; i++) {
                  System.out.print(arr[i] + " ");
            }

            // Read the target element to search for
            System.out.println("\nEnter the element to be found: ");
            int element = sc.nextInt();
            sc.close();

            // Perform binary search and print result. Note: printed position uses 1-based indexing for readability.
            int index = binarySearch(arr, element);
            System.out.println(index == -1
                    ? "Element not found in array"
                    : "Element found at position: " + (index+1));
      }

      // Binary search implementation: returns index of element or -1 if absent
      private static int binarySearch(int[] arr, int element) {

            // Initialize mid, low and high pointers
            int mid = arr.length/2;
            int low = 0, high = arr.length-1;

            // Loop until the search space is exhausted
            while (low <= high) {
                  // If mid matches the element, return its index
                  if (element == arr[mid]) return mid;
                  // If target is less than mid value, search left half
                  else if (element < arr[mid]) high = mid - 1;
                  // Otherwise search right half
                  else low = mid + 1;

                  // Recompute mid after updating bounds
                  mid = (low + high)/2;
            }

            // Element not found
            return -1;
      }

}
