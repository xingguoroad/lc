package easy;

import java.util.HashSet;

/**
 * Created by GelinZHU on 2/5/17.
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        HashSet<Character> hs = new HashSet<>();
        int walker = 0;
        int runner = 0;
        int max = 0;

        while (runner < s.length()) {
            if (hs.contains(s.charAt(runner))) {    // We find a char already in hash set.
                if (max < (runner - walker)) {
                    max = runner - walker;          // update max if needed
                }

                while (s.charAt(walker) != s.charAt(runner)) {
                    hs.remove(s.charAt(walker));
                    walker++;
                }
                walker++;
            } else {
                hs.add(s.charAt(runner));
            }
            runner++;
        }

        return Math.max(max, runner - walker);
    }
}
