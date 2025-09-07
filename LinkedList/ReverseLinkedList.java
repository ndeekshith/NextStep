package LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        
    }
    public static ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}
