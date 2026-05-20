class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        ListNode curr = head;

        while (curr != null && curr.next != null) {

            ListNode tail = curr;
            ListNode prev = null;

            // find tail and node before tail
            while (tail.next != null) {
                prev = tail;
                tail = tail.next;
            }

            // stop for odd/even middle cases
            if (tail == curr || curr.next == tail) {
                break;
            }

            // remove tail from end
            prev.next = null;

            // insert tail after curr
            ListNode nextNode = curr.next;

            curr.next = tail;
            tail.next = nextNode;

            // move curr forward
            curr = nextNode;
        }
    }
}