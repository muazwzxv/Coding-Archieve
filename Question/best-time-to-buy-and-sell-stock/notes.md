## Question: 121. Best Time to Buy and Sell Stock

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

### Example 1:

```
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
```

### Example 2:
```
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
```


## Notes
Its important that we buy first before we sell, we wont get back the days after its passed, so we can't do things like 2 pointer and iterate from the end of the array simultaneously

- We set the profit to 0, as the worst case is that we dont profit at all or we dont buy at all
- We set the minBuy to the first day prices
- We iterate the array with intention of checking the profit and the minBuy
- We check if we we're to sell on that day, would the profit be bigger than if we were to sell the previous day
- We check the minBuy, would we get a cheaper deal if we bought today instead of yesterday.


## Solution
```py
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0;
        minBuy = prices[0];

        for i in range(len(prices)):
            profit = max(prices[i] - minBuy, profit)
            minBuy = min(minBuy, prices[i])
        
        return profit;
```

