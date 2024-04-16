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
    int p = -1;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         int n = preorder.length;
         if (n == 1) {
            return new TreeNode(preorder[0]);
         }
       return rec(preorder, inorder,  0, n-1);
    }
         public TreeNode rec(int pre[], int ino[], int l, int r) {
            if (l > r || p == pre.length-1) return null;
            p++;
            int i = l;
            while (i <= r) {
                if (ino[i] == pre[p]) break;
                i++;
            }

            TreeNode curRoot = new TreeNode(pre[p]);
            curRoot.left = rec(pre, ino, l, i - 1);
            curRoot.right = rec(pre, ino, i+1, r);

            return curRoot;
         }
    
}