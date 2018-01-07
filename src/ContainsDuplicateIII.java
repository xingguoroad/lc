import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Created by GelinZHU on 12/29/17.
 */
public class ContainsDuplicateIII {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums.length < 2 || nums == null || k < 0 || t < 0) {
            return false;
        }
        TreeSet<Long> ts = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long left = (long) nums[i] - t;
            long right = (long) nums[i] + t + 1;
            SortedSet<Long> ss = ts.subSet(left, right);

            if (ss.size() > 0) {
                return true;
            }

            ts.add((long)nums[i]);

            if (i > k) {
                ts.remove((long)nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-3, 3};
        ContainsDuplicateIII cd = new ContainsDuplicateIII();
        cd.containsNearbyAlmostDuplicate(nums, 2, 4);
    }
}
