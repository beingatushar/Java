// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int price = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < price) {
                price = prices[i];
            }
            if (prices[i] - price > profit) {
                profit = prices[i] - price;
            }
        }
        return profit;
    }
}