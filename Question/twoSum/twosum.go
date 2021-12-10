package main

import "fmt"

func main() {

	input := []int{1, 3, 7, 9, 2}
	fmt.Println(solve(input, 11))

}

func solve(arr []int, target int) []int {

	var solution []int

	if len(arr) == 0 || len(arr) == 1 {
		return nil
	}

	for i := 0; i < len(arr); i++ {
		for j := i + 1; j < len(arr); j++ {
			if target-arr[i] == arr[j] {
				solution = append(solution, i, j)
				return solution
			}

			continue
		}
	}

	return nil
}
