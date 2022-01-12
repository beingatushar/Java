import java.util.ArrayList;

// https://leetcode.com/problems/create-target-array-in-the-given-order/
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ans = new ArrayList<>(nums.length);
        for (int i = 0; i < index.length; i++) {
            ans.add(index[i], nums[i]);
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans.get(i);
        }
        return nums;
    }
}