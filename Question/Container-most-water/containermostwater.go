package main

import "fmt"

func main() {
	input := []int{2, 3, 4, 5, 18, 17, 6}
	fmt.Println(solution(input))

}

func solution(height []int) int {

	p1 := 0
	p2 := len(height) - 1
	min := 0
	max := 0

	for p1 < p2 {
		if height[p1] < height[p2] {
			min = height[p1]
		} else {
			min = height[p2]
		}

		area := min * (p2 - p1)

		if area > max {
			max = area
		}

		if height[p1] <= height[p2] {
			p1++
		} else {
			p2--
		}

	}
	return max
}
