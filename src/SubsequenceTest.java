import java.util.HashSet;
import java.util.Set;

/**
 * Created by GelinZHU on 4/29/17.
 */
public class SubsequenceTest {
    public static void main(String[] args) {
        Set<String> result;

        String s = "abc";

        result = helper(s);

        System.out.println(result);
    }

    public static Set<String> helper(String s) {
        Set<String> result = new HashSet<>();
        if (s.length() == 0) {
            result.add("");
            return result;
        }

        Set<String> subset = helper(s.substring(1));
        result.addAll(subset);
        for (String str : subset) {
            result.add(s.charAt(0) + str);
        }
        return result;
    }

}
