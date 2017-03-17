/**
 * Created by GelinZHU on 3/16/17.
 */
public class SquareRoot {
    public int mySqrt(int x) {
        // For any x, it's square root won't large than x / 2 + 1;
        long upper = x / 2 + 1;
        long mid;
        long low = 0;

        while (low <= upper) {
            mid = (low + upper) / 2;
            if ((mid * mid) > x) {
                upper = mid - 1;
            } else if (mid * mid < x) {
                low = mid + 1;
            } else {
                return (int) mid;
            }
        }
        return (int) low;

    }

    public static void main(String[] args) {
        SquareRoot sr = new SquareRoot();
        System.out.println(sr.mySqrt(1));
    }
}
