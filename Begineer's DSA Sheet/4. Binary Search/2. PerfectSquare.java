// https://www.codingninjas.com/codestudio/problems/valid-perfect-square_1082552?leftPanelTab=0
public class Solution {
    public static boolean isPerfectSquare(long n) {
        long start = 1;
        long end = (n + 1) / 2;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (n == mid * mid) {
                return true;
            }
            if (n < mid * mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}