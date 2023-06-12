
## Question
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:
```
Input: nums = [1,2,3,1], k = 3
Output: true
```

Example 2:
```
Input: nums = [1,0,1,1], k = 1
Output: true
```

Example 3:
```
Input: nums = [1,2,3,1,2,3], k = 2
Output: false
```

## Notes
### Pretty weird question for sure hahaha, description could've been clearer in my opinion

So basically, what we have to do is traverse the array, until we first found a duplicate, once we found the duplicate then we have to check the calculation and conditions abs(i - j) <= k. i being the index of the first seen number and j being the index of the duplicate found. 

- Create a map to store seen duplicates, map-key being the value in the array, map-value being the index position in the array
- Iterate the array and check if the value exists in the map
- If it doesnt exist, we store in the map and continue iterating
- If we found a match, we get the indices of the previously seen duplicate and run the calculation abs(i - j) <= k


## Code
```py
class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
        seen = {}
        for key, val in enumerate(nums):
            if val not in seen:
                seen[val] = key
            else:
                if abs(seen.get(val) - key) <= k:
                    return True
                else:
                    seen[val] = key
        
        return False
```
