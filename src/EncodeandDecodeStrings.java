import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 4/14/17.
 */
public class EncodeandDecodeStrings {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        if (strs == null || strs.size() == 0) {
            return "";
        }
        StringBuffer sb = new StringBuffer();
        for (String str : strs) {
            int len = str.length();
            sb.append(len);
            sb.append("#");
            sb.append(str);
        }
        return sb.toString();

    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> list = new ArrayList<>();

        if (s == null || s.length() == 0) {
            return list;
        }


        while (s.length() > 0) {
            int p = 0;
            int pos = s.indexOf("#");
            int len = Integer.valueOf(s.substring(p, pos));
            list.add(s.substring(pos + 1, pos + len + 1));
            p = pos + 1;
            s = s.substring(pos + len + 1);
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("hello");
        strs.add("world");
        strs.add("how2udo");
        EncodeandDecodeStrings ed = new EncodeandDecodeStrings();
        String encoded = ed.encode(strs);
        System.out.println(ed.decode(encoded));
    }
}
