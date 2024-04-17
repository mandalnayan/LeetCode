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
    String ans = "";
    public String smallestFromLeaf(TreeNode root) {
        if (root == null) return "";
        return rec(root, "");
    }
    public String rec(TreeNode root, String curStr) {
        if (root.left == null && root.right == null) {
            curStr = (char)(root.val+97) + curStr;
            if (ans.equals("")) ans = curStr;
            else if (ans.compareTo(curStr) > 0) {
                    ans = curStr;
                }
        } else {
            curStr = (char)(root.val+97) + curStr;
            if (root.left != null)rec(root.left, curStr);
            if (root.right != null) rec(root.right,curStr);
        } 
        return ans;
    }
}