/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
/*
//# Approach-1 using BFS (Extra space)
class Solution {
    public Node connect(Node root) {
       // Base case
       if (root == null) return root;

       Queue<Node> Q = new LinkedList<>();
       Q.add(root); Q.add(null);

       while (!Q.isEmpty()) {
          Node curNode = Q.remove();
          if (curNode == null) {
              if (!Q.isEmpty()) Q.add(null);
              continue;
          }
          curNode.next = Q.peek();
          if (curNode.left == null) continue;
          Q.add(curNode.left);
          Q.add(curNode.right);
       }
       return root;
    }

}

*/
// Approach -2
class Solution {
    public Node connect (Node root) {
       if (root == null) return null;

       Node leftMostNode = root;
       while (leftMostNode.left != null) {
           Node curHead = leftMostNode;

           while (curHead != null) {
                 // connection 1
                 curHead.left.next = curHead.right;
                 // connection 2
                 if (curHead.next != null) {
                    curHead.right.next = curHead.next.left;
                 }
                curHead = curHead.next;
           }
           leftMostNode = leftMostNode.left;
       }
       return root;
    }
}
