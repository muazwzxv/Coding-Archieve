
# Question - https://www.hackerrank.com/challenges/dynamic-array/problem?isFullScreen=true

def dynamicArray(n, queries):
    last_answer = 0
    seqList = [[] for _ in range(n)]
    answerList = []

    for q in queries:
        option, x, y = q

        if option == 1:
            seqList[(x ^ last_answer) % n].append(y)
        elif option == 2:
            s = seqList[(x ^ last_answer) % n]
            last_answer = s[y % len(s)]
            answerList.append(last_answer)
            
    return answerList
