// https://leetcode.com/problems/merge-k-sorted-lists/
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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0)
            return null;
        ListNode ans = null;
        for (ListNode list : lists) {
            ans = merge(ans, list);
        }
        return ans;
    }

    public ListNode merge(ListNode headA, ListNode headB) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while (headA != null && headB != null) {
            if (headA.val < headB.val) {
                temp.next = headA;
                headA = headA.next;
            } else {
                temp.next = headB;
                headB = headB.next;
            }
            temp = temp.next;
        }
        if (headA != null) {
            temp.next = headA;
        } else {
            temp.next = headB;
        }
        return dummy.next;
    }
}