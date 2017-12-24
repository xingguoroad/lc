package 刷题1;

import lib.ListNode;

/**
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;

        int carry = 0;

        ListNode result = new ListNode(-1);
        ListNode head = result;

        while (p1 != null || p2 != null) {
            int intermediate = 0;
            if (p1 != null) {
                intermediate += p1.val;
                p1 = p1.next;
            }

            if (p2 != null) {
                intermediate += p2.val;
                p2 = p2.next;
            }
            intermediate += carry;

            if (intermediate >= 10) {
                carry = 1;
                intermediate %= 10;
            } else {
                carry = 0;
            }
            head.next = new ListNode(intermediate);
            head = head.next;

        }

        if (carry > 0) {
            ListNode p = new ListNode(1);
            head.next = p;
        }

        return result.next;
    }
}
