## Two sum

- Given an array of integers, return the indices of the two numbers that add up to a given target
- [1, 3, 7, 9, 2]
- Target 11

## Steps

### Step 1: Verify the constraints

- Ask for constraints regarding the question
  - All all the integers a positive number?
  - All are positive
  - Are they duplicate numbrs in the array
    - No, there are no duplicates
  - Are we always able to find a solution
    - Yes
  - Will there be an empty array or only 1 value in the array
  - What to return if there is no solution
    - Return null
  - Can there be multiple pairs of solution
    - Only one pair of solution

### Step 2: Outline the test cases

- [1, 3, 7, 9, 2]; t = 11 return [3, 4]
- [1, 3, 7, 9, 2]; t = 25 return null
- []; t = 25 return null
- [5]; t = 10 return null
- [1, 6]; t = 7 return [0, 1]

### Step 3: Figure out a solution without code

- Brute force method of iterating and checking all pair

# Solution

### Brute force solution

```go
func solve(arr []int, target int) []int {

	if len(arr) == 0 || len(arr) == 1 {
		return nil
	}

	for i := 0; i < len(arr); i++ {
		for j := i + 1; j < len(arr); j++ {
			if target-arr[i] == arr[j] {
				return []int{i, j}
			}
		}
	}
	return nil
}
```

### Optimizing the brute force solution

```go

// For this solution we use hashmap to optimize our solution
// We store the value in a map due to the fast lookup in map n(1)
func twoSum(nums []int, target int) []int {

  if len(nums) == 0 || len(nums) == 1 {
    return nil
  }

	store := make(map[int]int)

  for i := 0; i < len(nums); i++ {
		if val, found := store[nums[i]]; found {
			return []int{val, i}
		}

		toFind := target - nums[i]

		store[toFind] = i
	}
	return nil
}

```
