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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       if (l1 == null) return l2;
       if (l2 == null) return l1;
       
       //Reverse both the linked list
       l1 = reverse(l1);
       l2 = reverse(l2);

       ListNode head = null;
       ListNode curNode = null;
       int rem = 0;
       while(l1 != null && l2 != null) {
           int sum = l1.val + l2.val + rem;
           ListNode newNode = new ListNode(sum%10, null);
           if (head == null) {
               head = newNode;
           } else {
               curNode.next = newNode;
           }
           curNode = newNode;
           rem = sum / 10;
           // Update both the node
           l1 = l1.next;
           l2 = l2.next;
       }
       curNode.next = l1 == null ? l2 : l1;
       if (curNode.next != null) {
          curNode = curNode.next;
           while (curNode != null && rem > 0) {
               int sum = (curNode.val + rem);
               curNode.val = sum % 10;
               rem = sum / 10;
               if (curNode.next == null) {
                   curNode.next = rem > 0 ? new ListNode(rem, null) : null;
                   rem = 0;
               }
             curNode = curNode.next;
           }
       } else        
         if (rem > 0) curNode.next = new ListNode(rem, null);
       return reverse(head);
    }

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}