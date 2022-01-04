// https://leetcode.com/problems/min-stack/submissions/
class Pair {
    int data, minTillNow;

    public Pair(int data, int minTillNow) {
        this.data = data;
        this.minTillNow = minTillNow;
    }
}

class MinStack {
    Stack<Pair> stack;

    public MinStack() {
        stack = new Stack<Pair>();
    }

    public void push(int val) {
        if (stack.isEmpty() || stack.peek().minTillNow > val) {
            stack.push(new Pair(val, val));
        } else {
            stack.push(new Pair(val, stack.peek().minTillNow));
        }
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek().data;
    }

    public int getMin() {
        return stack.peek().minTillNow;
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