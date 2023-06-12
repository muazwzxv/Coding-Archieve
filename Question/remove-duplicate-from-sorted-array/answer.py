class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        seen = {}
        for key, val in enumerate(nums):
            if val not in seen:
                seen[val] = key

        count = 0
        for key, val in seen.items():
            nums[count] = key
            count+=1 

        return count
