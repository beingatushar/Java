// https://leetcode.com/problems/running-sum-of-1d-array/
class Solution {
    public int[] runningSum(int[] arr) {
        int ans[] = new int[arr.length];
        ans[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans[i] = ans[i - 1] + arr[i];
        }
        return ans;
    }
}