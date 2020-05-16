// https://leetcode.com/explore/learn/card/recursion-i/250/principle-of-recursion/1681/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    /*
        n: num of nodes
        time: O(n)
        space: O(n) -- recursion stack
    */
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        
        ListNode rest = swapPairs(head.next.next);
        ListNode newHead = head.next;
        head.next = rest;
        newHead.next = head;
        return newHead;
    }
}
