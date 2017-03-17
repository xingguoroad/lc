/**
 * Created by GelinZHU on 3/16/17.
 */
public class ExcelColumnNumber {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }
}
