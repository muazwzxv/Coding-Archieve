
## Question

Harold is a kidnapper who wrote a ransom note, but now he is worried it will be traced back to him through his handwriting. He found a magazine and wants to know if he can cut out whole words from it and use them to create an untraceable replica of his ransom note. The words in his note are case-sensitive and he must use only whole words available in the magazine. He cannot use substrings or concatenation to create the words he needs. 
Given the words in the magazine and the words in the ransom note, print Yes if he can replicate his ransom note exactly using whole words from the magazine; otherwise, print No.

### Sample

```
Sample input 1
--------------

6 4
give me one grand today night
give one grand today

output
Yes
```

```
Sample input 2
--------------

6 4
give me one grand today night
give one grand today

output
No
```

```
Sample input 3
--------------

7 4
ive got a lovely bunch of coconuts
ive got some coconuts

output
No
```


### Answer


```py
def checkMagazine(magazine, note):
    # Write your code here
    flag = True
    store = {}
    for idx, val in enumerate(magazine):
        if val in store:
            store[val] += 1
        else:
            store[val] = 1
    #print(store)
    for i in range(len(note)):
        if note[i] in store and store[note[i]] > 0:
            store[note[i]] =- 1
        else:
            flag = False
            break
        
    if flag == True:
        print("Yes")
    else:
        print("No")
```
