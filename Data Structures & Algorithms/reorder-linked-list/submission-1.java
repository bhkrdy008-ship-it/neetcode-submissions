class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) {
            return;
        }

        ListNode curr = head;

        while (curr != null && curr.next != null) {

            ListNode tail = curr;
            ListNode prev = null;

            while (tail.next != null) {
                prev = tail;
                tail = tail.next;
            }
            if (tail == curr || curr.next == tail) {
                break;
            }
            prev.next = null;
            ListNode nextNode = curr.next;
            curr.next = tail;
            tail.next = nextNode;
            curr = nextNode;
        }
    }
}