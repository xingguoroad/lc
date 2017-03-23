import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by GelinZHU on 3/22/17.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (nums == null || nums.length < 3) {
            return result;
        }


        // sort nums
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] > nums[i - 1]) {
                int low = i + 1;
                int high = nums.length - 1;

                while (low < high) {
                    if (nums[i] + nums[low] + nums[high] == 0) {
                        List<Integer> l = new ArrayList<Integer>();
                        l.add(nums[i]);
                        l.add(nums[low]);
                        l.add(nums[high]);
                        result.add(l);
                        low++;
                        high--;

                        // handle duplicate
                        while (low < high && nums[low] == nums[low - 1]) {
                            low++;
                        }
                        while (low < high && nums[high] == nums[high + 1]) {
                            high--;
                        }

                    } else if (nums[i] + nums[low] + nums[high] > 0) {
                        high--;
                    } else {
                        low++;
                    }
                }
            }
        }

        return result;

    }

    public static void main(String[] args) {
        ThreeSum ts = new ThreeSum();
        System.out.println(ts.threeSum(new int[] {-1,0,1,2,-1,-4}));
    }
}
