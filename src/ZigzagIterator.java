import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by GelinZHU on 4/13/17.
 */
public class ZigzagIterator {
    ArrayList<Integer> a;
    int p;

    public ZigzagIterator(List<Integer> v1, List<Integer> v2) {
        p = 0;
        int i = 0;
        int j = 0;
        a = new ArrayList<>(v1.size() + v2.size());
        while (i < v1.size() || j < v2.size()) {
            if (i < v1.size()) {
                a.add(v1.get(i));
                i++;
            }
            if (j < v2.size()) {
                a.add(v2.get(j));
                j++;
            }
        }
    }

    public int next() {
        int c = a.get(p);
        p++;
       return c;
    }

    public boolean hasNext() {
        return  p < a.size();
    }

    public static void main(String[] args) {
        List<Integer> v1 = new ArrayList<>();
        v1.add(1);
        v1.add(2);
        List<Integer> v2 = new ArrayList<>();
        v2.add(3);
        v2.add(4);
        v2.add(5);
        v2.add(6);
        ZigzagIterator zi = new ZigzagIterator(v1, v2);

        while (zi.hasNext()) {
            System.out.println(zi.next());
        }
    }
}
