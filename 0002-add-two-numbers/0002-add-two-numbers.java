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
        
        // Base case-1
        if(l1 == null && l2 == null) return l1;
         
        // Base case-2 
        if(l1 == null ) return l2;

       // Base case-3
       if(l2 == null) return l1;
       
       // Making new linked list 
       ListNode head = null;

       ListNode prevN = head;
       int rem = 0;

       while (l1 != null && l2 != null) {
       
       int x = l1.val;
       int y = l2.val;

       int res = x + y + rem;
       
       ListNode tempN = new ListNode(res % 10, null);

       if(head == null) {
       prevN = head = tempN;
       } else {
       prevN.next = tempN;
       prevN = tempN;
       }

       rem = res / 10;
     
       // Updating node
       l1 = l1.next;
       l2 = l2.next;

    }
    
   if(l1 == null) {
     while ( l2 != null) {
      int x = l2.val + rem;
      rem = x / 10;

      ListNode tempN = new ListNode( x % 10, null);

      prevN.next = tempN;
      prevN = tempN;
      l2 = l2.next;
      }
} else {
    while( l1 != null) {
    int y = l1.val + rem;
    rem = y / 10;

    ListNode tempN = new ListNode(y % 10, null);

    prevN.next = tempN;
    prevN = tempN;
    l1 = l1.next;
}
}

    if(rem > 0) prevN.next = new ListNode(rem, null);

    return head;
    }
}