/**
 * Created by GelinZHU on 3/30/17.
 */
public class FindMinimuminRotatedSortedArray {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] < nums[right]) {
                return nums[left];
            }
            int mid = (left + right) / 2;
            if (nums[mid] > nums[left]) {
                // in right half
                left = mid;
            } else if (nums[mid] < nums[left]){
                right = mid;
            }
            if (right - left == 1) {
                return Math.min(nums[left], nums[right]);
            }
        }
        return nums[left + 1];
    }

    public static void main(String[] args) {
        FindMinimuminRotatedSortedArray fm = new FindMinimuminRotatedSortedArray();
        System.out.println(fm.findMin(new int[] {1, 2, 3}));
    }
}
