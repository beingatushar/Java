// https://leetcode.com/problems/jump-game/submissions/
// Not an optimized solution
class Solution {
    public boolean canJump(int[] nums) {
        int check[] = new int[nums.length];
        return check(nums, 0, check);
    }

    public boolean check(int[] nums, int start, int[] check) {
        if (start >= nums.length) {
            return false;
        }
        if (start == nums.length - 1) {
            check[start] = 1;
            return true;
        }
        int k = (start + nums[start]);
        if (k < nums.length) {
            if (check[k] == 1) {
                return true;
            }
            if (check[k] == -1) {
                return false;
            }
        }
        for (int i = 1; i <= nums[start]; i++) {
            if (check(nums, start + i, check) == true) {
                check[start + i] = 1;
                return true;
            }
        }
        check[start] = -1;
        return false;
    }
}