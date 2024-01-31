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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
      if (list1 == null && list2 == null) return null;
      else if(list1 == null) return list2;
      else if (list2 == null) return list1;
      else {      
      ListNode head = null, curNode = null;
      while (list1 != null && list2 != null) {
        ListNode minNode = null;
        if(list1.val < list2.val) {
          minNode = list1;
          list1 = list1.next;
        } else {
          minNode = list2;
          list2 = list2.next;
        }
        if (head == null) head = minNode;
        else curNode.next = minNode;
        
        curNode = minNode;
      } 
      curNode.next = list1 == null ? list2 : list1;

      return head;
      }
    }
}