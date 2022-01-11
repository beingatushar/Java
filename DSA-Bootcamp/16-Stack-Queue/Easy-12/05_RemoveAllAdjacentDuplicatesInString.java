import java.util.Stack;

// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder ans = new StringBuilder("");
        for (int i = s.length() - 1; i >= 0; i--) {
            if (stack.isEmpty() || stack.peek() != s.charAt(i)) {
                stack.push(s.charAt(i));
            } else {
                stack.pop();
            }
        }
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return ans.toString();
    }
}