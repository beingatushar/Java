// https://www.codingninjas.com/codestudio/problems/cycle-detection-in-a-singly-linked-list_628974?leftPanelTab=0
/*  

    Following is the representation of the Singly Linked List node

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

*/

public class Solution {

    public static boolean detectCycle(Node<Integer> head) {
        if (head == null)
            return false;
        Node<Integer> slow = head;
        Node<Integer> fast = slow;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}