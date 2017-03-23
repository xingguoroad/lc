package easy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by GelinZHU on 3/18/17.
 */
public class SortIntegerDecending {
    private static class IntegerComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[] {1, 2, 3, 4, 5};
        Arrays.sort(a, new IntegerComparator());
        for (int num : a) {
            System.out.println(num);
        }
    }
}
