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
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode curr = null;
        int count = 1;
        curr = head;
        while(curr.next != null){
            count++;
            curr = curr.next;
        }

        if (count == n) {
            return head.next;
        }

        ListNode newCurr = null;
        newCurr = head;

        for(int i = 1; i<count-n; i++){
            
            newCurr = newCurr.next;
        }

        newCurr.next = newCurr.next.next;

        return head;

    }
}
