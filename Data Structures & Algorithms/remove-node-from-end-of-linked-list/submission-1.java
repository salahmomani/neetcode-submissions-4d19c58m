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

class Solution { public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;

        ListNode current = head;
        List<Integer> list = new ArrayList<>();
        while (current != null) {
            list.add(current.val);
            current = current.next;
        }
        int removeValue = list.size() - n;
        if (removeValue == 0) {
            return head.next;
        }
        ListNode prev = head;
        for (int i = 0; i < removeValue - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;

        return head;
    }
}
