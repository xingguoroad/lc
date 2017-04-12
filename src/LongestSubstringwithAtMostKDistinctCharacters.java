import java.util.HashMap;
import java.util.Map;

/**
 * Created by GelinZHU on 4/11/17.
 */
public class LongestSubstringwithAtMostKDistinctCharacters {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (s == null || s.length() == 0 || k == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int max = Integer.MIN_VALUE;
        int start = 0;

        for (; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

            if (map.size() > k) {
                max = Math.max(max, i - start);

                while (map.size() > k) {
                    char t = s.charAt(start);

                    if (map.get(t) == 1) {
                        map.remove(t);
                    } else {
                        map.put(t, map.get(t) - 1);
                    }
                    start++;
                }
            }
        }

        max = Math.max(max, s.length() - start);
        return max;

    }
}
