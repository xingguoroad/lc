/**
 * Created by GelinZHU on 4/2/17.
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head == null) {
            return head;
        }

        int len = 1;
        ListNode p = head;
        while (p.next != null) {
            len++;
            p = p.next;
        }

        k = k % len;

        ListNode f = head;
        int i = 0;
        while (i < k && f != null) {
            f = f.next;
            i++;
        }
        if (i < k) {
            return head;
        }

        if (i == k && f == null) {
            return head;
        }
        ListNode s = head;
        while (f.next != null) {
            s = s.next;
            f = f.next;
        }

        f.next = head;
        head = s.next;
        s.next = null;

        return head;
    }

    public static void main(String[] args) {
        RotateList rl = new RotateList();
        ListNode head = ListNode.generate(new int[] {1, 2});
        ListNode.print(rl.rotateRight(head, 3));
    }
}
