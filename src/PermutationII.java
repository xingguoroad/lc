import java.util.*;

/**
 * Created by GelinZHU on 4/1/17.
 */
public class PermutationII {
    // Solution 1: Using SET
    /**
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        Set<List<Integer>> s = new HashSet<List<Integer>>();
        List<Integer> temp = new ArrayList<>();

        if (nums.length == 0 || nums == null) {
            return result;
        }

        boolean[] visited = new boolean[nums.length];

        helper(result, temp, visited, nums, 0, s);
        return result;
    }

    public void helper(List<List<Integer>> result, List<Integer> temp, boolean[] visited, int[] nums, int start, Set<List<Integer>> s) {
        if (temp.size() == nums.length) {
            List<Integer> p = new ArrayList<>(temp);
            if (!s.contains(p)) {
                s.add(p);
                result.add(p);
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                temp.add(nums[i]);
                visited[i] = true;
                helper(result, temp, visited, nums, i + 1, s);
                temp.remove(temp.size() - 1);
                visited[i] = false;
            }
        }
    }
     **/

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        List<Integer> temp = new ArrayList<>();

        if (nums.length == 0 || nums == null) {
            return result;
        }

        Arrays.sort(nums);

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
            // 如果本数之前的数字和这个数字相同，但是还没有被使用过，则这个数字也不应该被使用
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1]) {
                continue;
            }

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
        int[] nums = new int[] {1, 1, 2};
        PermutationII pp = new PermutationII();
        System.out.println(pp.permuteUnique(nums));
    }
}
