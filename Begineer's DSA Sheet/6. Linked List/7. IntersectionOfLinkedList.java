// https://www.codingninjas.com/codestudio/problems/intersection-of-linked-list_630457?leftPanelTab=1
/************************************
 * 
 * //Following is the class structure of the LinkedListNode class:
 * 
 * class LinkedListNode<T> {
 * public T data;
 * public LinkedListNode<T> next;
 * 
 * public LinkedListNode(T data) {
 * this.data = data;
 * this.next = null;
 * }
 * }
 * 
 *****************************************/
class Solution {
    private static int length(LinkedListNode<Integer> head) {
        int c = 0;
        while (head != null) {
            c++;
            head = head.next;
        }
        return c;
    }

    public static int findIntersection(LinkedListNode<Integer> headA, LinkedListNode<Integer> headB) {
        int first = length(headA);
        int second = length(headB);
        int diff = first - second;
        if (diff != 0) {
            if (diff > 0) {
                while (diff-- > 0) {
                    headA = headA.next;
                }
            } else {
                diff = -diff;
                while (diff-- > 0) {
                    headB = headB.next;
                }
            }
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        if (headA == null) {
            return -1;
        }
        return headA.data;
    }
}