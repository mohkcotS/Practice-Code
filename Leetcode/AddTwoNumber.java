class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}
public class AddTwoNumber {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode first = new ListNode(0);
          ListNode cur = first;
          int num;
          int plus = 0;
          while (l1 != null && l2 != null) {
              num = l1.val + l2.val + plus;
              if (num >= 10) {
                  num %= 10;
                  plus = 1;
              } else {
                  plus = 0;
              }
              cur.next = new ListNode(num);
              l1 = l1.next;
              l2 = l2.next;
          }
          if(l1 == null && l2 == null){
              if(plus == 1){
                  cur.next = new ListNode(1);
              }
              return first.next;
          }

            if(l2 == null){
            cur.next = l1;
            }
            if(l1 == null){
            cur.next = l2;
            }
            cur = cur.next;

            while (plus == 1){
                if (cur == null){
                    cur.next = new ListNode(1);
                    break;
                }
                if(cur.val + plus == 10){
                    cur.val = 0;
                    plus = 1;
                    cur = cur.next;
                }
                else {
                    break;
                }
            }

        return first.next;
    }
}
