import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by GelinZHU on 3/26/17.
 */
public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode(0);
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode head = result;

        PriorityQueue<ListNode> p = new PriorityQueue<>(lists.length, new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                if (o1.val > o2.val) {
                    return 1;
                } else if (o1.val < o2.val) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });


        // Initialize priority queue.
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                p.add(lists[i]);
            }
        }

        while (p.size() > 0) {
            ListNode temp = p.poll();
            head.next = temp;
            if (temp.next != null) {
                p.add(temp.next);
            }
            head = head.next;
        }


        return result.next;
    }
}
