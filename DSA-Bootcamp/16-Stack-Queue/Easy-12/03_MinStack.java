import java.util.Stack;

// https://leetcode.com/problems/min-stack/
class MinStack {
    Stack<Pair<Integer, Integer>> stack;

    public MinStack() {
        stack = new Stack<Pair<Integer, Integer>>();
    }

    public void push(int val) {
        if (stack.isEmpty() || stack.peek().getValue() > val) {
            stack.push(new Pair<>(val, val));
        } else {
            stack.push(new Pair<>(val, stack.peek().getValue()));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().getKey();
    }

    public int getMin() {
        return stack.peek().getValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */