/**
 * Created by GelinZHU on 4/4/17.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        if (board.length == 0 || board == null || board[0].length == 0) {
            return false;
        }

        int row = board.length;
        int col = board[0].length;

        // Check all the rows
        for (int i = 0; i < row; i++) {
            boolean[] used = new boolean[col];
            for (int j = 0; j < col; j++) {
                if (!Character.isDigit(board[i][j])) {
                    continue;
                }
                int k = board[i][j] - '0';
                if (k <= 0 || k > 9) {
                    System.out.println("line 1");
                    return false;
                }
                if (used[k - 1] || k == 0) {
                    System.out.println("line 2");
                    return false;
                } else {
                    used[k - 1] = true;
                }
            }
        }

        // Check all col
        for (int i = 0; i < col; i++) {
            boolean[] used = new boolean[row];
            for (int j = 0; j < row; j++) {
                if (!Character.isDigit(board[j][i])) {
                    continue;
                }
                int k = board[j][i] - '0';
                if (k <= 0 || k > 9) {
                    System.out.println("line 3");
                    return false;
                }
                if (used[k - 1] || k == 0) {
                    System.out.println("line 4");
                    return false;
                } else {
                    used[k - 1] = true;
                }
            }
        }

        // Check 9 宫格
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int irow = i * 3;
                int icol = j * 3;
                boolean[] used = new boolean[9];
                for (int m = irow; m < irow + 3; m++) {
                    for (int n = icol; n < icol + 3; n++) {
                        int k = board[m][n] - '0';
                        if (!Character.isDigit(board[m][n])) {
                            continue;
                        }
                        if (k <= 0 || k > 9) {
                            System.out.println("line 5");
                            return false;
                        }
                        if (used[k - 1] || k == 0) {
                            System.out.println("line 6");
                            return false;
                        } else {
                            used[k - 1] = true;
                        }
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] boards = new char[][] {
                "..5.....6".toCharArray(),
                "....14...".toCharArray(),
                ".........".toCharArray(),
                ".....92..".toCharArray(),
                "5....2...".toCharArray(),
                ".......3.".toCharArray(),
                "...54....".toCharArray(),
                "3.....42.".toCharArray(),
                "...27.6..".toCharArray()};

        ValidSudoku vs = new ValidSudoku();
        System.out.println(vs.isValidSudoku(boards));
    }
}
