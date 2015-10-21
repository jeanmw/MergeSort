
/**
 * Created by jeanweatherwax on 8/09/15.
 */
import java.util.Arrays;

public class MergeSort {

  public static void main(String[] args) {
    int[] arr = {5, 6, 2, 1, 4, 9, 12};
    System.out.println("input: " + Arrays.toString(arr));
    mergeSort(arr);
    System.out.println("output: " + Arrays.toString(arr));

    System.out.println("");

    int[] newArr = {};
    System.out.println("input: "+Arrays.toString(newArr));
    MergeSort.mergeSort(newArr);
    System.out.println("output: "+Arrays.toString(newArr));

  }

  public static void mergeSort(int[] arrayInput) { //mergeSort method wraps merge
    int n = arrayInput.length;
    if (n < 2) //base case for 1 element, which is already sorted
      return;
    int mid = n / 2; //find initial dividing point
    int leftLength = mid;
    int rightLength = (n - mid);
    int[] left = new int[leftLength];
    int[] right = new int[rightLength];
    for (int i = 0; i < mid; i++) {
      left[i] = arrayInput[i];

    }
    for (int i = mid; i < n; i++) {
      right[i - mid] = arrayInput[i];
    }
    mergeSort(left); //recursively go through left array
    mergeSort(right); //recursively go through right array
    merge(left, right, arrayInput); //merge final left and right arrays back to one array
  }

  public static void merge(int[] left, int[] right, int[] arr) { //inner merge method
    int leftLength = left.length;
    int rightLength = right.length;
    int i = 0, j = 0, k = 0;
    while (i < leftLength && j < rightLength) {
      if (left[i] <= right[j]) {
        arr[k] = left[i];
        i++;
        k++;
      } else {
        arr[k] = right[j];
        j++;
        k++;
      }
    }
    while (i < leftLength) {
      arr[k] = left[i];
      k++;
      i++;
    }
    while (j < rightLength) {
      arr[k] = right[j];
      k++;
      j++;
    }
  }
}