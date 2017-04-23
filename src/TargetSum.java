/**
 * Created by GelinZHU on 4/23/17.
 */
public class TargetSum {

    private int result = 0;

    public int findTargetSumWays(int[] nums, int S) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        result = helper(nums, S, 0);
        return result;
    }

    public int helper(int[] nums, int S, int start) {
        if (start == nums.length) {
            if (S == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        int a = helper(nums, S - nums[start], start + 1);
        int b = helper(nums, S + nums[start], start + 1);
        return a + b;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 1, 1};
        TargetSum ts = new TargetSum();
        System.out.println(ts.findTargetSumWays(nums, 3));
    }
}
