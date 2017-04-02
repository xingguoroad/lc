import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by GelinZHU on 3/29/17.
 */
public class PickK {
    public List<List<Integer>> pick(List<Integer> input, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (input == null || input.size() == 0 || k == 0)
            return result;
        List<Integer> temp = new ArrayList<Integer>();

        helper(result, temp, 0, k, input);
        return result;
    }

    public void helper(List<List<Integer>> result, List<Integer> temp, int start, int k, List<Integer> input) {

        if (temp.size() == k) {
            ArrayList<Integer> b = new ArrayList<>(temp);
            result.add(b);
            return;
        }

        for (int j = start; j < input.size(); j++) {
            temp.add(input.get(j));
            helper(result, temp, j + 1, k, input);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        PickK pk = new PickK();
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        List<List<Integer>> t = pk.pick(input, 2);
    }
}
