import java.util.ArrayList;
import java.util.List;


public class MissingRanges {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> result = new ArrayList<String>();
        long start = (long)lower - 1;
        for (int i = 0; i <= nums.length; i++) {
            long end = (i == nums.length) ? (long)upper + 1 : nums[i];
            if (start + 2 <= end) {
                result.add(getItem(start + 1, end - 1));
            }
            start = end;
        }
        return result;
    }

    private String getItem(long start, long end) {
        return (start == end) ? String.valueOf(start) : start + "->" + end;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2147483647};
        MissingRanges mr = new MissingRanges();
        System.out.println(mr.findMissingRanges(nums, -2147483648, 2147483647));
    }
}