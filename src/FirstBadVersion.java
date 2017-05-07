/**
 * Created by GelinZHU on 5/6/17.
 */
public class FirstBadVersion {
    public int firstBadVersion(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;

    }

    boolean isBadVersion(int version) {
        return true;
    }
}
