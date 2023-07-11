
## Question

Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


Example 1:
```
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
```

Example 2:
```
Input: strs = [""]
Output: [[""]]
```

Example 3:
```
Input: strs = ["a"]
Output: [["a"]]
```


## Solution

```py
# Some test case fails due to time exceeded
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        answer = []
        if strs == [""]:
            return [[""]]

        for i in strs:
            if len(answer) == 0:
                answer.append([i])
            else:
                newCell = True
                for j in answer:
                    if self.isAnagram(j[0], i) == True:
                        j.append(i)
                        newCell = False
                        break

                if newCell == True:
                    answer.append([i])
        return answer
            

    def isAnagram(selft, str1: str, str2: str) -> bool:
        if str1 == "" and str2 == "":
            return True 
     
        seen = {}
        for i in str1:
            if i not in seen:
                seen[i] = 1
            seen[i] += 1

        for i in str2:
            if i not in seen:
                return False
            seen[i] -= 1

        for i in seen.values():
           if i != 1:
               return False
        
        return True
```
