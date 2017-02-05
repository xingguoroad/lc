package easy;

/**
 * Created by GelinZHU on 2/5/17.
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s.length() == 0) {
            return null;
        }

        if (s.length() == 1) {
            return s;
        }

        String palindrome = s.substring(0, 1);   // The first char as palindrome.

        for (int i = 0; i < s.length(); i++) {
            String ts = helper(s, i, i);
            if (ts.length() > palindrome.length()) {
                palindrome = ts;
            }

            ts = helper(s, i, i + 1);
            if (ts.length() > palindrome.length()) {
                palindrome = ts;
            }
        }
        return palindrome;
    }

    // A helper function to search palindrome starting from begin and end.
    // if begin==end, we have one center, otherwise, we have two centers.
    public String helper(String s, int begin, int end) {
        while (begin >= 0 && end < s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }

        return s.substring(begin + 1, end);
    }
}
