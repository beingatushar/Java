import java.util.ArrayList;
// https://www.codingninjas.com/codestudio/problems/stocks-are-profitable_893405?leftPanelTab=0

class Solution {
    public static int maximumProfit(ArrayList<Integer> prices) {
        int profit = 0;
        int price = Integer.MAX_VALUE;
        for (int i : prices) {
            if (i < price) {
                price = i;
            }
            if (i - price > profit) {
                profit = i - price;
            }
        }
        return profit;
    }
}