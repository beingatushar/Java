// https://leetcode.com/problems/available-captures-for-rook/
class Solution {

    public int numRookCaptures(char[][] board) {
        int c = 0;
        int row = -1;
        int col = -1;
        for (int i = 0; i < 8 && row == -1; i++) {
            for (int j = 0; j < 8 && col == -1; j++) {
                if (board[i][j] == 'R') {
                    row = i;
                    col = j;
                }
            }
        }
        for (int i = row; i >= 0; i--) {
            char x = board[i][col];
            if (x == 'B') {
                break;
            }
            if (x == 'p') {
                c++;
                break;
            }
        }
        for (int i = row; i < 8; i++) {
            char x = board[i][col];
            if (x == 'B') {
                break;
            }
            if (x == 'p') {
                c++;
                break;
            }
        }
        for (int i = col; i >= 0; i--) {
            char x = board[row][i];
            if (x == 'B') {
                break;
            }
            if (x == 'p') {
                c++;
                break;
            }
        }
        for (int i = col; i < 8; i++) {
            char x = board[row][i];
            if (x == 'B') {
                break;
            }
            if (x == 'p') {
                c++;
                break;
            }
        }
        return c;
    }
}