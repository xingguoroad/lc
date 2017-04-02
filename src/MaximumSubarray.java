/**
 * Created by GelinZHU on 4/2/17.
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int subSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (subSum > 0) {
                subSum += nums[i];
                if (subSum > max) {
                    max = subSum;
                }
            } else {
                subSum = 0;
                subSum += nums[i];
                if (subSum > max) {
                    max = subSum;
                }
            }
        }
        return max;
    }
}
