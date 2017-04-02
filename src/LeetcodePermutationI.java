import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 4/1/17.
 */
public class LeetcodePermutationI {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        List<Integer> temp = new ArrayList<>();

        if (nums.length == 0 || nums == null) {
            return result;
        }

        boolean[] visited = new boolean[nums.length];

        helper(result, temp, visited, nums, 0);
        return result;
    }

    public void helper(List<List<Integer>> result, List<Integer> temp, boolean[] visited, int[] nums, int start) {
        if (temp.size() == nums.length) {
            List<Integer> p = new ArrayList<>(temp);
            result.add(p);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                temp.add(nums[i]);
                visited[i] = true;
                helper(result, temp, visited, nums, i + 1);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        LeetcodePermutationI lp = new LeetcodePermutationI();
        System.out.println(lp.permute(new int[] {1, 2, 3}));
    }
}
