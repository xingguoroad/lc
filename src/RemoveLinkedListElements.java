/**
 * Created by GelinZHU on 4/7/17.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        ListNode prev = new ListNode(-1);
        prev.next = head;
        ListNode p = prev;

        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }

        return prev.next;
    }

    public static void main(String[] args) {
        ListNode l = ListNode.generate(new int[] {1, 1});
        RemoveLinkedListElements rlle = new RemoveLinkedListElements();
        ListNode.print(rlle.removeElements(l, 1));
    }
}
