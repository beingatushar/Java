// https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
class Solution {
    public static Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        slow = reverse(slow);
        while (slow != null) {
            if (head.data != slow.data) {
                return false;
            }
            head = head.next;
            slow = slow.next;
        }
        return true;
    }
}
