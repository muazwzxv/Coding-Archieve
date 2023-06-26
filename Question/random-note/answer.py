
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
