

# Question - https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true

def hourglassSum(arr):
    # Write your code here
    hourglassRow = 4 # 0, 1, 2, 3
    hourglassCol = 4 # 0, 1, 2, 3
    hourglasses = []
    
    for row in range(hourglassRow):
        for col in range(hourglassCol):
            sum = 0
            sum += arr[row][col]
            sum += arr[row][col + 1]
            sum += arr[row][col + 2]
            
            sum += arr[row + 1][col + 1]
            
            sum += arr[row + 2][col]
            sum += arr[row + 2][col + 1]
            sum += arr[row + 2][col + 2]
            
            hourglasses.append(sum)
            
    if len(hourglasses) < 0:
        return 0
    
    return max(hourglasses)
