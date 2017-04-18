import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 4/18/17.
 */
public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if (nums.length == 0 || nums == null) {
            return list;
        }

        int i = 0;
        int j = i;

        while (j < nums.length) {
            while (j + 1< nums.length && (nums[j] + 1 == nums[j + 1])) {
                j++;
            }

            if (i == j) {
                list.add(String.valueOf(nums[i]));
            } else {
                list.add(nums[i] + "->" + nums[j]);
            }
            i = j + 1;
            j = i;
        }


        return list;

    }
}
