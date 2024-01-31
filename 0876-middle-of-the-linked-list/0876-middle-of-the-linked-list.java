/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
      if (head == null || head.next == null) return head;
      
      // Count the number of node
      int n = 0;
      ListNode curNode = head;
      while (curNode != null) {
        n++;
        curNode = curNode.next;
      }
      curNode = head;
      int m = n/2;
      while(m-- > 0) {
        curNode = curNode.next;
      }
      return curNode;
    }
}