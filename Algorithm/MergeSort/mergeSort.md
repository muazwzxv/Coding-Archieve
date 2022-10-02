
## Merge sort


### Java implementation
```java
public class MergeSort {

  public static void main(String[] args) {
    int[] arr = { 12, 21, 40, -5, 40, 34, 75 };

    // sort the array
    sort(arr);

    // Display
    for (int i : arr)
      System.out.println(i + "");
  }

  public static void sort(int arr[]) {

    // Base case if the size divided subArray is less than two
    if (arr.length < 2)
      return;

    int mid = arr.length / 2;
    int[] l = new int[mid];
    int[] r = new int[arr.length - mid];

    // split input array to leftSide = [start .... mid]
    for (int i = 0; i < mid; i++)
      l[i] = arr[i];
    // split input array to rightSide = [mid ..... end]
    for (int i = mid; i < arr.length; i++)
      r[i - mid] = arr[i];

    // recursively call the function for both subArray
    sort(l);
    sort(r);

    // Merge all subArray into one whole sorted array
    merge(arr, l, r, mid, arr.length - mid);
  }

  public static void merge(int arr[], int leftArray[], int rightArray[], int left, int right) {

    int leftPointer = 0;
    int rightPointer = 0;
    int mainPointer = 0;

    while (leftPointer < left && rightPointer < right) {
      if (leftArray[leftPointer] <= rightArray[rightPointer])
        arr[mainPointer++] = leftArray[leftPointer++];
      else
        arr[mainPointer++] = rightArray[rightPointer++];
    }

    while (leftPointer < left)
      arr[mainPointer++] = leftArray[leftPointer++];
    while (rightPointer < right)
      arr[mainPointer++] = rightArray[rightPointer++];
  }
}
```

### Go implementation
```go
package main

func main() {
	arr := []int{60, 40, 10, 110, 560, 383, 22, 1}
	mergeSort(arr)
	//fmt.Println(arr)
}

func mergeSort(arr []int) {
	if len(arr) < 2 {
		return
	}

	mid := len(arr) / 2
	left := arr[:mid]
	right := arr[mid:]

	mergeSort(left)
	mergeSort(right)

	merge(arr, left, right, mid, len(arr)-mid)
}

func merge(arr []int, leftArray []int, rightArray []int, left int, right int) {
	leftPointer := 0
	rightPointer := 0
	mainPointer := 0

	for leftPointer < left && rightPointer < right {
		if leftArray[leftPointer] <= rightArray[rightPointer] {
			arr[mainPointer] = leftArray[leftPointer]
			mainPointer++
			leftPointer++
		} else {
			arr[mainPointer] = rightArray[rightPointer]
			mainPointer++
			rightPointer++
		}
	}

	for leftPointer < left {
		arr[mainPointer] = leftArray[leftPointer]
		mainPointer++
		leftPointer++
	}
	for rightPointer < right {
		arr[mainPointer] = rightArray[rightPointer]
		mainPointer++
		rightPointer++
	}
}
```