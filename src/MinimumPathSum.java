/**
 * Created by GelinZHU on 4/2/17.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int[][] d = new int[grid.length][grid[0].length];
        d[0][0] = grid[0][0];

        // Initialize first row
        for (int i = 1; i < grid[0].length; i++) {
            d[0][i] = d[0][i - 1] + grid[0][i];
        }

        // Initialize first col
        for (int i = 1; i < grid.length; i++) {
            d[i][0] = d[i - 1][0] + grid[i][0];
        }

        // do the DP table
        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                d[i][j] = Math.min(d[i-1][j], d[i][j - 1]) + grid[i][j];
            }
        }

        return d[grid.length - 1][grid[0].length - 1];


    }
}
