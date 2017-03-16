/**
 * Created by GelinZHU on 3/15/17.
 */
public class Pow {
    public double myPow(double x, int n) {
        if (n > 0) {
            return helper(x, n);
        } else {
            return 1 / helper(x, -n);
        }
    }

    public double helper(double x, int n) {
        if (n == 0) {
            return 1;
        }
        double v = helper(x, n / 2);
        if (n % 2 == 0) {
            return v * v;
        } else {
            return v * v * x;
        }
    }
}
