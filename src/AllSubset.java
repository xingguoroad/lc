import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 3/29/17.
 */
public class AllSubset {
    public List<List<Integer>> getAllSubset(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (nums == null || nums.length == 0) {
            return result;
        }

        List<Integer> temp = new ArrayList<Integer>();
        helper(result, nums, temp, 0);

        return result;

    }
    public void helper(List<List<Integer>> result, int[] nums, List<Integer> temp, int start) {
        if (temp.size() > nums.length) {
            return;
        }

        List<Integer> t = new ArrayList<Integer>(temp);
        result.add(t);

        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(result, nums, temp, i + 1);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        AllSubset as = new AllSubset();
        int[] nums = new int[] {1, 2, 3, 4};
        List<List<Integer>> l = as.getAllSubset(nums);

        System.out.println(l);

    }
}
