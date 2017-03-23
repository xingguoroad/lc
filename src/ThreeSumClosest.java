import java.util.Arrays;

/**
 * Created by GelinZHU on 3/22/17.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int result = 0;
        if (nums == null || nums.length == 0) {
            return result;
        }

        int min = Integer.MAX_VALUE;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            int sum = 0;

            while (low < high) {
                sum = nums[i] + nums[low] + nums[high];
                if (sum == target) {
                    return sum;
                }

                if (Math.abs(sum - target) < min) {
                    min = Math.abs(sum - target);
                    result = sum;

                }
                if (sum > target) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return result;
    }
}
