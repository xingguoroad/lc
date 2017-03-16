import java.util.HashMap;

/**
 * Created by GelinZHU on 3/14/17.
 */
public class Roman_to_Integer {
    public int romanToInt(String s) {
        int result = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int i = 0;
        for (; i < s.length() - 1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i + 1))) {
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        result += map.get(s.charAt(i));
        return result;
    }
    public static void main(String[] args) {
        Roman_to_Integer ri = new Roman_to_Integer();
        System.out.println(ri.romanToInt("CCC"));
    }

}
