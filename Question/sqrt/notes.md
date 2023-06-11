
## Question: Sqrt(x)

Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:

```
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.
```
Example 2:

```
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
```


### Notes

From this question, one thing for sure is that, the square root of x will never be more than half of the value of x

For example, given x = 9. Of course we know the answer is 3, the answer to the square root of 9 could never be higher than the half of value of 9

Given x = 9, half of x is 4.5. The square root of 9 will confirmed be less that the half of x

## Code
```python
# Note

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
```


