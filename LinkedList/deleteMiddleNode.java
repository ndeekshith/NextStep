package LinkedList;

public class deleteMiddleNode {
    public static void main(String[] args) {
        
    }
    public static ListNode deleteMiddle(ListNode head){
        if(head == null || head.next == null) return null;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    } 
}
