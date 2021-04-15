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
