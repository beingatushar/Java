// https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        for (int r = 0; r < matrix.length; r++) {
            int minColInRow = minColInRow(matrix, r);
            if (isMaxRowInCol(matrix, minColInRow, matrix[r][minColInRow]))
                list.add(matrix[r][minColInRow]);
        }
        return list;
    }

    private boolean isMaxRowInCol(int[][] matrix, int col, int val) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] > val)
                return false;
        }
        return true;
    }

    private int minColInRow(int[][] matrix, int row) {
        int min = 0;
        for (int i = 1; i < matrix[row].length; i++) {
            if (matrix[row][min] > matrix[row][i])
                min = i;
        }
        return min;
    }
}