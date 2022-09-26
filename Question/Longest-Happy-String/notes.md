

### Question

A string s is called happy if it satisfies the following conditions:

s only contains the letters 'a', 'b', and 'c'.
s does not contain any of "aaa", "bbb", or "ccc" as a substring.
s contains at most a occurrences of the letter 'a'.
s contains at most b occurrences of the letter 'b'.
s contains at most c occurrences of the letter 'c'.
Given three integers a, b, and c, return the longest possible happy string. If there are multiple longest happy strings, return any of them. If there is no such string, return the empty string "".

A substring is a contiguous sequence of characters within a string.

```java
// you can also use imports, for example:
import java.util.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public String solution(int A, int B, int C) {
        // write your code in Java SE 8

        StringBuilder sb = new StringBuilder();
     
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a1, a2) -> a2[0]-a1[0]);
        if (A > 0){
            priorityQueue.add(new int[]{A, 'a'});
        }
        if (B > 0){
            priorityQueue.add(new int[]{B, 'b'});
        }
        if (C > 0){
            priorityQueue.add(new int[]{C, 'c'});
        }

        while (!priorityQueue.isEmpty()){
            int[] current = priorityQueue.poll();
            int length = sb.length();

            // checks if last 2 characters are the same
            if (length >= 2 
                && current[1] == sb.charAt(length - 1) 
                && current[1] == sb.charAt(length - 2)) {

                //No other characters, return directly
                if (priorityQueue.isEmpty()){
                    break;
                }

                int[] next = priorityQueue.poll();
                sb.append((char) next[1]);

                //This character will not be put back unless it remains greater than 0
                if ((--next[0]) != 0){
                    priorityQueue.add(next);
                }

                //Play back unused char s
                priorityQueue.add(current);

            } else {
                //No more than 3 repeats
                sb.append((char) current[1]);

                if ((--current[0]) != 0){
                    priorityQueue.add(current);
                }
            }
        }
        return sb.toString();
    }
}
```