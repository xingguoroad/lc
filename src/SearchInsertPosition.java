/**
 * Created by GelinZHU on 3/27/17.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        // first binary search find target
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (mid > left && nums[mid] > target && nums[mid - 1] < target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;

    }
    public static void main(String[] args) {
        SearchInsertPosition sip = new SearchInsertPosition();
        System.out.println(sip.searchInsert(new int[] {1}, 2));
    }
}
