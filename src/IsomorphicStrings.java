import java.util.HashMap;
import java.util.Map;

/**
 * Created by GelinZHU on 4/7/17.
 */
public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        if (s == null && t == null) {
            return true;
        }

        if (s.length() == 1 && t.length() == 1) {
            return s.charAt(0) == t.charAt(0);
        }

        Map<Character, Character> map = new HashMap<>();

        int i = 0;
        while (i < s.length()) {
            if (map.containsKey(s.charAt(i))) {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else {
                if (map.containsValue(t.charAt(i))) {
                    return false;
                }
                map.put(s.charAt(i), t.charAt(i));
            }
            i++;
        }

        return true;
    }

}
