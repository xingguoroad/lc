import java.util.*;

/**
 * Created by GelinZHU on 4/1/17.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();

        if (strs == null || strs.length == 0) {
            return result;
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String ns = String.valueOf(arr);

            if (map.containsKey(ns)) {
                List<String> l = map.get(ns);
                l.add(s);
            } else {
                List<String> m = new ArrayList<String>();
                m.add(s);
                map.put(ns, m);
            }
        }

        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            result.add(e.getValue());
        }

        return result;

    }
}
