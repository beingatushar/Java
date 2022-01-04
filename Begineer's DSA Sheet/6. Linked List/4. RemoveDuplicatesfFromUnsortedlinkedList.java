// https://www.codingninjas.com/codestudio/problems/remove-duplicates-from-unsorted-linked-list_1069331?leftPanelTab=1
/************************************************************
 * 
 * Following is the linked list node structure
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
 ************************************************************/
public class Solution {

    public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        LinkedListNode<Integer> dummy = head;
        while (head != null) {
            LinkedListNode<Integer> prev = head;
            int x = head.data;
            while (prev != null && prev.next != null) {
                if (prev.next.data == x) {
                    prev.next = prev.next.next;
                } else
                    prev = prev.next;
            }
            head = head.next;
        }
        return dummy;
    }

}