import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by GelinZHU on 4/24/17.
 */
public class FindAllNumbersDisappearedinanArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }



        for (int i = 0; i < nums.length; i++) {
            while (i + 1 != nums[i] && nums[i] != nums[nums[i] - 1]) {
                // swap
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums[i]) {
                result.add(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {4,3,2,7,8,2,3,1};
        FindAllNumbersDisappearedinanArray fn = new FindAllNumbersDisappearedinanArray();

        System.out.println(fn.findDisappearedNumbers(nums));
    }
}
