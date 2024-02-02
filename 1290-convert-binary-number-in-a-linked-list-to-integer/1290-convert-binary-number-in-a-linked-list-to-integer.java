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
    public int getDecimalValue(ListNode head) {
       if (head == null )return 0;
       if (head.next == null) return head.val;

       head = reverse(head);
       int num = 0, p = 0;
       while(head != null) {
           num += (head.val * Math.pow(2,p++));
           head = head.next;
       }
       return num;
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