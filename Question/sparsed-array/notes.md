
## Hackerrank: Sparsed array

There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.

### Example
```
stringList =  ['ab', 'ab', 'abc']
queries = ['ab', 'abc', 'bc']

```

### Description
Complete the function matchingStrings in the editor below. The function must return an array of integers representing the frequency of occurrence of each query string in stringList.

matchingStrings has the following parameters:
- string stringList[n] - an array of strings to search
- string queries[q] - an array of query strings

```py
def matchingStrings(stringList, queries):
    # Write your code here
    answer = [0 for i in range(len(queries))] 
    
    for search in stringList:
        for i in range(len(queries)):
            if search == queries[i]:
                answer[i] = answer[i] + 1
                
    return answer
```
