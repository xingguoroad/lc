/**
 * Created by GelinZHU on 3/24/17.
 */
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode prev = head;
        ListNode curr = head;

        for (int i = 0; i < n; i++) {
            prev = prev.next;
        }  // at here, prev is n ahead of curr

        if (prev == null) { // delete head
            head = head.next;
            return head;
        }

        while (prev.next != null) {
            prev = prev.next;
            curr = curr.next;
        }  // at here, prev is at the end, curr.next is the one we need to delete

        curr.next = curr.next.next;


        return head;
    }
    public static void main(String[] args) {
        RemoveNthNodeFromEndofList rnfl = new RemoveNthNodeFromEndofList();
        ListNode l = ListNode.generate(new int[] {1, 2, 3, 4, 5});
        ListNode m = rnfl.removeNthFromEnd(l, 2);
        ListNode.print(m);
    }
}
