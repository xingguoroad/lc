/**
 * Created by GelinZHU on 3/22/17.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // find the shortest string
        int minLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minLength) {
                minLength = str.length();
            }
        }

        char prev;

        for (int i = 0; i < minLength; i++) {
            prev = '0';
            for (int j = 0; j < strs.length; j++) {
                if (j == 0) {
                    prev = strs[j].charAt(i);
                    continue;
                }

                if (strs[j].charAt(i) != prev) {
                    return strs[j].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, minLength);
    }
}
