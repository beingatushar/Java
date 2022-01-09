// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/
class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        for (int i = 0; i < n / 2; i++) {
            arr[i] = i - n;
            arr[i + n / 2] = n - i;
        }
        return arr;
    }
}