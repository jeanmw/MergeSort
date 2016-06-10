

import java.util.Arrays;


public class MergeSortTest {

  public void Test1() {
    int[] arr = {5, 6, 2, 1, 4, 9, 12};
    MergeSort.mergeSort(arr);


  }

  public void Test2() {
    int[] arr = {};
    MergeSort.mergeSort(arr);

  }

  public void Test3() {
    int[] arr = [ 3 3 1 90 42 3 18 7 12];
    MergeSort.mergeSort(arr);
  }




}