// https://www.codingninjas.com/codestudio/problems/binary-to-integer_2421938?leftPanelTab=1
/********************************************************
 * 
 * Following is the class structure of the Node class:
 * 
 * class Node
 * {
 * public:
 * int data;
 * Node next;
 * Node(int data)
 * {
 * this.data = data;
 * this.next = null;
 * }
 * };
 * 
 ********************************************************/
class Solution {
    public static int binaryToInteger(int n, Node head) {
        int ans = 0;
        int factor = (int) Math.pow(2, n - 1);
        while (n-- > 0) {
            ans += head.data * factor;
            head = head.next;
            factor /= 2;
        }
        return ans;
    }
}