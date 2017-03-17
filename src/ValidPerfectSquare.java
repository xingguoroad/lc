/**
 * Created by GelinZHU on 3/17/17.
 */
public class ValidPerfectSquare {
    public boolean isPerfectSquare(int num) {

        long high = num / 2 + 1;
        long low = 1;
        long mid;

        while (low <= high) {
            mid = (low + high) / 2;
           long p = mid * mid;
           if (p == num) {
               return true;
           } else if (p > num) {
               high = mid - 1;
           } else {
               low = mid + 1;
           }
        }

        return false;

    }
}
