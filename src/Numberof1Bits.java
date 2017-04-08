/**
 * Created by GelinZHU on 4/8/17.
 */
public class Numberof1Bits {
    public int hammingWeight(int n) {
        if (n == 0) {
            return 0;
        }

        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >>> 1;
        }

        return count;
    }
}
