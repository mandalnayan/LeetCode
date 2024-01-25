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
    public int pseudoPalindromicPaths (TreeNode root) {
        if (root.left == null && root.right == null) return 1;

        int arr[] = new int[10];
        arr[root.val] = 1;
        return rec(root,arr);
    }
    public int rec(TreeNode root, int arr[]) {
        if (root.left == null && root.right == null) {
           if (isPalindromicPossible(arr)) return 1;
            return 0;
        }
        int lt = 0, rt = 0;
        // For left subtree
        if (root.left != null) {
            int v = root.left.val;
            arr[v]++;
            lt = rec(root.left, arr);
            arr[v]--;
        }
        if (root.right != null) {
            int v = root.right.val;
            arr[v]++;         
            rt = rec(root.right, arr);
            arr[v]--;   
        }
        return lt + rt;
    }

    // checking is pseudo-palindromic 
    public boolean isPalindromicPossible(int arr[]) {
        int i = 0, flag = 1;
        i = 1;
        while(i < 10) {
            if (arr[i] % 2 != 0) {
                if (flag == 1) flag = 0;
                else return false;
            }
            i++;
        }
        return true;
    }
}