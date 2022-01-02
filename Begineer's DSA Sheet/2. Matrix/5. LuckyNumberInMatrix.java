import java.util.LinkedList;
import java.util.List;

// https://leetcode.com/problems/lucky-numbers-in-a-matrix/submissions/
class Solution {
    public int minInRow(int arr[][], int row) {
        int min = arr[row][0];
        for (int i = 0; i < arr[row].length; i++) {
            if (arr[row][i] < min) {
                min = arr[row][i];
            }
        }
        return min;
    }

    public int maxInCol(int arr[][], int col) {
        int max = arr[0][col];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] > max) {
                max = arr[i][col];
            }
        }
        return max;
    }

    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new LinkedList<>();
        for (int r = 0; r < matrix.length; r++) {
            int min = minInRow(matrix, r);
            for (int c = 0; c < matrix[r].length; c++) {
                if (min == maxInCol(matrix, c)) {
                    ans.add(matrix[r][c]);
                }
            }
        }
        return ans;
    }
}