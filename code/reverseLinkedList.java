// https://leetcode.com/explore/learn/card/recursion-i/251/scenario-i-recurrence-relation/2378/

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
    public ListNode reverseList(ListNode head) {
        // return reverseRec(head);
        return reverseIter(head);
    }
    
    private ListNode reverseIter(ListNode node) {
        if(node == null || node.next == null) return node;
        
        ListNode prev = null, curr = node;
        while(curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        return prev;
    }
    
    private ListNode reverseRec(ListNode node) {
        if(node == null || node.next == null) return node;
        
        ListNode restReversed = reverseRec(node.next);
        
        ListNode curr = restReversed;
        while(curr != null && curr.next != null) curr = curr.next;
        curr.next = node;
        node.next = null;
        
        return restReversed;
    }
}
