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
    public ListNode oddEvenList(ListNode head) {
        // Base case
       if (head == null || head.next == null) return head; 
       
       ListNode oddHead = head, evenHead = head.next, oddMove = head, evenMove = head.next;
       
       while(oddMove != null || evenMove != null) {
           if (oddMove != null && oddMove.next != null) {
               oddMove.next = oddMove.next.next;
               if (oddMove.next != null)
                   oddMove = oddMove.next;
           }
           if(evenMove != null && evenMove.next != null) {
               evenMove.next = evenMove.next.next;
               evenMove = evenMove.next;
           } else {
               break;
           }
       }
       oddMove.next = evenHead;
       return oddHead;
    }
}