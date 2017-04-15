import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by GelinZHU on 4/15/17.
 */
public class ValidWordAbbr {
    Map<String, String> map = new HashMap<>();
    public ValidWordAbbr(String[] dictionary) {
        if (dictionary == null || dictionary.length == 0) {
            return;
        }

        for (String s : dictionary) {
            String c = getAbbr(s);
            if (map.containsKey(c)) {
                if (map.get(c).equals(s)) {
                    continue;
                }
                map.put(c, "");
            } else {
                map.put(c, s);
            }

        }

    }

    public boolean isUnique(String word) {
        String t = getAbbr(word);
        if (map.containsKey(t)) {
            if (map.get(t).equals(word)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public String getAbbr(String s) {
        if (s.length() <= 2) {
            return s;
        }
        String b = s.substring(0, 1) + String.valueOf(s.length() - 2) + s.substring(s.length() - 1, s.length());
        return b;
    }

    public static void main(String[] args) {
//        String[] dictionary = new String[] {"deer","door","cake","card"};
        String[] dictionary = new String[] {"hello"};
        ValidWordAbbr vw = new ValidWordAbbr(dictionary);
        System.out.println(vw.isUnique("hello"));


    }
}
