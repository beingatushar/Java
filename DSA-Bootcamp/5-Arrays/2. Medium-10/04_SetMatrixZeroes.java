// https://leetcode.com/problems/set-matrix-zeroes/submissions/
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rowi = new ArrayList<>();
        ArrayList<Integer> coli = new ArrayList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 0) {
                    rowi.add(row);
                    coli.add(col);
                }
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (rowi.contains(row) || coli.contains(col))
                    matrix[row][col] = 0;
            }
        }
    }
}