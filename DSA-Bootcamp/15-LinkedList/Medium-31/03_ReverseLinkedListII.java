// https://leetcode.com/problems/reverse-linked-list-ii/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode leftL = dummy;
        ListNode rightL = dummy;
        while (left-- > 1) {
            leftL = leftL.next;
        }
        while (right-- > 0) {
            rightL = rightL.next;
        }
        ListNode temp = rightL.next;
        rightL.next = null;
        leftL.next = reverse(leftL.next);
        while (leftL.next != null) {
            leftL = leftL.next;
        }
        leftL.next = temp;
        return dummy.next;
    }
}