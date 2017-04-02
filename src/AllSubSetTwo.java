import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 3/29/17.
 */
public class AllSubSetTwo {
    public List<List<Integer>> getAllSubset(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        int n = 1 << nums.length;

        result.add(new ArrayList<Integer>());
        for (int i = 1; i < n; i++) {
            int m = i;
            List<Integer> temp = new ArrayList<>();

            for (int j = 0; j < nums.length; j++) {
                if (m != 0 && (m & 0x1) != 0) {
                    temp.add(nums[j]);
                }
                m = m >>> 1;
            }


            result.add(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        AllSubSetTwo ast = new AllSubSetTwo();
        int[] nums = new int[] {1, 2, 3, 4};
        System.out.println(ast.getAllSubset(nums));
    }
}
