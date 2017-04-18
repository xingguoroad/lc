import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by GelinZHU on 4/17/17.
 */
public class StrobogrammaticNumberII {
    public List<String> helper(int n, int m) {
       if (n == 0) {
           return new ArrayList<String>(Arrays.asList(""));
       }
       if (n == 1) {
           return new ArrayList<String>(Arrays.asList("0", "1", "8"));
       }
       List<String> result = helper(n - 2, m);
       List<String> temp = new ArrayList<>();
       for (String s : result) {
           if (n != m) {
               temp.add("0" + s + "0");
           }
           temp.add("1" + s + "1");
           temp.add("6" + s + "9");
           temp.add("8" + s + "8");
           temp.add("9" + s + "6");
       }
       return temp;

    }

    public List<String> findStrobogrammatic(int n) {
        return helper(n, n);
    }

    public static void main(String[] args) {
        StrobogrammaticNumberII sn = new StrobogrammaticNumberII();
        System.out.println(sn.findStrobogrammatic(4));
    }
}
