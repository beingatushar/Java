// https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
class GfG {
    // Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for (int i = 0; i < n; i++) {
            if (fast == null)
                return -1;
            fast = fast.next;
        }
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}