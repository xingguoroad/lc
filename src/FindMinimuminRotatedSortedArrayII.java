/**
 * Created by GelinZHU on 4/8/17.
 */
public class FindMinimuminRotatedSortedArrayII {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[left] < nums[right]) // not rotated
                return nums[left];

            if (left == right - 1) {
                return Math.min(nums[left], nums[right]);
            }

            if (nums[left] == nums[right]) {
                left += 1;
                continue;
            }

            if (nums[left] <= nums[mid]) {
                left = mid;
                continue;
            } else if (nums[mid] < nums[left]) {
                right = mid;
                continue;
            }

        }

        return nums[left - 1];
    }

    public static void main(String[] args) {
        FindMinimuminRotatedSortedArrayII fm = new FindMinimuminRotatedSortedArrayII();
        System.out.println(fm.findMin(new int[] {3, 1, 1}));
    }
}
