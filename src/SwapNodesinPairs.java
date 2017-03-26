/**
 * Created by GelinZHU on 3/26/17.
 */
public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode fakeHead = new ListNode(0);
        fakeHead.next = head;

        ListNode ptr1 = fakeHead;
        ListNode ptr2 = head;

        while(ptr2 != null && ptr2.next != null) {
            ListNode nextStart = ptr2.next.next;
            ptr2.next.next = ptr2;
            ptr1.next = ptr2.next;
            ptr2.next = nextStart;
            ptr1 = ptr2;
            ptr2 = ptr2.next;
        }
        return fakeHead.next;
    }

    public static void main(String[] args) {
        SwapNodesinPairs snp = new SwapNodesinPairs();
        ListNode l = ListNode.generate(new int[] {1, 2, 3, 4});
        ListNode m = snp.swapPairs(l);
        ListNode.print(m);
    }
}
