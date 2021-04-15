public class InsertionSort {

  public static void main(String[] args) {
    int arr[] = { 12, 11, 13, 5, 6 };
    sort(arr);

    for (int i : arr) {
      System.out.println(i + "");
    }
  }

  public static void sort(int [] arr) {
    for (int i = 1; i < arr.length; i++)  {
      int key = arr[i];

      int point = i - 1;

      while (point >= 0 && arr[point] > key) {
        arr[point + 1] = arr[point];
        point--;
      }
      arr[point + 1]  = key;
    }
  }
}
