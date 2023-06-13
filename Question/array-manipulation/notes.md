
## Question: Array Manipulation

Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in the array.


Example
-------
n = 10
queries = [[1, 5,3], [4, 8, 7], [6, 9, 1]]

Queries are interpreted as follows
```
  a b k
  1 5 3
  4 8 7
  6 9 1
```

Add the values of K between the indices a and b inclusive
```
index->	 1 2 3  4  5 6 7 8 9 10
        [0,0,0, 0, 0,0,0,0,0, 0]
        [3,3,3, 3, 3,0,0,0,0, 0]
        [3,3,3,10,10,7,7,7,0, 0]
        [3,3,3,10,10,8,8,8,1, 0]
```
The largest value is 10 after all operations are performed

### Function Description
Complete the function arrayManipulation in the editor below

arrayManipulation has the following parameters:
- int n - the number of elements in the array
- int queries[q][3] - a two dimensional array of queries where each queries[i] contains three integers, a, b and k

Returns
- int - the maximum value in the resultant array

### Sample input
```
5 3
1 2 100
2 5 100
3 4 100
```

### Sample output
```
200
```

### Explanation
After the first update the list is 100 100 0 0 0
After the second update list is 100 200 100 100 100
After the third update 100 200 200 200 100

The maximum value is 200


## Code
```py
#
# Complete the 'arrayManipulation' function below.
#
# The function is expected to return a LONG_INTEGER.
# The function accepts following parameters:
#  1. INTEGER n
#  2. 2D_INTEGER_ARRAY queries
#

def arrayManipulation(n, queries):
    # Write your code here
    answer = [0] * n
    max = 0
    
    for idx, query in enumerate(queries):
        start = query[0] - 1
        end = query[1]
        to_add = query[2]
        
        for i in range(start, end):
            print(i, "range for add")
            sum = answer[i] + to_add
            answer[i] = sum
            if sum > max:
                max = sum
    return max
```
