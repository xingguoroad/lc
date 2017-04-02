/**
 * Created by GelinZHU on 3/30/17.
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }


        int[] max = new int[nums.length + 1];
        int[] min = new int[nums.length + 1];
        int globalMax = nums[0];
        max[0] = nums[0];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++ ) {
            max[i] = Math.max(nums[i], Math.max(nums[i] * max[i - 1], nums[i] * min[i-1]));
            min[i] = Math.min(nums[i], Math.min(nums[i] * min[i - 1], nums[i] * max[i - 1]));
            if (globalMax < max[i]) {
                globalMax = max[i];
            }
        }


        return globalMax;

    }
    public static void main(String[] args) {
        MaximumProductSubarray mps = new MaximumProductSubarray();
        System.out.println(mps.maxProduct(new int[] {2, 3, -2, 4}));
    }
}
