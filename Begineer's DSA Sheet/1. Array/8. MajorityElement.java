
// https://leetcode.com/problems/majority-element/submissions/
class Solution {
    public int majorityElement(int[] arr) {
        int count = 0;
        int candidate = 0;
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }
            count += (candidate == num) ? 1 : -1;
        }
        return candidate;
    }
}

// //
// https://www.codingninjas.com/codestudio/problems/majority-element_842495?leftPanelTab=1
// import java.util.Arrays;

// class Solution {
// public static int findMajority(int[] arr, int n) {
// Arrays.sort(arr);
// int x = arr[arr.length / 2];
// int c = 0;
// for (int i : arr) {
// if (i == x) {
// c++;
// }
// }
// if (c <= arr.length / 2) {
// return -1;
// }
// return x;
// }
// }