import java.util.Arrays;

/**
 * Created by GelinZHU on 4/16/17.
 */

// Solution: http://bookshadow.com/weblog/2015/09/09/leetcode-perfect-squares/
public class PerfectSquares {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[0] = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; i + j * j <= n; j++) {
                dp[i + j * j] = Math.min(dp[i + j * j], dp[i] + 1);
            }
        }

        return dp[n];
    }
}
