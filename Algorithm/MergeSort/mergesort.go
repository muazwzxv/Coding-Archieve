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
