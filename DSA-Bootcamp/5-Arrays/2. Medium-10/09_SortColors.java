// https://leetcode.com/problems/sort-colors/
class Solution {
    public void sortColors(int[] nums) {
        int red = 0, white = 0;

        for (int n : nums) {
            if (n == 0) {
                red++;
            } else if (n == 1) {
                white++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < red) {
                nums[i] = 0;
            } else if (i < red + white) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }

        }
    }
}