import java.util.Stack;

class Lc_ReorderList {
    public void reorderList(ListNode head) {

        int count = 0;
        ListNode cur = head;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        if (count <= 2){
            System.out.println();
        }
        else {
            int size;
            if(count % 2 == 0){
                size =  count / 2;
            }
            else {
                size = count/2 + 1;
            }
            int x = 0;
            cur = head;
            while (x < size-1){
                x++;
                cur = cur.next;
            }
            ListNode sec = cur.next;
            cur.next = null;

            cur = sec;
            Stack<ListNode> s = new Stack<>();
            while (cur != null){
                s.push(cur);
                cur = cur.next;
            }
            sec = s.pop();
            cur = sec;
            cur.next = null;
            while (!s.isEmpty()){
                cur.next = s.pop();
                cur = cur.next;
                cur.next = null;
            }


            ListNode p1 = head;
            ListNode p2 = sec;
            ListNode p3 = new ListNode(0);


            while (size == 0){
                p3.next = p1;
                p3 = p3.next;
                p1 = p1.next;

                if(p1 != null){
                    p3.next = p2;
                    p3 = p3.next;
                    p2 =p2.next;
                }
            }
        }
    }
}