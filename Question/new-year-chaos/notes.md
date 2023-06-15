
## Question: New year chaos

```py
def minimumBribes(q):
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
```
