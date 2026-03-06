package sort;

import java.util.*;

// Selection sort demo
public class SelectionSort {

      // main: read inputs, generate array, sort, print
      public static void main(String[] args) {

            Random random = new Random(); // RNG
            Scanner sc = new Scanner(System.in); // input

            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt(); // size

            System.out.print("Enter the maximum range of numbers: ");
            int range = sc.nextInt(); // range
            sc.close(); // close scanner

            int[] arr = new int[size]; // allocate

            System.out.println("Your generated array is as follows:");
            for (int i = 0; i < size; i++) {
                  arr[i] = random.nextInt(range); // fill
                  System.out.print(arr[i] + " "); // print
            }

            // sort in-place
            selectionSort(arr);

            System.out.println("\nYour sorted array is as follows:");
            for (int element : arr) {
                  System.out.print(element + " "); // print sorted
            }
      }

      // selection sort (in-place, O(n^2))
      private static void selectionSort(int[] arr) {

            int size = arr.length;
            int minIndex;

            for (int i = 0; i < size; i++) {
                  int minSoFar = arr[i];
                  minIndex = i;

                  // find min in unsorted portion
                  for (int j = i + 1; j < size; j++) {
                        if (arr[j] < minSoFar) {
                              minSoFar = arr[j];
                              minIndex = j;
                        }
                  }

                  // swap
                  int temp = arr[minIndex];
                  arr[minIndex] = arr[i];
                  arr[i] = temp;
            }
      }

}
