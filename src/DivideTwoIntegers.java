/**
 * Created by GelinZHU on 3/15/17.
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        int sign = 1;
        if (Integer.signum(dividend) != Integer.signum(divisor)) {
            sign = -1;
        }

        long mdivident = Math.abs((long) dividend);
        long mdivisor = Math.abs((long) divisor);

        int result = 0;

        while (mdivident >= mdivisor) {
            int counter = 0;
            while (mdivident >= (mdivisor << counter)) {
                counter++;
            }
            result += 1 << (counter - 1);
            mdivident -= mdivisor << (counter - 1);
        }

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        return sign * result;
    }

    public static void main(String[] args) {
        DivideTwoIntegers dti = new DivideTwoIntegers();
        System.out.println(dti.divide(1, 1));
    }
}
