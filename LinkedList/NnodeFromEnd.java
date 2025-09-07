package LinkedList;

public class NnodeFromEnd {
    public static void main(String[] args) {
        
    }
    public static ListNode nthFromEnd(ListNode head, int n){
        if(head == null) return null;
        ListNode first = head, second = head;

        for(int i = 0;i < n;i++){
            first = first.next;

            while(first != null){
                first = first.next;
                second = second.next;
            }
        }
        return second;
    }
}
