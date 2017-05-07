import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 4/30/17.
 */
public class SubsetAgain {
    public static void main(String[] args) {
        String s = "abc";

        boolean[] visited = new boolean[s.length()];
        List<String> result = new ArrayList<>();

        helper(s, visited, result, "");
        System.out.println(result);
    }

    public static void helper(String s, boolean[] visited, List<String> result, String temp) {
        if (temp.length() > s.length()) {
            return;
        }

        result.add(temp);

        for (int i = 0; i < s.length(); i++) {
            if (visited[i] == false) {
                visited[i] = true;
                temp = temp + s.charAt(i);
                helper(s, visited, result, temp);
                visited[i] = false;
            }
        }


    }
}
