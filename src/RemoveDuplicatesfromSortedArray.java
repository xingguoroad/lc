import java.util.Arrays;

/**
 * Created by GelinZHU on 3/26/17.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }

        int i = 0;
        int j = 1;

        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        RemoveDuplicatesfromSortedArray rdfs = new RemoveDuplicatesfromSortedArray();
        int[] nums = new int[] {1, 1, 1, 2, 3, 3};
        rdfs.removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}
