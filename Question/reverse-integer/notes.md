

## Question

Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
```
Input: x = 123
Output: 321
```

Example 2:
```
Input: x = -123
Output: -321
```

Example 3:
```
Input: x = 120
Output: 21
```


## Answer
```py
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        if x.bit_length() >= 32:
            return 0

        reverse = []
        for i in str(abs(x)):
            reverse.append(int(i) % 10)
        
        answerStr = ""
        for i in reversed(reverse):
            answerStr = answerStr + str(i)
        
        answer = int(answerStr)
        if answer.bit_length() >= 32:
            return 0
        
        if x < 0:
            return -abs(int(answer))
        
        return int(answer)
```
