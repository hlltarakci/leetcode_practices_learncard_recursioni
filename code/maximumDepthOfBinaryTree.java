// https://leetcode.com/explore/learn/card/recursion-i/256/complexity-analysis/2375/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    /*
        n: num of nodes
        time: O(n)
        space: O(n) -- recursion, unbalanced at worst case, average case balanced O(log n)
    */
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left)); 
    }
}
