/**
 * Created by GelinZHU on 4/14/17.
 */
public class RangeSumQuery2DMutable {
    int[][] sum;
    int[][] myMatrix;
    public RangeSumQuery2DMutable(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return;
        }
        myMatrix = matrix;
        sum = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = 1; i <= matrix.length; i++) {
            for (int j = 1; j <= matrix[0].length; j++) {
                sum[i][j] = sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1] + matrix[i - 1][j - 1];
            }
        }
    }

    public void update(int row, int col, int val) {
        // matrix[row][col] change will make sum[i+1][j+1] change
        int delta = myMatrix[row][col] - val;
        // every points after row, col will be affected
        for (int i = row + 1; i <= myMatrix.length; i++) {
            for (int j = col + 1; j <= myMatrix[0].length; j++) {
                sum[i][j] += delta;
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sum[row2 + 1][col2 + 1]  - sum[row1][col2 + 1] - sum[row2 + 1][col1] + sum[row1][col1];
    }
}
