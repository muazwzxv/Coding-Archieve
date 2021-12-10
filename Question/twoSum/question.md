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
