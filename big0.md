# **Big O Section**

## **What is a good code?**

- Readable code
- Scalable code
    - Big O used to measure scalable code
    - Speed of runtime time complexity
    - Memory allocation needed to execute the code

## **3 Pillar of code**

- Readability
- Speed (Time complexity)
- Memory (Space complexity)

## **What is a Big 0**

- A way to measure and scale how fast an algorithm runs regardless of what the code runs on

## **Big 0 Complexity charts**

Horrible

- O(n!)
- O(2^n)
- O(n^2)

Bad

- O(n log n)

Fair

- O(n): Linear time

Good/Excellent

- O(log n)
- O(1)

## **Rule Book of Big O**

Rule 1: Worst Case

- If data is found in the last index array
- Big O only cares about the worst case
- When thinking about scalability, the worst-case matters most
- We do not care about the detail of the algorithm, a rough idea of the number of operations against input is crucial

Rule 2: Remove Constants

- Removing all constants things like assignation and simple variable

`function compressBoxTwice(boxes) {
  boxes.forEach(box => console.log(box))
  boxes.forEach(box => console.log(box))
}
// O(2n) -> O(n)
// Still equates to O(n)`

Rule 3: Different terms for inputs

`// n = boxes[]
// m = boxes2[]

function compressBoxTwice(boxes, boxes2) {
  boxes.forEach(box => console.log(box))
  boxes2.forEach(box => console.log(box))
}
// O(n + m)

function compressBoxTwice(boxes, boxes2) {
  boxes.forEach(box => {
    boxes2.forEach(box2 => {
      console.log(box)
      console.log(box2)
    })
  })
}
// O(n*m)`

Rule 4: Drop non Dominants

- We drop the n as supposed to the n^2 because it has less meaning

`function compressBoxTwice(boxes, boxes2) {

  boxes.forEach(box => console.log(box))
  
  boxes.forEach(box => {
    boxes2.forEach(box2 => {
      console.log(box + box2)
    })
  })
  // O(n + n^2) => O(n^2)
}`

## **Example of Time complexity**

### **O(n) Linear time**

`function compressFirstBox(boxes) {
  boxes.forEach(box => console.log(box))
}`

- as number of input increase, number of operations increase
- n is the number of input

### **O(1) Constant time**

`function compressFirstBox(boxes) {
  console.log(boxes[0])
}`

- Given the number of n, the number of operation will always stays flat

### **O(n^2) Quadratic time**

`function logPairArrays(arr) {
  for (let i = 0; i < arr.length; i++) {
    for (let j = 0; i < arr.length; j++) {
      console.log(arr[i], arr[i])
    }
  }
}`

- Diagnosed as such when there are nested loops
- Nested loops result in the multiplication of Big O
- O(n * n) => O(n^2)

### **O(n!) Factorial time**

- A nested loop added after every iteration
- The ***Oh No*** Loop
- Probably not gonna see it, highest level of skills of fucking up is needed to achieve this

# **Cheat sheet Big O**

## **Big O**

- ***O(1)*** constant - no loop
- ***O(log n)*** logarithmic - Usually searching algorithms have (log n) if they are sorted (Binary search) (not on hash maps though)
- ***O(n)*** Linear - For loops, while loops
- **O(n * log(n))** Log-linear - Sorting operations usually
- ***O(n^2)*** Quadratic - Every element in a collection needs to be compared to every other element. 2 nested loops
- ***O(2^n)*** Exponential - Recursive algorithm solving a problem of size n
- ***O(n!)*** - Adding loop for every element

# **Space Complexity**

- Keeping tabs on memory allocation and use

### **Heap**

- Used to store variable values

### **stack**

- Keep track of function calls

### **What causes space complexity?**

- variables
- Data structures
- Function call
- Allocations