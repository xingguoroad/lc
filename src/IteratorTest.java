import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by GelinZHU on 3/29/17.
 */
public class IteratorTest implements Iterator<Object> {
    int start;
    int end;
    List<List<Integer>> myvalues;

    public IteratorTest(List<List<Integer>> values) {
        start = 0;
        int max = Integer.MIN_VALUE;
        for (List<Integer> v : values) {
            if (max < v.size()) {
                max = v.size();
            }
        }
        end = max;
        myvalues = values;

    }

    @Override
    public boolean hasNext() {
        return start < end;
    }

    @Override
    public List<Integer> next() {
        if (start < end) {
            List<Integer> temp = new ArrayList<>();
            for (List<Integer> v : myvalues) {
                if (v.size() < start)
                    temp.add(v.get(start));
            }
            start++;
            return temp;
        }
        return null;
    }

    @Override
    public void remove() {
        ;   // do nothing
    }


}
