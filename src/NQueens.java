import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by GelinZHU on 4/2/17.
 */
public class NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<List<String>>();

        if (n <= 0) {
            return result;
        }

        int[] columnVal = new int[n];
        helper(n, result, 0, columnVal);

        return result;
    }

    public void helper(int n, List<List<String>> result, int row, int[] columnVal) {
        if (row == n) {
            String[] unit = new String[n];

            for (int i = 0; i < n; i++) {
                StringBuffer sb = new StringBuffer();
                for (int j = 0; j < n; j++) {
                    if (j == columnVal[i]) {
                        sb.append("Q");
                    } else {
                        sb.append(".");
                    }
                }
                unit[i] = sb.toString();
            }
            result.add(Arrays.asList(unit));
        } else {
            for (int i = 0; i < n; i++) {
                columnVal[row] = i;
                if (isValid(row, columnVal)) {
                    helper(n, result, row + 1, columnVal);
                }
            }
        }
    }

    public boolean isValid(int row, int[] columnVal) {
        for (int i = 0; i < row; i++) {
            if (columnVal[i] == columnVal[row] || Math.abs(columnVal[i] - columnVal[row]) == row -i) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        NQueens nq = new NQueens();
        List<List<String>> l = nq.solveNQueens(8);

        for (int i = 0; i < l.size(); i++) {
            System.out.println("解" + i);
            System.out.println(l.get(i));
        }
    }
}
