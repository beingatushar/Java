// https://leetcode.com/problems/rotate-array/
class Solution {
    public void rotate(int[] arr, int k) {
        while (k >= arr.length)
            k -= arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    private void reverse(int arr[], int i, int j) {
        while (i < j) {
            arr[i] ^= arr[j];
            arr[j] ^= arr[i];
            arr[i] ^= arr[j];
            i++;
            j--;
        }
    }
}