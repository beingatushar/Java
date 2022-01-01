// https://www.codingninjas.com/codestudio/problems/move-zeros-to-left_1094877?leftPanelTab=1
class Solution {
    public static void moveZerosToLeft(int[] arr, int n) {
        int zero = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                zero++;
            } else {
                arr[i + zero] = arr[i];
            }
        }
        for (int i = 0; i < zero; i++) {
            arr[i] = 0;
        }
    }
}
