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
    public int maxAncestorDiff(TreeNode root) {
        if (root == null) return 0;
        
        return Math.max(pathExplor(root.left, root.val, root.val), pathExplor(root.right, root.val, root.val));

    }
    int pathExplor(TreeNode root, int max, int min) {
        if (root == null) return max-min;
        max = Math.max(root.val, max);
        min = Math.min(root.val, min);
        
        return Math.max(pathExplor(root.left, max, min), pathExplor(root.right, max, min));

    }
    
}