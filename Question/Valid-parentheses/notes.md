
### Question
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:
- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

### Solution

```java
class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack();
        
        for (int i = 0; i < s.length(); i++) {
            char token = s.charAt(i);
            
            if (token == '{' || token == '[' || token == '(') {
                stack.push(token);
                continue;
            }
            
            if (!stack.isEmpty()) {
                if (stack.peek() == '{' && token != '}')
                    return false;
            
                if (stack.peek() == '[' && token != ']')
                    return false;
                
                if (stack.peek() == '(' && token != ')')
                    return false;
                
                stack.pop();
            } else {
                return false;
            }
        }
        
       return (stack.isEmpty());
    }
}
```