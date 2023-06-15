
def matchingStrings(stringList, queries):
    # Write your code here
    answer = [0 for i in range(len(queries))] 
    
    for search in stringList:
        for i in range(len(queries)):
            if search == queries[i]:
                answer[i] = answer[i] + 1
                
    return answer
