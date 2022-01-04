// https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1#
class Solution {
    Node divide(int N, Node head) {
        Node dummy = head;
        Node oddHead = new Node(-1);
        Node evenHead = new Node(-1);
        Node oddTail = oddHead;
        Node evenTail = evenHead;
        while (dummy != null) {
            if (dummy.data % 2 == 0) {
                evenTail.next = dummy;
                evenTail = evenTail.next;
                dummy = dummy.next;
            } else {
                oddTail.next = dummy;
                oddTail = oddTail.next;
                dummy = dummy.next;
            }

        }
        evenHead = evenHead.next;
        oddHead = oddHead.next;
        if (evenHead == null) {
            return oddHead;
        }
        evenTail.next = null;
        oddTail.next = null;
        evenTail.next = oddHead;
        return evenHead;
    }
}