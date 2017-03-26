/**
 * Created by GelinZHU on 3/26/17.
 */
public class ReverseNodesink_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;
        int i = 0;
        while(head != null) {
            i++;
            if (i % k == 0) {
                pre = reverse(pre, head.next);
                head = pre.next;
            } else {
                head = head.next;
            }
        }

        return dummy.next;
    }

    private static ListNode reverse(ListNode pre, ListNode next) {
        /**
         * Reverse a link list between pre and next exclusively
         * an example:
         * a linked list:
         * 0->1->2->3->4->5->6
         * |           |
         * pre        next
         * after call pre = reverse(pre, next)
         *
         * 0->3->2->1->4->5->6
         *          |  |
         *          pre next
         * @param pre
         * @param next
         * @return the reversed list's last node, which is the precedence of parameter next
         */
        ListNode last = pre.next;
        ListNode curr = last.next;
        while(curr != next) {
            last.next = curr.next;
            curr.next = pre.next;
            pre.next = curr;
            curr = last.next;
        }
        return last;
     }

     public static void main(String[] args) {
        ListNode l = ListNode.generate(new int[] {0, 1, 2, 3, 4, 5, 6});
        ListNode m = l.next.next.next.next;
        ListNode.print(reverse(l, m));
        ListNode.print(l);
     }
}
