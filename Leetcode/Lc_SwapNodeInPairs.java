

class ListNode {
      int val;
      ListNode next;
      ListNode(int val) { this.val = val; }

  }

class Lc_SwapNodeInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode s1 = l1;
        ListNode s2 = l2;
        ListNode cur = head;
        while (cur != null){
            l1.next = cur;
            cur=cur.next;
            l1 = l1.next;
            if(cur!=null){
                l2.next = cur;
                cur = cur.next;
                l2= l2.next;

            }

        }
        l1.next = null;
        l2.next = null;
        s1 = s1.next;
        s2 = s2.next;
        ListNode a = new ListNode(0);
        cur = a;

        while (s1 != null){
          if(s2 != null){
              cur.next = s2;
              cur = cur.next;
              s2 = s2.next;
          }
          cur.next = s1;
          cur = cur.next;
          s1 = s1.next;
        }

        return a.next;

    }
}