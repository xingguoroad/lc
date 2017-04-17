import java.util.*;

/**
 * Created by GelinZHU on 4/16/17.
 */
public class InsertDeleteGetRandomO1 {
    List<Integer> list;
    Map<Integer, Integer> map;
    Random rand;

    /** Initialize your data structure here. */
    public InsertDeleteGetRandomO1() {
        list = new ArrayList<>();
        map = new HashMap<>();
        rand = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        } else {
            int index = map.remove(val);
            int t = list.remove(list.size() - 1);   // remove last data
            if (t != val) {
                list.set(index, t);
                map.put(t, index);
            }
            return true;
        }

    }

    /** Get a random element from the set. */
    public int getRandom() {
        return list.get(rand.nextInt(list.size()));
    }
}
