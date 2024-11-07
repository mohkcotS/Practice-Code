import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }

}
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int count = 0;
        ListNode first = new ListNode(0);
        first.next = head;
        ListNode cur = first;
        ListNode ble = null;
        ListNode ari = null;
        ListNode le=null;
        ListNode ri = null;
        while (cur != null){
            if(count == left-1){
                ble = cur;
                le = cur.next;
            }
            if(count == right){
                ri = cur;
                ari = cur.next;
            }
            count++;
            cur = cur.next;
        }
        Stack <ListNode> list = new Stack<>();
        cur = le;
        while (cur != null){
            list.add(cur);
            if(cur == ri){
                break;
            }
            cur = cur.next;
        }
        cur = ble;
        while (!list.isEmpty()){
            cur.next = list.pop();
            cur.next.next = null;
            cur = cur.next;
        }
        cur.next = ari;
        return first.next;
    }
}
