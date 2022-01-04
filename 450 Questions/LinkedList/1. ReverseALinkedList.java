// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1#

class Solution {
    // Iterative:
    // Time Complexity: O(n)
    // Space Compexity: O(1)
    Node reverseList(Node head) {
        Node prev = null;
        while (head != null) {
            Node next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    // // Recursive:
    // // Time Complexity: O(n)
    // // Space Complexity: O(n)
    // Node reverseList(Node head) {
    // if (head == null || head.next == null) {
    // return head;
    // }
    // Node newHead = reverseList(head.next);
    // head.next.next = head;
    // head.next = null;
    // return newHead;
    // }
}
