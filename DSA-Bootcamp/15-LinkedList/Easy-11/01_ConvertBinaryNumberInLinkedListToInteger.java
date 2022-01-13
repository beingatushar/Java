// https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/submissions/
// /**
//  * Definition for singly-linked list.
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

// */
class Solution {
    public int getDecimalValue(ListNode head) {
        int n = 0;
        while (head != null) {
            n = (n << 1) | head.val;
            head = head.next;
        }
        System.gc();
        return n;
    }
}