// https://leetcode.com/problems/reshape-the-matrix/
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (r * c != m * n) {
            return mat;
        }
        int ri = 0;
        int ci = 0;
        int arr[][] = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = mat[ri][ci];
                ci++;
                if (ci == n) {
                    ci = 0;
                    ri++;
                }
            }
        }
        return arr;
    }
}