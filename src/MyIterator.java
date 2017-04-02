import java.util.Iterator;
import java.util.List;

/**
 * Created by GelinZHU on 3/28/17.
 */
public class MyIterator<T> implements Iterable<T> {
    T values;
    int i;


    public MyIterator(T v) {
        this.values = v;
    }

    public Iterator<T> iterator() {
        return new MyIteratorIterator();
    }

    class MyIteratorIterator implements Iterator<T> {
        @Override
        public boolean hasNext() {
            return true;
        }

        @Override
        public T next() {
            return values;
        }

    }

}
