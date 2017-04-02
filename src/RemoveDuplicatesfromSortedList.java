/**
 * Created by GelinZHU on 3/28/17.
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = head;

        while(p != null && p.next != null) {
            if (p.val == p.next.val) {
                p.next = p.next.next;   // delete p.next
            } else {
                p = p.next;
            }
        }
        return head;
    }
}
