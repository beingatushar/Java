// https://www.codingninjas.com/codestudio/problems/occurs-once_1214969?leftPanelTab=0
class Solution {
    public static int occursOnce(int[] a, int n) {
        int ans = 0;
        for (int i : a)
            ans ^= i;
        return ans ^ 0;
    }
}
