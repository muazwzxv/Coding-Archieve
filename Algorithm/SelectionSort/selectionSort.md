## Selection Sort

### Java implementation

```java
public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = { 3, 21, 33, 40, -4, 3, 30 };

    sort(arr);

    for (int i : arr) {
      System.out.println(i + "");
    }
  }

  public static void sort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
      /**
       * Current pointer in the array pointer will increase after every loop
       */

      int pointer = i;

      for (int j = i + 1; j < arr.length; j++) {
        /*
         * iterate the loop and find the lowest value store that value in 'pointer'
         */
        if (arr[j] < arr[pointer])
          pointer = j;
      }

      // Store in smallest
      int smol = arr[pointer];

      /*
       * assign new value to the index where the smallest element exist with current
       * pointer location
       */
      arr[pointer] = arr[i];

      /*
       * Insert the smallest value to the current pointer
       */
      arr[i] = smol;
    }
  }
}
```