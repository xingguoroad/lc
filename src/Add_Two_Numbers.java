/**
 * Created by GelinZHU on 3/14/17.
 */


import lib.ListNode;

public class Add_Two_Numbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            return null;
        }
        int carry = 0;
        ListNode head = new ListNode(-1);

        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode p3 = head;

        while (p1 != null || p2 != null) {
            if (p1 != null) {
                carry += p1.val;
                p1 = p1.next;
            }
            if (p2 != null) {
                carry += p2.val;
                p2 = p2.next;
            }

            ListNode n = new ListNode(carry % 10);
            p3.next = n;
            p3 = p3.next;
            carry = carry / 10;
        }

        if (carry > 0) {
            ListNode n = new ListNode(carry);
            p3.next = n;
        }

        return head.next;
    }
}
