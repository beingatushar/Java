// https://www.codingninjas.com/codestudio/problems/delete-node-in-ll_5881?leftPanelTab=0
/****************************************************************
 * 
 * Following is the Node class already written for the Linked List
 * 
 * class LinkedListNode<T> {
 * T data;
 * LinkedListNode<T> next;
 * 
 * public LinkedListNode(T data) {
 * this.data = data;
 * }
 * }
 * 
 *****************************************************************/
class Solution {
    public static LinkedListNode<Integer> deleteNode(LinkedListNode<Integer> head, int pos) {
        LinkedListNode<Integer> dummy = new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> temp = dummy;
        temp.next = head;
        while (pos-- > 0 && temp != null) {
            temp = temp.next;
        }
        if (temp != null && temp.next != null)
            temp.next = temp.next.next;
        return dummy.next;
    }
}
