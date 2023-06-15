

def rotLeft(arr, n):
  if not arr:
      return arr
  
  length = len(arr)
  rotated_array = []
  for i in range(n, n + length):
      rotated_array.append(arr[i % length])

  return rotated_array
