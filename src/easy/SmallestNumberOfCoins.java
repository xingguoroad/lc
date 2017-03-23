package easy;

/**
 * Created by GelinZHU on 3/21/17.
 */
public class SmallestNumberOfCoins {
    public int[] coins = new int[] {1, 3, 5};

    int findSmallestCombination(int total) {
        int[] d = new int[total + 1];
        d[0] = 0;
        d[1] = 1;

        for (int i = 2; i < total + 1; i++) {
            d[i] = Integer.MAX_VALUE;
        }

        for (int i = 2; i < total + 1; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] < 0) {
                    continue;
                }
                if (d[i - coins[j]] + 1 < d[i]) {
                    d[i] = d[i - coins[j]] + 1;
                }
            }
        }

        return d[total];
    }

    public static void main(String[] args) {
        SmallestNumberOfCoins snoc = new SmallestNumberOfCoins();
        System.out.println(snoc.findSmallestCombination(11));
    }
}
