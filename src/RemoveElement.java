import java.util.Arrays;

/**
 * Created by GelinZHU on 3/26/17.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int i = 0;
        while (i < nums.length && nums[i] != val){
            i++;
        }

        // Found val, i now points to first val
        int j = i;
        while (j < nums.length && nums[j] == nums[i]) {
            j++;
        }

        if (j < nums.length) {   // we have case where nums[j] != nums[i]
            while (j < nums.length) {
                nums[i] = nums[j];
                i++;
                j++;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = new int[] {3, 2, 2, 3};
        int p = re.removeElement(nums, 3);
        System.out.println(Arrays.toString(nums));
        System.out.println(p);
    }
}
