/**
 * Created by GelinZHU on 4/13/17.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        int max = 0;
        int count = 0;
        for (int i : nums) {
            if (i == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1};
        MaxConsecutiveOnes mc = new MaxConsecutiveOnes();
        System.out.println(mc.findMaxConsecutiveOnes(nums));
    }
}
