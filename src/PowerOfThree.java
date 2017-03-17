/**
 * Created by GelinZHU on 3/17/17.
 */
public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n == 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        if (n == 2) {
            return false;
        }
        if (n > 1) {
            return n % 3 == 0 && isPowerOfThree(n / 3);
        }
        return false;
    }
}
