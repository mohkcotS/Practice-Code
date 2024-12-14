class Lc_OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode cur = head;
        ListNode c1 = new ListNode(0);
        ListNode c2 = new ListNode(0);
        ListNode l1 = c1;
        ListNode l2 = c2;
        int n = 0;
        while (cur != null){
            if(n%2 == 0){
                c1.next = cur;
            }else{
                c2.next = cur;
            }
            cur = cur.next;
            if(n%2 == 0){
                c1.next.next = null;
                c1 = c1.next;
            }else{
                c2.next.next = null;
                c2 = c2.next;
            }
            n++;
        }
        cur = l1.next;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = l2.next;
        return l1.next;
    }
}