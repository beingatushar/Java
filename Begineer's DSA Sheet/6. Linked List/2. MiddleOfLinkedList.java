// https://www.codingninjas.com/codestudio/problems/middle-of-linked-list_973250?leftPanelTab=1
/****************************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node
 * {
 * public:
 * int data;
 * Node next;
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * };
 * 
 *****************************************************************/
class Solution {
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
