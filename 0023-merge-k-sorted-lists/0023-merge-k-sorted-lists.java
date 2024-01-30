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
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        //Base case
        if (lists == null || n == 0) return null;
        
        PriorityQueue<ListNode> pq = new  PriorityQueue<>((o1, o2) -> o1.val - o2.val);

        for(int i = 0; i < n; i++) {
            if (lists[i] != null)
                pq.add(lists[i]);
        }
        ListNode finalList = null;
        ListNode curNode = finalList;
        while(!pq.isEmpty()) {
            ListNode minNode = pq.poll();
            if (finalList == null) {
                finalList = minNode;
            } else {
                curNode.next = minNode;
            }
            curNode = minNode;
            if (minNode.next != null) pq.add(minNode.next);
        }

        return finalList;
    }
}