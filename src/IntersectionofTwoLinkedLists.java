/**
 * Created by GelinZHU on 4/8/17.
 */
public class IntersectionofTwoLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int lenA = 0;
        ListNode pA = headA;
        while (pA != null) {
            lenA++;
            pA = pA.next;
        }

        int lenB = 0;
        ListNode pB = headB;
        while(pB != null) {
            lenB++;
            pB = pB.next;
        }

        int diff = 0;
        pA = headA;
        pB = headB;

        if (lenA > lenB) {
            diff = lenA - lenB;
            while (diff > 0) {
                pA = pA.next;
                diff--;
            }
        } else {
            diff = lenB - lenA;
            while (diff > 0) {
                pB = pB.next;
                diff--;
            }
        }

        // Up to here, we can ask both pA and pB to advance
        while (pA != null && pB != null) {
            if (pA == pB) {
                return pA;
            } else {
                pA = pA.next;
                pB = pB.next;
            }
        }

        return null;
    }
}
