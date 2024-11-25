public class Lc_LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null ){
            return null;
        }
        else if(head.next.next == head){
            return head;
        }
        else {


            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                // Cycle detected
                if (slow == fast) {
                    ListNode entry = head;
                    while (entry != slow) {
                        entry = entry.next;
                        slow = slow.next;
                    }
                    return entry;
                }
            }

            return null;
        }
    }

    public static void main(String[] args) {
        Lc_LinkedListCycleII s = new Lc_LinkedListCycleII();
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        l1.next = l2;
        System.out.println(s.detectCycle(l1));
    }
}