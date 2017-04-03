import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 4/2/17.
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if (matrix == null || matrix.length == 0) {
            return result;
        }

        int row = matrix.length;
        int col = matrix[0].length;

        int x = 0, y = 0;

        while (row > 0 && col > 0) {

            //Treating special case if row = 1.
            if (row == 1) {
                for (int i = 0; i < col; i++) {
                    result.add(matrix[x][y+i]);
                }
                break;
            } else if (col == 1) {
                for (int i = 0; i < row; i++) {
                    result.add(matrix[x+i][y]);
                }
                break;
            }

            // circle case
            // move right
            for (int i = 0; i < col - 1; i++) {
                result.add(matrix[x][y++]);
            }

            // move down
            for (int i = 0; i < row - 1; i++) {
                result.add(matrix[x++][y]);
            }

            for (int i = 0; i < col - 1; i++) {
                result.add(matrix[x][y--]);
            }

            for (int i = 0; i < row - 1; i++) {
                result.add(matrix[x--][y]);
            }

            x++;
            y++;
            row -= 2;
            col -= 2;
        }
        return result;
    }

    public static void main(String[] args) {
        SpiralMatrix sm = new SpiralMatrix();
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5,6}, {7,8,9}};

        System.out.println(sm.spiralOrder(matrix));
    }
}
