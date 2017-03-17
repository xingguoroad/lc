import java.util.HashSet;
import java.util.Set;

/**
 * Created by GelinZHU on 3/16/17.
 */
public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> exist = new HashSet<Integer>();
        while (!exist.contains(n)) {
            exist.add(n);
            int sum = getSum(n);
            if (sum == 1) {
                return true;
            }
            n = sum;
        }
        return false;
    }

    int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /=10;
        }
        return sum;
    }
}
