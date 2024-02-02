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
    public ListNode reverseBetween(ListNode head, int left, int right) {
       // Base case-1
       if (head == null || head.next == null || left == right) return head;
       // Base case-2
       if (head.next.next == null) return reverse(head, null);

       int c = 2;
       //Finding the starting node
       ListNode start = head;
       while(c < left) {
           start = start.next;
           c++;
       }
       //Finding the last node
       ListNode end = start.next;
       while(c < right) {
           end = end.next;
           c++;
       }
       //Reverse the node from left to right
       if (left == 1) return reverse(start, end.next);
       else start.next = reverse(start.next, end.next);
       return head;
    }
    public ListNode reverse(ListNode head, ListNode prev) {
        ListNode tail = prev;
        while(head != tail) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}