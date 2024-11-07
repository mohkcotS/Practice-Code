class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }

}
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        int size = 0;
        while (cur != null){
            size++;
            cur = cur.next;
        }
        if(size == 1){
            head = null;
            return head;
        }
        size -= n;
        int count = 0;
        cur = head;
        while (cur != null){
            count++;
            if(count == size){
                cur.next = cur.next.next;
                break;
            }
        }
        return  head;
    }
}
