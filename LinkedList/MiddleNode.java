package LinkedList;

public class MiddleNode {
    public static void main(String[] args) {
        
    }
    public static ListNode middleNode(ListNode head){
        if(head == null) return null;

        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
