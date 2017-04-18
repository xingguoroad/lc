import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 4/17/17.
 */
public class GeneralizedAbbreviation {
    public List<String> generateAbbreviations(String word) {
        List<String> result = new ArrayList<>();
        if (word.length() == 0 || word == null) {
            return result;
        }
        result.add(word);

        helper(word, result, 0);
        return result;

    }

    public void helper(String word, List<String> result, int start) {
        if (start >= word.length()) {
           return;
        }

        for (int i = start; i < word.length(); i++) {
            for (int j = 1; i + j <= word.length(); j++) {
                String num = Integer.toString(j);
                String s = word.substring(0, i) + num + word.substring(i + j);
                result.add(s);
                helper(s, result, i + 1 + num.length());
            }
        }
    }

    public static void main(String[] args) {
        GeneralizedAbbreviation ga = new GeneralizedAbbreviation();
        System.out.println(ga.generateAbbreviations("word"));
    }
}
