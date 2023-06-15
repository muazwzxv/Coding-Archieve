
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"

---

Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

```java
class Solution {
    
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        
        if (strs == null || strs.length == 0) {
            return sb.toString();
        }
        
        int minimum = strs[0].length();
        for (int i = 0 ; i < strs.length; i++) {
            minimum = Math.min(minimum, strs[i].length());
        }
        
        for (int i = 0; i < minimum; i++) {
            char current = strs[0].charAt(i);
            
            for (String val: strs) {
                if (val.charAt(i) != current) {
                    // All string in array must have similar prefix
                    // once one of the element doesnt have the desired prefix, 
                    // we return 
                    return sb.toString();
                }
            }
            sb.append(current);
        }
        return sb.toString();
    }
}
```
