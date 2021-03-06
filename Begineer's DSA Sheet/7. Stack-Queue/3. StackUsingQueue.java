// https://leetcode.com/problems/implement-stack-using-queues/submissions/
class MyStack {
    Queue<Integer> queue;
    Queue<Integer> temp;

    public MyStack() {
        queue = new LinkedList<>();
        temp = new LinkedList<>();

    }

    public void push(int x) {
        while (!queue.isEmpty()) {
            temp.add(queue.poll());
        }
        queue.add(x);
        while (!temp.isEmpty()) {
            queue.add(temp.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */