
## Question: Contains duplicate

Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

Example 1:
```
Input: nums = [1,2,3,1]
Output: true
```

Example 2:
```
Input: nums = [1,2,3,4]
Output: false
```

Example 3:
```
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
```

## Notes
- Create a map to keep track of seen item {key: occurence}
- We iterate the list so look at each of the element
- For everytime we see a duplicate, we increment the counter of map value and return True (we don't even use the value of the map lol)
- Each time we see something we havent found in the map, we insert in the map
- In the end if there's no occurence, we simply return False


## Code

```python
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen = {}
        for num in nums:
            if num in seen:
                seen[num] += 1
                return True
            seen[num] = 1
        return False
```
