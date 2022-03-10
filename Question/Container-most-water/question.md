## Container with most water

- You are given an array of positive integers where each integer represents the height of a vertical line on a chart. Find two lines which together with the x-axis forms a container that would hold the greatest amount of water. Return the area of water it would hold

- [link](https://leetcode.com/problems/container-with-most-water/)

## Contraint

- All number are positive integers

## Outline test case

- [7, 1, 2, 3, 9]; 7x4 = 28
- []; 0
- [7]; 0
- [6, 9, 3, 4, 6, 8]; 8x4 = 32

## Figure out solution

### Brute force solution

```go

func solution(height []int) int {
	max := 0
	min := 0
	for i := 0; i < len(height); i++ {
		for j := i + 1; i < len(height); j++ {
			if j == len(height) {
				break
			}
			if height[i] < height[j] {
				min = height[i]
			} else {
				min = height[j]
			}

			area := min * (j - i)
			if max < area {
				max = area
			}
		}
	}
	return max

}
```

### Shifting pointer technique

- Initialize 2 pointers on each end of the list

```go
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

```
