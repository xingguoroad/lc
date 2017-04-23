import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by GelinZHU on 4/16/17.
 */
public class ArraySortTest {
    public static void main(String[] args) {
        Integer[] nums = new Integer[] {1, 3, 5, 2, 4, 6};
        ArrayList<Integer>[] te = new ArrayList[10];
        te[1] = new ArrayList<Integer>();
        te[1].add(6);

        Arrays.sort(nums);


//        Arrays.sort(nums, new Comparator<Integer>() {
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        });

        System.out.println(Arrays.toString(nums));
    }
}
