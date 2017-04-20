import java.util.Arrays;

/**
 * Created by GelinZHU on 4/19/17.
 */
public class FindPermutation {

    public int[] findPermutation(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }

        int[] result = new int[s.length() + 1];
        for (int i = 0; i <= s.length(); i++) {
            result[i] = i + 1;
        }

        int start = 0; int count = 0; int end = s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'D') {
                start = i;
                while (i < s.length() && s.charAt(i) == 'D') {
                    i++;
                }
                reverse(result, start, i);
                i--;
            }
        }
        return result;
    }
    public void reverse(int[] result, int start, int end) {
        while (start < end) {
            int temp = result[start];
            result[start] = result[end];
            result[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        FindPermutation fp = new FindPermutation();
        System.out.println(Arrays.toString(fp.findPermutation("DDIIDI")));
    }


}
