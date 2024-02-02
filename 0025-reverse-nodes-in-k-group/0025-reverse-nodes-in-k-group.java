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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) return head;

        ListNode cur = head;
        ListNode p = null;
        while (cur != null && cur.next != null) {
            int i = 1;
            ListNode last = cur;
            while (i < k) {
             last = last.next;
             if (last == null) return head;
             i++;
            }
            ListNode t = last.next;
            if (head == cur) {
                head = reverse(cur, last.next);
            } else {
             p.next = reverse(cur, last.next);
            }
            p = cur;
            cur = t;
        }

    return head;
    }
    public ListNode reverse(ListNode head, ListNode prev) {

         ListNode tail = prev;
          while (head != tail) {
              ListNode next = head.next;
              head.next = prev;
              prev = head;
              head = next;
          }
        return prev;
    }
}