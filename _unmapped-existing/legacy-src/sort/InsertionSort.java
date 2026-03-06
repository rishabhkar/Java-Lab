package sort;

import java.util.*;

public class InsertionSort {

      public static void main(String[] args) {

            Random random = new Random(); // random number generator
            Scanner scanner = new Scanner(System.in); // input scanner

            System.out.println("Enter the size of the array: ");
            int size = scanner.nextInt(); // number of elements

            System.out.println("Enter the maximum range of elements: ");
            int maxValue = scanner.nextInt(); // exclusive upper bound for random values
            scanner.close(); // close scanner

            int[] array = new int[size]; // array to sort

            System.out.println("Your generated array is as follows: \n");
            for (int index = 0; index < size; index++) {
                  array[index] = random.nextInt(maxValue); // fill array
                  System.out.print(array[index] + " "); // print element
            }

            // sort in-place
            insertionSort(array); // sort array

            System.out.println("\nSorted array via Insertion sort is as follows: \n");
            for (int index = 0; index < size; index++) {
                  System.out.print(array[index] + " "); // print sorted elements
            }
      }

      // insertion sort: sorts array in-place
      private static void insertionSort(int[] array) {

            int length = array.length; // number of elements

            // iterate over each element and insert it into the sorted prefix
            for (int current = 1; current < length; current++) {

                  int keyValue = array[current]; // value to insert
                  int insertIndex = current; // position where keyValue will be placed

                  // shift larger elements to the right to make space for keyValue
                  for (int shift = current - 1; (shift >= 0 && array[shift] > keyValue); shift--) {
                        array[shift + 1] = array[shift];
                        insertIndex = shift;
                  }

                  // place keyValue at its correct position if it moved
                  if (insertIndex != current) array[insertIndex] = keyValue;

            }
      }
}
