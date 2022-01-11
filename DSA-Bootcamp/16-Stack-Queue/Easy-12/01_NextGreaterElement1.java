import java.util.Stack;

// https://leetcode.com/problems/next-greater-element-i/
// It can be optimized by using maps
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums2.length];
        for (int i = nums2.length - 1; i >= 0; i--) {
            int value = nums2[i];
            while (!stack.isEmpty() && stack.peek() <= value) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(value);
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    nums1[i] = ans[j];
                    break;
                }
            }
        }
        return nums1;
    }
}