public class MergeSort {

  // Main function that sorts the array
  public static void mergeSort(int[] arr) {
      if (arr.length < 2) {
          return; // Base case: array is already sorted
      }

      int mid = arr.length / 2;

      // Divide the array into two halves
      int[] left = new int[mid];
      int[] right = new int[arr.length - mid];

      System.arraycopy(arr, 0, left, 0, mid);  // Copy left half
      System.arraycopy(arr, mid, right, 0, arr.length - mid);  // Copy right half

      // Recursively sort both halves
      mergeSort(left);
      mergeSort(right);

      // Merge the sorted halves
      merge(arr, left, right);
  }

  // Merge two sorted arrays into one sorted array
  public static void merge(int[] arr, int[] left, int[] right) {
      int i = 0, j = 0, k = 0;

      // Merge the arrays
      while (i < left.length && j < right.length) {
          if (left[i] <= right[j]) {
              arr[k++] = left[i++];
          } else {
              arr[k++] = right[j++];
          }
      }

      // Copy any remaining elements in left[]
      while (i < left.length) {
          arr[k++] = left[i++];
      }

      // Copy any remaining elements in right[]
      while (j < right.length) {
          arr[k++] = right[j++];
      }
  }

  // Helper function to print the array
  public static void printArray(int[] arr) {
      for (int num : arr) {
          System.out.print(num + " ");
      }
      System.out.println();
  }

  public static void main(String[] args) {
      int[] arr = {38, 27, 43, 3, 9, 82, 10};
      System.out.println("Original Array:");
      printArray(arr);

      mergeSort(arr);

      System.out.println("Sorted Array:");
      printArray(arr);
  }
}
