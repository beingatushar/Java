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
// https://leetcode.com/problems/middle-of-the-linked-list/submissions/
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next.next;
            head = head.next;
        }
        return head;
    }
}