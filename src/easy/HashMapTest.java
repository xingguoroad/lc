package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by GelinZHU on 5/1/17.
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        if (map.containsKey('c')) {
            System.out.println("haha");
        } else {
            System.out.println("hehe");
        }
    }
}
