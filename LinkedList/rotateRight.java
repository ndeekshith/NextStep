package LinkedList;

public class rotateRight {
    public static void main(String[] args) {
        
    }
    public static ListNode rotateright(ListNode head, int k){
        if(head == null || head.next == null || k == 0) return head;

        ListNode curr = head;
        int length = 1;
        while(curr.next != null){
            curr = curr.next;
            length++;
        }
        curr.next = head;
        k = k % length;
        int stepsToNewHead = length - k;
        ListNode newtail = curr;
        curr = head;
        for(int i = 0;i < stepsToNewHead;i++){
            newtail = curr;
            curr = curr.next;
    }
        newtail.next = null;
        return curr;
    }
}
