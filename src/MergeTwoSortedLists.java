/**
 * Created by GelinZHU on 3/24/17.
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(-1);
        ListNode fakeHead = p;


        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val < l2.val) {
                    p.next = l1;
                    l1 = l1.next;
                } else {
                    p.next = l2;
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }
        return fakeHead.next;
    }

    public static void main(String[] args) {
        MergeTwoSortedLists mtl = new MergeTwoSortedLists();
        ListNode l1 = ListNode.generate(new int[] {});
        ListNode l2 = ListNode.generate(new int [] {0});
        ListNode.print(mtl.mergeTwoLists(l1, l2));
    }
}
