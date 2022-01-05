// https://leetcode.com/problems/shuffle-the-array/
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[] = new int[nums.length];
        for (int i = 0; i < 2 * n; i++) {
            if (i % 2 == 0)
                arr[i] = nums[i];
            else
                arr[i] = nums[n + i - 1];
        }
        return arr;
    }
}