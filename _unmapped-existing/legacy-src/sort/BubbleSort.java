package sort;

import java.util.*;

// Bubble sort demo
public class BubbleSort {

      // main
      public static void main(String[] args) {

            Random random = new Random();

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of the array: ");
            int size = sc.nextInt();

            System.out.println("\nEnter the maximum range of elements: ");
            int range = sc.nextInt();
            sc.close(); // close scanner

            int[] arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                  arr[i] = random.nextInt(range);
            }

            System.out.println("The unsorted array generated for you is: \n");
            for (int element : arr) {
                  System.out.print(element + " ");
            }

            int[] optimisedArr = arr;
            // unoptimized in-place sort
            bubbleSortUnoptimized(arr);

            System.out.println("\n\nThe sorted array is as follows (unoptimised version): \n");
            for (int element : arr) {
                  System.out.print(element + " ");
            }

            bubbleSortOptimised(optimisedArr);
            System.out.println("\nThe sorted array is as follows (optimised version): \n");
            for (int element : arr) {
                  System.out.print(element + " ");
            }

      }

      // unoptimized bubble sort (in-place)
      private static void bubbleSortUnoptimized(int[] arr) {

            int size = arr.length - 1;
            int newSize = size - 1;
            // perform passes
            for (int i = 0; i < size; i++) {
                  for (int j = 0; j <= newSize; j++) {
                        // swap if out of order
                        if (arr[j] > arr[j + 1]) {
                              int temp = arr[j+1];
                              arr[j+1] = arr[j];
                              arr[j] = temp;
                        }
                  }
                  newSize--;
            }

      }

      // optimized bubble sort (unused)
      private static int[] bubbleSortOptimised(int[] arr) {

            int size = arr.length - 1;
            int newSize = size;
            boolean swapped;

            for(int i=0; i<size; i++) {
                  swapped = false;
                  for(int j=0; j<newSize; j++) {
                        // swap if out of order
                        if(arr[j] > arr[j+1]) {
                              int temp = arr[j+1];
                              arr[j+1] = arr[j];
                              arr[j] = temp;
                              swapped = true;
                        }
                  }
                  // early exit if sorted
                  if (!swapped) break;
                  newSize--;
            }
            return arr;
      }

}
