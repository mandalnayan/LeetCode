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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        // Base case
        if (root.left == null && root.right == null) return root.val;
         rec(root);
         return maxSum;
    }

    public int rec(TreeNode root) {
        if (root == null) return 0;

        int leftSum = rec(root.left);
        int rightSum = rec(root.right);

        int curSum1 = leftSum + rightSum + root.val;

        int lrSum =  Math.max(leftSum, rightSum) + root.val;

        int curSum2 = (Math.max(root.val, lrSum));

        maxSum = Math.max(Math.max(curSum1, curSum2), maxSum);
        return curSum2;
    }
}