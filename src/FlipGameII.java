/**
 * Created by GelinZHU on 4/18/17.
 */
public class FlipGameII {
    public boolean canWin(String s) {
        if (s.length() == 0 || s == null) {
            return true;
        }

        char[] arr = s.toCharArray();
        return canWinHelper(arr);

    }

    private boolean canWinHelper(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == '+' && arr[i + 1] == '+') {
                arr[i] = '-';
                arr[i + 1] = '-';
                boolean win = !canWinHelper(arr);

                arr[i] = '+';   // 注意这里就要重设，在backtracking里面马上重设非常重要。我第一次写把这两行放在if（win）之后，这样的错误非常低级，因为有情况时候win会true，我们return去上一层，backtracking居然没有重新把标过的重置

                arr[i + 1] = '+';
                if (win) {
                    return true;
                }



            }

        }
        return false;
    }

    public static void main(String[] args) {
        FlipGameII fg = new FlipGameII();
        System.out.println(fg.canWin("++++"));
    }
}
