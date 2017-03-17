/**
 * Created by GelinZHU on 3/17/17.
 */
public class ArrangeCoins {
    public int arrangeCoins(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int high = n;
        int low = 1;
        while (low < high) {
            int mid = (low + high) / 2;
            int result = mid + (mid * (mid - 1) / 2);
            if (result <= n) {
                low = mid + 1;
            } else  {
                high = mid;
            }

        }
        return low - 1;
    }

    public static void main(String[] args) {
        ArrangeCoins ac = new ArrangeCoins();
        System.out.println(ac.arrangeCoins(5));
    }
}
