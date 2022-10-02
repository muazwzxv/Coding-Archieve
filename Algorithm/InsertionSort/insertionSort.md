
### Insertion sort

```java
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

```

```go
package main

import (
	"fmt"
)

func main() {
	list := []int{10, 30, 40, 50, 30, 33, 40}
	fmt.Println("Unsorted", list)
	sort(list)
	fmt.Println("sorted", list)
}

func sort(list []int) {
	size := len(list)
	for i := 1; i < size; i++ {
		key := i
		for key > 0 {
			if list[key-1] > list[key] {
				list[key-1], list[key] = list[key], list[key-1]
			}
			key = key - 1
		}
	}
}

```