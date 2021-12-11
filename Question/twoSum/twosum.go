package main

import (
	"fmt"
)

func main() {

	input := []int{1, 3, 7, 9, 2}
	fmt.Println(solve(input, 11))

}

func solve(arr []int, target int) []int {

	if len(arr) == 0 || len(arr) == 1 {
		return nil
	}

	store := make(map[int]int)

	for i := 0; i < len(arr); i++ {
		if val, found := store[arr[i]]; found {
			return []int{val, i}
		}

		toFind := target - arr[i]

		store[toFind] = i
	}
	return nil
}
