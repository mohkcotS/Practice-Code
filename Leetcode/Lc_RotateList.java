class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }

}
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        int size = 0;
        ListNode cur = head;
        while (cur != null){
            size++;
            cur = cur.next;
        }
        cur.next = head;
        k %= size;
        size -= k;
        cur = head;
        int count = 0;
        while (count != size){
            cur = cur.next;
            count++;
        }
        head = cur.next;
        cur.next = null;
        return  head;
    }
}
