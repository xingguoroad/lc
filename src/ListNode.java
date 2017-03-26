public class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }

    public static ListNode generate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ListNode(0);
        }
        ListNode head = new ListNode(-1);
        ListNode p = new ListNode(nums[0]);
        head.next = p;
        for (int i = 1; i < nums.length; i++) {
            ListNode q = new ListNode(nums[i]);
            p.next = q;
            p = q;
        }
        return head.next;
    }

    public static void print(ListNode l) {
        while (l != null) {
            System.out.println(l.val);
            l = l.next;
        }
    }

    public static void main(String[] args) {
        ListNode l = new ListNode(-1);
        l = l.generate(new int[] {1, 2, 3, 4});
        l.print(l);
    }
}