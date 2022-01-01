// https://www.codingninjas.com/codestudio/problems/remove-all-nodes-with-value-k_1262145?leftPanelTab=0
/****************************************************************
 * Following is the Linked List node structure
 * 
 * class Node {
 * public:
 * int data;
 * Node *next;
 * Node(int data) {
 * this->data = data;
 * this->next = NULL;
 * }
 * };
 * 
 *****************************************************************/
class Solution {
    public static Node removeNodes(Node head, int k) {
        Node dummy = new Node(-1);
        Node temp = dummy;
        dummy.next = head;
        while (dummy != null && dummy.next != null) {
            if (dummy.next.data == k) {
                dummy.next = dummy.next.next;
            } else {
                dummy = dummy.next;
            }
        }
        return temp.next;
    }
}