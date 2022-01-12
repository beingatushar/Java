// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for (int n : nums) {
            int x = 1;
            while (!(n < 10)) {
                x++;
                n /= 10;
            }
            if (x % 2 == 0)
                c++;
        }
        return c;
    }
}