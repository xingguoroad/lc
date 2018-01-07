/**
 * Created by GelinZHU on 12/29/17.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int n : nums) {
            x ^= n;
        }

        return x;
    }
}
