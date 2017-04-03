/**
 * Created by GelinZHU on 4/2/17.
 */
public class LengthofLastWord {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        s = s.trim();
        int i = s.length() - 1;
        while ( i >= 0 && s.charAt(i) != ' ') {
            i--;
        }



        return s.length() - i - 1;
    }
}
