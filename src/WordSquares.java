import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 4/13/17.
 */
public class WordSquares {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> result = new ArrayList<List<String>>();
        if (words.length == 0 || words == null) {
            return result;
        }

        List<String> l = new ArrayList<>();
        helper(words, 0, l, result);
        return result;
    }

    public void helper(String[] words, int i, List<String> l, List<List<String>> result) {
        if (l.size() == words[0].length()) {
            // check if it's valid
            if (isValid(l)) {
                List<String> temp = new ArrayList<>(l);
                result.add(temp);
            }
            return;
        }

        for (int j = i; j < words.length; j++) {
            l.add(words[j]);
            helper(words, j + 1, l, result);
            l.remove(l.size() - 1);
        }


    }

    public boolean isValid(List<String> l) {
        for (int i = 0; i < l.size(); i++) {
            String rowString = l.get(i);
            StringBuffer sb = new StringBuffer();
            for (int j = 0; j < rowString.length(); j++) {
                sb.append(l.get(j).charAt(i));
            }
            String colString = sb.toString();
            if (rowString.equals(colString)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String[] words = new String[] {"area","lead","wall","lady","ball"};
        WordSquares ws = new WordSquares();
        List<List<String>> result = ws.wordSquares(words);

        System.out.println(result);

    }
}
