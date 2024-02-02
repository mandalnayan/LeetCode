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
    public boolean isPalindrome(ListNode head) {
       // Base case
       if (head == null || head.next == null) return true;

       //Find the middle node of the linked list
       ListNode slow = head, fast = head;
       while(fast != null && fast.next != null) {
           slow = slow.next;
           fast = fast.next.next;
       }
       // Odd nodes
       if (fast != null) slow = slow.next;
       slow = reverseList(slow);
       
       fast = head;
       while(slow != null) {
           if (slow.val != fast.val) return false;
           fast = fast.next;
           slow = slow.next;
       }
       return true;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}