class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }

}
public class Lc_PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode cur = head;
        ListNode head1 = new ListNode(0);
        ListNode head2 = new ListNode(0);
        ListNode ptr1 = head1;
        ListNode ptr2 = head2;
        while (cur != null){
            if(cur.val < x){
                ptr1.next = cur;
                ptr1 = ptr1.next;
            }
            else {
                ptr2.next = cur;
                ptr2 = ptr2.next;
            }
            cur = cur.next;
        }
        ptr1.next = head2.next;
        return head1.next;
    }
}
