import java.util.Iterator;

/**
 * Created by GelinZHU on 4/18/17.
 */
public class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iter;
    Integer curr;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        iter = iterator;
        curr = iterator.hasNext() ? iterator.next() : null;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return curr;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer blah = curr;
        curr = iter.hasNext() ? iter.next() : null;
        return blah;
    }

    @Override
    public boolean hasNext() {
        return curr != null;
    }
}
