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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
       // Base case
       if (depth == 1) {
        TreeNode newRoot = new TreeNode(val);
        newRoot.left = root;
        return newRoot;
       } 

       Queue<TreeNode> Q = new LinkedList<>();
       Q.add(root); 
       Q.add(null);
       int CD = 1;
       while (!Q.isEmpty() && CD < depth) {
            TreeNode curNode = Q.remove();
            
            if (curNode == null) {
                CD++;
                if (!Q.isEmpty()) Q.add(null);
            } else {
                if (CD == depth - 1) {
                    TreeNode newNode1 = new TreeNode(val, curNode.left, null);
                    TreeNode newNode2 = new TreeNode(val, null, curNode.right);
                    
                    curNode.left = newNode1;
                    curNode.right = newNode2;
                } else {
                   if (curNode.left != null)
                      Q.add(curNode.left);
                   if (curNode.right != null)
                      Q.add(curNode.right);
                }
            }
       }

       return root; 
    }
}