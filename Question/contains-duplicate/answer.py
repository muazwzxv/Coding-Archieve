
class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        seen = {}
        for num in nums:
            if num in seen:
                seen[num] += 1
                return True
            seen[num] = 1
        return False



