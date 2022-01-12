// https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int arr[][] = new int[m][n];
        int[] row = new int[m];
        int[] col = new int[n];
        for (int i = 0; i < indices.length; i++) {
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] += row[i];
                arr[i][j] += col[j];
            }
        }
        int c = 0;
        for (int[] i : arr) {
            for (int j : i) {
                if (j % 2 != 0)
                    c++;
            }
        }
        return c;
    }
}