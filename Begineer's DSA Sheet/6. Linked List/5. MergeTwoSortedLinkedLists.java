// https://www.codingninjas.com/codestudio/problems/merge-two-sorted-linked-lists_800332?leftPanelTab=1
/************************************************************
 * 
 * Following is the linked list node structure:
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
    public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
        LinkedListNode<Integer> dummy = new LinkedListNode<Integer>(-1);
        LinkedListNode<Integer> temp = dummy;
        while (first != null && second != null) {
            if (first.data < second.data) {
                temp.next = first;
                first = first.next;
            } else {
                temp.next = second;
                second = second.next;
            }
            temp = temp.next;
        }
        if (first != null) {
            temp.next = first;
        }
        if (second != null) {
            temp.next = second;
        }
        return dummy.next;
    }
}
