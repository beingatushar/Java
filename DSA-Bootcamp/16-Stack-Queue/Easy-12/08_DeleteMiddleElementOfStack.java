import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/delete-middle-element-of-a-stack/1/#
class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> stack, int size) {
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < Math.ceil(size / 2); i++) {
            temp.push(stack.pop());
        }
        stack.pop();
        while (!temp.isEmpty())
            stack.push(temp.pop());
    }
}