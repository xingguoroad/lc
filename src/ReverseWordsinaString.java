import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 3/30/17.
 */
public class ReverseWordsinaString {
    public String reverseWords(String s) {
        List<String> words = new ArrayList<>();
        int i = 0;
        s = s.trim();
        while (i < s.length()) {
            while (i < s.length() && s.charAt(i) == ' ') {
                i++;
            }
            // i is point to something meaningful
            int j = i;
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            words.add(s.substring(i, j));
            i = j;
        }
        StringBuffer sb = new StringBuffer();
        for (int k = words.size() - 1; k >= 0; k--) {
            sb.append(words.get(k));
            if (k != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWordsinaString rw = new ReverseWordsinaString();
        System.out.println(rw.reverseWords("l "));
    }


}
