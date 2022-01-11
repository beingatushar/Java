import java.util.Queue;
import java.util.Stack;

// https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1/#
class GfG {
    // Function to reverse first k elements of a queue.
    public Queue<Integer> modifyQueue(Queue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty())
            queue.add(stack.pop());
        for (int i = 0; i < queue.size() - k; i++) {
            queue.add(queue.poll());
        }
        return queue;
    }
}
