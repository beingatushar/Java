// https://practice.geeksforgeeks.org/problems/remove-duplicate-element-from-sorted-linked-list/1
class GfG {
    // Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head) {
        Node dummy = head;
        while (dummy != null) {
            Node nextNode = dummy.next;
            while ((nextNode != null) && dummy.data == nextNode.data) {
                nextNode = nextNode.next;
            }
            dummy.next = nextNode;
            dummy = dummy.next;
        }
        return head;
    }
}