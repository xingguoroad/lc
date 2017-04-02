import java.util.*;

/**
 * Created by GelinZHU on 3/28/17.
 */
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }

        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, curr, 0, target, result);
        return result;
    }

    public void helper(int[] candidates, List<Integer> curr, int start, int target, List<List<Integer>> result) {
        if (target == 0) {
            ArrayList<Integer> temp = new ArrayList<>(curr);
            result.add(temp);
            return;
        }

        if (target < 0) {
            return;
        }

        int prev = -1;
        for (int i = start; i < candidates.length; i++) {
            if (prev != candidates[i]) {
                curr.add(candidates[i]);
                helper(candidates, curr, i + 1, target - candidates[i], result);
                curr.remove(curr.size() - 1);
                prev = candidates[i];
            }
        }
    }
    public static void main(String[] args) {
        CombinationSumII cs = new CombinationSumII();
        List<List<Integer>> result = cs.combinationSum2(new int[] {10, 1, 2, 7, 6, 1, 5}, 8);
        System.out.println(result.toString());
    }
}
