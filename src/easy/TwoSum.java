package easy;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by GelinZHU on 3/13/17.
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int[] result = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[1] = i;
                result[0] = map.get(nums[i]);
            } else {
                map.put(target - nums[i], i);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        System.out.println(twoSum(nums, 9));
    }

}
