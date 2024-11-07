class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }

}
public class Lc_RemoveDuplicatesFromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode zero = new ListNode(0);
        ListNode prev = zero;
        ListNode cur = head;
        zero.next = head;

        while (cur.next != null){
            if(cur.next.val == cur.val ){
                while (cur.next.val != cur.val){
                    cur=cur.next;
                }
                prev.next = cur.next;
            }
            cur = cur.next;
        }
        return zero.next;
    }
}
