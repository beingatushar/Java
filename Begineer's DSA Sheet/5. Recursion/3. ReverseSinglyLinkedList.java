// https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

class Solution {
    Node reverseList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
