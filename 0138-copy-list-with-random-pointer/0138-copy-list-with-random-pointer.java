/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
      if (head == null ) return null;
      Node newHead = new Node(head.val);
      newHead.random = head.random;
      Node curNode = newHead;
      Map<Node, Node> map = new HashMap<>();    
      map.put(null, null);
      map.put(head, newHead);
      head = head.next;
      while(head != null) {
        curNode.next = new Node(head.val);
        curNode = curNode.next;
        map.put(head, curNode);
        curNode.random = head.random;
        head = head.next;        
      }
      curNode = newHead;
      while(curNode != null){
       if(curNode.random != null)
            curNode.random = map.get(curNode.random);
        curNode = curNode.next;
      }
      return newHead;
    }
}