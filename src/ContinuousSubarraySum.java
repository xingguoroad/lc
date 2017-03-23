import java.util.HashMap;
import java.util.Map;

/**
 * Created by GelinZHU on 3/17/17.
 */
public class ContinuousSubarraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
//        k = Math.abs(k);
        if (nums.length < 2) {
            return false;
        }

        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            int rem = sum;
            if (k > 0) {
                rem = sum % k;
            }

            if (map.containsKey(rem)) {
                if ((i - map.get(rem)) > 1) {
                    return true;
                }
            } else {
                map.put(rem, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums= new int[] {0, 0};
        ContinuousSubarraySum css = new ContinuousSubarraySum();
        css.checkSubarraySum(nums, 0);
    }

}

