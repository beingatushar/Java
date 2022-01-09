// https://leetcode.com/problems/spiral-matrix/submissions/
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr = new LinkedList<>();
        int rowstart = 0;
        int rowend = matrix.length - 1;
        int colstart = 0;
        int colend = matrix[0].length - 1;
        int c = matrix.length * matrix[0].length;
        while (c > 0) {
            for (int i = colstart; c > 0 & i <= colend; i++) {
                arr.add(matrix[rowstart][i]);
                c--;
            }
            rowstart++;
            for (int i = rowstart; c > 0 & i <= rowend; i++) {
                arr.add(matrix[i][colend]);
                c--;
            }
            colend--;
            for (int i = colend; c > 0 & i >= colstart; i--) {
                arr.add(matrix[rowend][i]);
                c--;
            }
            rowend--;
            for (int i = rowend; c > 0 & i >= rowstart; i--) {
                arr.add(matrix[i][colstart]);
                c--;
            }
            colstart++;
        }
        return arr;
    }
}