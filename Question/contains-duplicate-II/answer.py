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
