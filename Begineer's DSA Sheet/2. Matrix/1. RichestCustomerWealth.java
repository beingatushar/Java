// https://leetcode.com/problems/richest-customer-wealth/
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxsum = 0;
        for (int i[] : accounts) {
            int sum = 0;
            for (int j : i) {
                sum += j;
            }
            if (sum > maxsum) {
                maxsum = sum;
            }
        }
        return maxsum;
    }
}