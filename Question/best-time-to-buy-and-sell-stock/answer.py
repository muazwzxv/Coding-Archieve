
class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0;
        minBuy = prices[0];

        for i in range(len(prices)):
            profit = max(prices[i] - minBuy, profit)
            minBuy = min(minBuy, prices[i])
        
        return profit;

