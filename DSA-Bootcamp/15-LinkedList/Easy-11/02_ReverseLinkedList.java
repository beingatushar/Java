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
// https://leetcode.com/problems/reverse-linked-list/submissions/
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode next = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = next;
            next = head;
            head = temp;
        }
        return next;
    }
}