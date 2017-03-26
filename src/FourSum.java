import java.util.*;

/**
 * Created by GelinZHU on 3/23/17.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (nums.length == 0 || nums == null) {
            return  result;
        }


        Arrays.sort(nums);
        Set<List<Integer>> s = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                for (int j = i + 1; j < nums.length - 2; j++) {
                    int low = j + 1;
                    int high = nums.length - 1;
                    while (low < high) {
                        int sum = nums[i] + nums[j] + nums[low] + nums[high];
                        if (sum == target) {
                            List<Integer> l = new ArrayList<>();
                            l.add(nums[i]);
                            l.add(nums[j]);
                            l.add(nums[low]);
                            l.add(nums[high]);
                            if (!s.contains(l)) {
                                s.add(l);
                                result.add(l);
                            }
                            low++;
                            high--;
                        } else if (sum < target) {
                            low++;

                            while (low < nums.length && nums[low] == nums[low - 1]) {
                                low++;
                            }

                        } else {
                            high--;
                            while (high >= 0 && nums[high] == nums[high + 1]) {
                                high--;
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FourSum fs = new FourSum();
        System.out.println(fs.fourSum(new int[] {-3,-2,-1,0,0,1,2,3},0));
    }
}
