import static java.lang.Math.toIntExact;

/**
 * Created by GelinZHU on 3/14/17.
 */
public class ReverseInteger {
    public int reverse(int x) {
        Long l = new Long(x);
        Integer max = Integer.MAX_VALUE;

        int sign = 1;
        if (x < 0) {
            sign = -1;
            x = -x;
        }

        long result = 0;
        while (x > 0) {
            result = result * 10 + x % 10;
            if (result > Integer.MAX_VALUE) {
                return 0;
            }
            x /= 10;
        }

        return toIntExact(result * sign);

    }

    public static void main(String[] args) {
        ReverseInteger ri = new ReverseInteger();
        ri.reverse(12345);
    }
}
