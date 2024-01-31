/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
      if (head == null || head.next == null) return null;
      
      Set<ListNode> nodes = new HashSet<>();
      nodes.add(head);
      
      while(head != null) {
        if (nodes.contains(head.next)) return head.next;
        nodes.add(head.next);
        head = head.next;
      }
      return null;
    }
}