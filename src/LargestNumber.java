import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by GelinZHU on 3/31/17.
 */
public class LargestNumber {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        String[] nString = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            nString[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(nString, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String l2r = o1 + o2;
                String r2l = o2 + o1;
                return -l2r.compareTo(r2l);
            }
        });

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < nString.length; i++) {
            sb.append(nString[i]);
        }

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }
}
