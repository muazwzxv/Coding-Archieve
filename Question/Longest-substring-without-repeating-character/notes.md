

## Longest Substring without repeating character
- Given a string, find the length of the longest substring without repeating characters

## To note
### Is the substring contiguous
- Substring or a subsequence

## Test case
- "abccabb" = 3
- "cccccc" = 1
- "" = 0
- "abcbda" = 4

### New concept from this question
- Sliding window technique
- Having a smaller area or some part of the string/array to look into


``` java
# My attempt to the solution
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Queue<Character> queue = new LinkedList<Character>();
        
        int longest = 0;
        int size = s.length() - 1;
        
        for (int i = 0; i < size; i++) {
            char current = s.charAt(i);
            
            if (!queue.contains(current)) {
                queue.add(current);
                if (queue.size() > longest)
                    longest = queue.size();
            } else {
                // clear the queue before adding the current element
                queue.clear();
                queue.add(current);         
            } 
        }
        return longest;
    }
}
```

```java
# Brute force accepted solution
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) return s.length();
       
        int longest = 0;
        
        for (int left = 0; left < s.length(); left++) {
            Map<Character, Boolean> seen = new HashMap<>();
            
            for (int right = left; right < s.length(); right++) {
                char current = s.charAt(right);
                
                if (!seen.containsKey(current)) {
                    seen.put(current, true);
                    if (seen.size() > longest) 
                        longest = seen.size();
                } else {
                    break;
                }
            }
        }
        return longest;
    }
}
```