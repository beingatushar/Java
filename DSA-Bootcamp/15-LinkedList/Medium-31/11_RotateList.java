// https://leetcode.com/problems/rotate-list/submissions/
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
    public ListNode rotateRight(ListNode head, int k) {
        int n = 0;
        ListNode length = head;
        while (length != null) {
            n++;
            if (length.next == null) {
                k = k % n;
                if (k == 0 || n < 2)
                    return head;
                length.next = head;
                break;
            }
            length = length.next;
        }
        if (k == 0 || n < 2)
            return head;
        length = head;
        for (int i = 0; i < n - k - 1; i++) {
            length = length.next;
        }
        ListNode ans = length.next;
        length.next = null;
        return ans;
    }
}