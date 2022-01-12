// https://leetcode.com/problems/transpose-matrix/
class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
}