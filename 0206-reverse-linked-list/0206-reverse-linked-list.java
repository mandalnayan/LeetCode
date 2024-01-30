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

// Using Recursion technique

class Solution {
  ListNode revhead = null;
  public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
    reverse(head);
    return revhead;
  }
  public void reverse(ListNode head) {
      if (head.next == null) {
        revhead = head;
      } else {
           reverse(head.next);
           head.next.next = head;
           head.next = null;
      }
  }
}

/**

// Solve through Iteration 
class Solution {
    public ListNode reverseList(ListNode head) {
      if (head == null || head.next == null) return head;
      
      ListNode prevNode = null;
      ListNode curNode = head;
      while(curNode != null) {
        ListNode nextNode = curNode.next;
        curNode.next = prevNode;
        prevNode = curNode;
        curNode = nextNode;
      }
      return prevNode;
    }
}
*/