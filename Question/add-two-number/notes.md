
## Question: 2 Add two number

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:
```
2 -> 4 -> 3
5 -> 6 -> 4
-----------
7 -> 0 -> 8

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
```

Example 2:
```
Input: l1 = [0], l2 = [0]
Output: [0]
```

Example 3:
```
Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
```

## Code

```py
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        head = ListNode(0)
        curr = head
        carry = 0
        while l1 != None or l2 != None or carry != 0:
            l1Val = l1.val if l1 else 0
            l2Val = l2.val if l2 else 0
            colSum = l1Val + l2Val + carry

            # Get the carry value
            carry = colSum // 10

            node = ListNode(colSum % 10)
            curr.next = node
            curr = node

            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
        return head.next
```
