import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 4/1/17.
 */
public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums.length == 0|| nums == null) {
            return result;
        }



        List<Integer> temp = new ArrayList<>();
        helper(result, temp, 0, nums);
        return result;
    }

    public void helper(List<List<Integer>> result, List<Integer> temp, int start, int[] nums) {

        List<Integer> p = new ArrayList<>(temp);
        result.add(p);

        if (temp.size() == nums.length) {
            return;
        }


        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            helper(result, temp, i + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[] {1, 2, 3};
        Permutations p = new Permutations();
        System.out.println(p.permute(a));
    }
}
