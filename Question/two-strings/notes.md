
## Questions

Given two strings, determine if they share a common substring. A substring may be as small as one character.

### Example

```
Example 1
---------
s1 = 'and'
s2 = 'art'

Answer
-----
These share a substring, YES
```

```
Example 2
---------
s1 = 'be'
s2 = 'cat'

Answer
-----
These do not share a substring, NO
```

### Answer
```
def twoStrings(s1, s2):
    # Write your code here
    seen = {}
    
    for i in s1:
        if i in seen:
            seen[i] += 1
        else:
            seen[i] = 1
            
    for i in s2:
        if i in seen:
            return "YES"
    return "NO"
```
