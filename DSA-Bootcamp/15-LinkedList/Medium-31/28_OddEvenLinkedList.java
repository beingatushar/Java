// https://leetcode.com/problems/odd-even-linked-list/submissions/

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

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode odd = head;
        ListNode oddTail = odd;
        ListNode even = head.next;
        ListNode evenTail = even;
        head = head.next.next;
        while (head != null) {
            oddTail.next = head;
            oddTail = oddTail.next;
            evenTail.next = head.next;
            evenTail = evenTail.next;
            if (head.next == null)
                break;
            head = head.next.next;
        }
        oddTail.next = even;
        return odd;
    }
}