// https://leetcode.com/problems/remove-nth-node-from-end-of-list/submissions/

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy;
        ListNode fast = dummy;
        while (n-- > 0) {
            slow = slow.next;
        }
        while (slow.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        fast.next = fast.next.next;
        return dummy.next;
    }
}