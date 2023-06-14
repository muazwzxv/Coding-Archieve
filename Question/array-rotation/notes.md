
## Question: Array Rotation

A left rotation operation on an array shifts each of the array's elements 1 units to the left. For example, if 2 left rotations are performed on array [1, 2, 3, 4, 5], then the array would become [3, 4, 5, 1, 2]. Note that the lowest index item moves to the highest index in a rotation. This is called a circular array

Given an array a of n integers and a number, d, perform d left rotations on the array. Return the updated array to be printed as single line of space-separated integers


### Sample input
```
5 4
1 2 3 4 5
```

### Sample output
```
5 1 2 3 4
```

### Code
```py
def rotLeft(arr, n):
  if not arr:
      return arr
  
  length = len(arr)
  rotated_array = []
  for i in range(n, n + length):
      rotated_array.append(arr[i % length])

  return rotated_array`
``
