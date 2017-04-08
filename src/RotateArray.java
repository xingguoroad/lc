import java.util.Arrays;

/**
 * Created by GelinZHU on 4/8/17.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {

        if (nums == null || nums.length <= 1) {
            return;
        }

        k = k % nums.length;

        rotate(nums, 0, nums.length - k - 1);
        rotate(nums, nums.length - k, nums.length - 1);
        rotate(nums, 0, nums.length - 1);
     }

    public void rotate(int[] nums, int left, int right) {
        // rotate inclusive of left and right
        while (left <= right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6, 7};
        RotateArray ra = new RotateArray();
        ra.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
