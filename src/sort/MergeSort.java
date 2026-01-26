package sort;

import java.util.*;

// Merge sort demonstration — comments added only
public class MergeSort {

      // Main: read input, generate array, run merge sort, and print results
      public static void main(String[] args) {

            // RNG for array values
            Random random = new Random(); // random number generator

            // Read user input
            Scanner scanner = new Scanner(System.in); // input scanner

            System.out.println("Enter the size of the array: ");
            int size = scanner.nextInt(); // number of elements

            System.out.println("Enter the maximum range of elements: ");
            int maxValue = scanner.nextInt(); // exclusive upper bound for random values
            scanner.close(); // close scanner

            // Allocate array to sort
            int[] array = new int[size]; // array to sort

            // Populate and print the unsorted array
            System.out.println("Your generated array is as follows: \n");
            for (int index = 0; index < size; index++) {
                  array[index] = random.nextInt(maxValue); // fill array with random values
                  System.out.print(array[index] + " "); // print element
            }

            // Call mergeSort (recursive). Return value is ignored here; the method
            // merges sorted halves back into the provided array during the merge step.
            mergeSort(array); // sort array

            // Print the sorted array
            System.out.println("\nSorted array via Merge sort is as follows: \n");
            for (int index = 0; index < size; index++) {
                  System.out.print(array[index] + " "); // print sorted elements
            }
      }

      // Recursive merge sort that returns a sorted array
      private static int[] mergeSort(int[] arr) {

            // Base case: arrays of length 0 or 1 are already sorted
            if (arr.length <= 1) return arr;

            // Compute split sizes
            int leftSize = arr.length / 2;
            int rightSize = arr.length - leftSize;

            // Allocate left and right subarrays
            int[] left = new int[leftSize];
            int[] right = new int[rightSize];

            // Copy into left subarray
            for (int i = 0; i < leftSize; i++) {
                  left[i] = arr[i];
            }

            // Copy into right subarray
            for (int j = leftSize; j < arr.length; j++) {
                  right[j - leftSize] = arr[j];
            }

            // Recursively sort each half
            mergeSort(left);
            mergeSort(right);

            // Merge sorted halves back into the original array
            int i = 0; // left pointer
            int j = 0; // right pointer
            int k = 0; // destination pointer in arr

            // Take the smaller of the two current elements
            while (i < left.length && j < right.length) {
                  if (left[i] <= right[j]) arr[k++] = left[i++];
                  else arr[k++] = right[j++];
            }

            // Copy any remaining elements from left
            while (i < left.length) arr[k++] = left[i++];
            // Copy any remaining elements from right
            while (j < right.length) arr[k++] = right[j++];

            // Return merged (sorted) array
            return arr;
      }

}
