import java.util.HashMap;
import java.util.Map;

/**
 * Created by GelinZHU on 3/31/17.
 */
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0 || numbers == null) {
            return null;
        }

        int[] result = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int t = numbers[left] + numbers[right];
            if (left < numbers.length && t < target ) {
                left++;
            } else if (t > target) {
                right--;
            } else {
                result[0] = left + 1;
                result[1] = right + 1;
                return result;
            }
        }
        return result;
    }
}
