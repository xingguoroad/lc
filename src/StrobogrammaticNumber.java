import java.util.HashMap;
import java.util.Map;

/**
 * Created by GelinZHU on 4/16/17.
 */
public class StrobogrammaticNumber {
    public boolean isStrobogrammatic(String num) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6, 9);
        map.put(9, 6);
        map.put(1, 1);
        map.put(8,8);
        map.put(0, 0);

        if (num == null || num.length() == 0) {
            return false;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : num.toCharArray()) {
            if (!map.containsKey(c - '0')) {
                return false;
            }
            sb.append(map.get(c - '0'));
        }

        return sb.reverse().toString().equals(num);
    }

    public static void main(String[] args) {
        StrobogrammaticNumber sn = new StrobogrammaticNumber();
        System.out.println(sn.isStrobogrammatic("69"));
        System.out.println(sn.isStrobogrammatic("1"));
        System.out.println(sn.isStrobogrammatic("818"));
        System.out.println(sn.isStrobogrammatic("18"));
    }
}
