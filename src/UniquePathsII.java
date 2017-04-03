/**
 * Created by GelinZHU on 4/2/17.
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null || obstacleGrid.length == 0) {
            return 0;
        }

        if (obstacleGrid[0][0] == 1) {
            return 0;
        }
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;

        int[][] d = new int[obstacleGrid.length][obstacleGrid[0].length];
        int i = 0;
        while (i < col && obstacleGrid[0][i] != 1) {
            d[0][i] = 1;
            i++;
        }

        int j = 0;
        while (j < row && obstacleGrid[j][0] != 1) {
            d[j][0] = 1;
            j++;
        }

        for (int m = 1; m < row; m++) {
            for (int n = 1; n < col; n++) {
                if (obstacleGrid[m][n] == 0) {
                    d[m][n] = d[m - 1][n] + d[m][n-1];
                }
            }
        }

        return d[row - 1][col - 1];
    }

    public static void main(String[] args) {
        UniquePathsII up = new UniquePathsII();
        int[][] ob = new int[][] {{0}};
        System.out.println(up.uniquePathsWithObstacles(ob));
     }
}
