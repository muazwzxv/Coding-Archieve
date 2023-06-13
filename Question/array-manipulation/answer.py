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
