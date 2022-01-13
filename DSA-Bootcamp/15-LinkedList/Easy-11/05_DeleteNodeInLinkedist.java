/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
// https://leetcode.com/problems/delete-node-in-a-linked-list/submissions/
class Solution {
    public void deleteNode(ListNode head) {
        head.val = head.next.val;
        head.next = head.next.next;

    }
}