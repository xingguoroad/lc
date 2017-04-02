/**
 * Created by GelinZHU on 3/28/17.
 */
public class ClimbingStairs {
    public int myClimStairs(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];

    }

    public static void main(String[] args) {
        ClimbingStairs cs = new ClimbingStairs();
        for (int i = 0; i < 100; i++) {
            System.out.println(cs.climbStairs(i) + "  " + cs.myClimStairs(i));
        }
    }
}
