package LinkedList;

public class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy, curr = head;
        
        while (true) {
            ListNode node = prev;
            for (int i = 0; i < k && node != null; i++) node = node.next;
            if (node == null) break;
            
            ListNode start = prev.next, next = node.next;
            node.next = null;
            prev.next = reverse(start);
            start.next = next;
            prev = start;
        }
        return dummy.next;
    }
    
    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
