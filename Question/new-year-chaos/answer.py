import math

# 1) [1, 2, 3, 4, 5]

# -> x - (i + 1) > 2
# -> 1 - (0 + 1) > 2, 0 > 2, false
# -> 2 - (1 + 1) > 2, 0 > 2, false
# -> 3 - (2 + 1) > 2, 0 > 2, false
# -> 4 - (3 + 1) > 2, 0 > 2, false
# -> 5 - (4 + 1) > 2, 0 > 2, false

# 2) [4 - 1 - 2 - 3 - 5] 

# -> x - (i + 1) > 2
# -> 4 - (0 + 1) > 2, 3 > 2, true 
# -> 1 - (1 + 1) > 2, -1 > 2, false 
# -> 2 - (2 + 1) > 2, -1 > 2, false
# -> 3 - (3 + 1) > 2, -1 > 2, false
# -> 5 - (4 + 1) > 2, 0 > 2, false

def minimumBribes4(q):
    bribes = 0
    chaotic = False

    for i, val in enumerate(q):
        if val - (i + 1) > 2:
            chaotic = True

        for j in range(i):
            if q[j] > q[i]:
                bribes += 1

    if chaotic:
        print("Too chaotic")
    else:
        print(bribes)

def minimumBribes3(q):
    bribes = 0
    chaotic = False

    for i in range(len(q)):
        if q[i] - (i + 1) > 2:
            chaotic = True

        for j in range(i):
            if q[j] > q[i]:
                bribes += 1
    if chaotic:
        print("Too chaotic")
    else:
        print(bribes)


def minimumBribes2(q):
    bribes = 0
    chaotic = False
    for i in range(len(q)):
        if q[i] - (i + 1) > 2:
            chaotic = True

        for j in range(i):
            if q[j] > q[i]:
                bribes += 1
    if chaotic:
        print("Too chaotic")
    else:
        print(bribes)


def minimumBribes(q):
    original = q.copy()
    original.sort()
    
    start = 0
    end = len(q) - 1
    
    maxJump = 0
    minJump = 10
    while end >= start:
        jump = 0
        for i in range(len(q)):
            if original[end] == q[i]:
                jump = abs(end - i)
                break
        
        maxJump = max(maxJump, jump)
        minJump = min(minJump, jump)

        end = end - 1
    
    if maxJump > 2:
        print(maxJump)
        print("Too chaotic")
    else:
        print(minJump)

minimumBribes4([2, 1, 5, 3, 4])
minimumBribes4([2, 5, 1, 3, 4])


