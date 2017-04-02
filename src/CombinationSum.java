import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by GelinZHU on 4/1/17.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (candidates == null || candidates.length == 0) {
            return result;
        }

        List<Integer> temp = new ArrayList<>();
        Arrays.sort(candidates);
        helper(result, temp, target, 0, candidates);
        return result;

    }
    public void helper(List<List<Integer>> result, List<Integer> temp, int target, int start, int[] candidates) {
        if (target == 0) {
            List<Integer> p = new ArrayList<>(temp);
            result.add(p);
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (target < candidates[i])
                return;

            temp.add(candidates[i]);
            helper(result, temp, target - candidates[i], i, candidates);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] candidates = new int[] {2, 3, 6, 7};
        CombinationSum cs = new CombinationSum();
        System.out.println(cs.combinationSum(candidates, 7));
    }
}
