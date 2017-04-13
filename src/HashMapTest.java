import java.util.HashMap;
import java.util.Map;

/**
 * Created by GelinZHU on 4/13/17.
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('c', 1);

        if (map.get('t') == null) {
            System.out.println("haha");
        }
    }
}
