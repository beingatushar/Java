// https://leetcode.com/problems/spiral-matrix-ii/solution/
class Solution {
    public int[][] generateMatrix(int n) {
        int c = 1;
        int arr[][] = new int[n][n];
        int rowstart = 0;
        int rowend = n - 1;
        int colstart = 0;
        int colend = n - 1;
        while (c <= n * n) {
            for (int i = colstart; i <= colend; i++) {
                arr[rowstart][i] = c++;
            }
            rowstart++;
            for (int i = rowstart; i <= rowend; i++) {
                arr[i][colend] = c++;
            }
            colend--;
            for (int i = colend; i >= colstart; i--) {
                arr[rowend][i] = c++;
            }
            rowend--;
            for (int i = rowend; i >= rowstart; i--) {
                arr[i][colstart] = c++;
            }
            colstart++;
        }
        return arr;
    }
}