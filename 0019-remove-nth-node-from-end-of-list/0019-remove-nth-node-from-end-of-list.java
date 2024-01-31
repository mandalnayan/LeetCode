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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        // Base case - 1
        if (head == null) return head;
            
        // Base case - 2
        if (head.next == null) return head = null;

        ListNode curNode = head;
        int p = 1;

       // Calculate the number of node
        while (curNode != null) {
            curNode = curNode.next;
            p++;
        }
        
     // finding nth node
        int count = --p - n;
             p = 0;
             curNode = head;
             ListNode prvNode = null;
             while (p < count) {
            prvNode = curNode;
             curNode = curNode.next;
             p++;
             }
            
            if (p == 0) {
              head = head.next; 
            } else {
             prvNode.next = curNode.next;
            }
            
            return head;
        
    }
}