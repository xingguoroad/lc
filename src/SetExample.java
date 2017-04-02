import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by GelinZHU on 4/1/17.
 */
public class SetExample {
    public static void main(String[] args) {
        Set<List<Integer>> s = new HashSet<List<Integer>>();

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);

        List<Integer> l2 = new ArrayList<>(l1);

        s.add(l1);

        if (s.contains(l2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
