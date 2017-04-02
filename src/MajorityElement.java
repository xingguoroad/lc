/**
 * Created by GelinZHU on 3/31/17.
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }

        int count = 0;
        int result = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                result = nums[i];
                count++;
            } else {
                if (result != nums[i]) {
                    count--;
                } else {
                    count++;
                }
            }
        }
        return result;
    }
}
