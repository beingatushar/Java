// https://www.codingninjas.com/codestudio/problems/power-of-two_893061
class Solution {
    public static boolean isPowerOfTwo(int n) {
        if (n < 0)
            return false;
        if (n == 0 || n == 1) {
            return true;
        }
        if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        }
        return false;
    }
}
