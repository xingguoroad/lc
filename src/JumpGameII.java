/**
 * Created by GelinZHU on 4/6/17.
 */
public class JumpGameII {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int last = 0;
        int curr = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > last) {
                count++;
                last = curr;
            }
            curr = Math.max(curr, nums[i] + i);
        }

        if (curr >= nums.length - 1) {
            return count;
        } else {
            return 0;
        }
    }
}
