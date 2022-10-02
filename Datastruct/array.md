
## ***Arrays***

## Access
- Time O(1) 
- Space O(1)
- If we want to access index N , we just take the memory address of first element and + N

## Set
- Constant time O(1)
- Space O(1)
- If we want to access index N , we just take the memory address of first element and + N

## Travers/Search
- Time O(n)
- Space O(1)
- We have to check each element when traversing

## Copy
- Time O(n)
- Space O(n)
- We have to traverse each element of the array to copy it to a new array

## Insert
- Static arrays
	- Fixed size
- Dynamic arrays
	- O(1) Insertion time
### At beginning
- Static arrays
	- O(n), Because we to copy existing array and make the first element empty to fit the insertion 
- Dynamic arrays
	- O(n), Because we to copy existing array and make the first element empty to fit the insertion 
### At end
- Static arrays
	- O(n), Because we have to traverse the array to know if the next slot in memory is empty or not 
- Dynamic arrays
	- O(1), Because the OS allocates extra space 
### Somewhere in between
- Static arrays
	- O(n), Because we have to copy the array and re-index to fit the new element
- Dynamic arrays
	- O(n), Because we have to shift the element the element to fit  

## Remove
### At beginning
- O(n), Because we have to shift the element after we delete it  
### At end
- O(1), Because we don't need to re-index anything  
### Somewhere in between
- O(n), Because we have to shift the element after we delete it  

