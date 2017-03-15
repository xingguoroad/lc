/**
 * Created by GelinZHU on 3/14/17.
 */
public class PalindromeInte {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        for (int i = 0, j = s.length() - 1; i <=j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        PalindromeInte p = new PalindromeInte();

        p.isPalindrome(1714774171);
    }

}
