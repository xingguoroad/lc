import java.util.ArrayList;

/**
 * Created by GelinZHU on 4/16/17.
 */
public class ReverseVowelsofaString {
    public String reverseVowels(String s) {
        if (s.length() == 0 || s == null) {
            return s;
        }

        ArrayList<Character> a = new ArrayList<>();
        a.add('a');
        a.add('e');
        a.add('i');
        a.add('o');
        a.add('u');
        a.add('A');
        a.add('E');
        a.add('I');
        a.add('O');
        a.add('U');


        int i = 0;
        int j = s.length() - 1;

        char[] b = new char[s.length()];

        while (i <= j) {
            if (!a.contains(s.charAt(i))) {
                b[i] = s.charAt(i);
                i++;
            } else if (!a.contains(s.charAt(j))) {
                b[j] = s.charAt(j);
                j--;
            } else {
                b[i] = s.charAt(j);
                b[j] = s.charAt(i);
                i++;
                j--;
            }
        }
        return String.valueOf(b);
    }

    public static void main(String[] args) {
        ReverseVowelsofaString rv = new ReverseVowelsofaString();
        System.out.println(rv.reverseVowels("aA"));
    }
}
