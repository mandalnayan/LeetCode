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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
      List<List<Integer>> lists = new ArrayList<>();
      if (root == null) return lists;
      
      List<Integer> list = new ArrayList<>();
      Queue<TreeNode> Q = new LinkedList<>();
      Q.add(root); Q.add(null);  int chance = 0;
      while (!Q.isEmpty()) {
        TreeNode curNode = Q.remove();
        if (curNode == null) {
            if (!Q.isEmpty()) Q.add(null);
            if (chance == 1) {
                List<Integer> revList = new ArrayList<>();
                for (int i = list.size()-1 ; i >= 0; i--) revList.add(list.get(i));
                lists.add(revList);
                chance = 0;
            } else {
                lists.add(new ArrayList<>(list));
                chance = 1;
            }
            list.clear();
        } else {
            list.add(curNode.val);
            if (curNode.left != null) Q.add(curNode.left);
            if (curNode.right != null) Q.add(curNode.right);
        }

      }
      return lists;   
    }
}