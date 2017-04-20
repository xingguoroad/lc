import java.util.*;

/**
 * Created by GelinZHU on 4/18/17.
 */
public class GroupShiftedStrings {
    public List<List<String>> groupStrings(String[] strings) {
        HashMap<String, List<String>> data = new HashMap<String, List<String>>();
        for (int i = 0; i < strings.length; i ++) {
            String c = code(strings[i]);
            if (!data.containsKey(c)) {
                data.put(c, new LinkedList<String>());
            }
            data.get(c).add(strings[i]);
        }
        List<List<String>> result = new LinkedList<List<String>>();
        for (String s:data.keySet()) {
            result.add(data.get(s));
        }
        return result;
    }
    private String code(String s) {
        String result = "";
        for (int i = 1; i < s.length(); i ++) {
            int tmp = (s.charAt(i) - s.charAt(i-1) + 26 ) % 26;
            result += (char)tmp;
        }
        return result;
    }
}
