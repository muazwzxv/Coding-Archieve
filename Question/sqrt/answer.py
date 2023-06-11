
# Division using / -> returns answer in floating point
# Division using // -> returns integer value

class Solution:
    def mySqrt(self, x: int) -> int:

        if x == 0:
            return 0        

        start = 1
        end = x // 2

        while start <= end:
            mid = (start + end) // 2

            sqr = mid * mid
            if sqr == x:
                return mid

            if sqr > x:
                end = mid - 1
            else:
                start = mid + 1
        
        return end
