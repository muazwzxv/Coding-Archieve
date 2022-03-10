package main

func main() {


}

func trap(heights []int) int {
	count := 0

	right := 0
	maxR := 0

	left := 0
	maxL := 0

	for i := 0 ; i < len(heights) ; i++ {
		if heights[0] == 0 {
			continue
		}

		left = i
		right = i

		for (left >= 0) {
			maxL = func() int {
				if maxL < heights[left] {
					return heights[left]
				} else {
					return maxL
				}
			} ()

			left--
		}

		for (right < len(heights)) {
			maxR = func(right int, height int) int {
				if right < height {
					return height
				} else {
					return right
				}
			} (maxR, heights[right]) 

			right++
		}

		current := func(left int, right int) int {
			if left < right {
				return left - heights[i]
			}
			return right - heights[i]
		} (maxL, maxR)

		if current >= 0 {
			count = count + current
		}
		
		return count
	}

}