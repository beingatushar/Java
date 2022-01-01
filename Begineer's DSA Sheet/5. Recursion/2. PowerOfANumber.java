// https://www.codingninjas.com/codestudio/problems/find-power-of-a-number_893198
class Solution {
    public static long Pow(int n, int x) {
        if (n == 0 && x == 0)
            return 1;
        if (n == 0)
            return 0;
        if (x == 0)
            return 1;
        long ans = Pow(n, x / 2);
        if (x % 2 == 0)
            return ans * ans;
        return n * ans * ans;
    }
}
