import static java.lang.StringBuffer.*;

/**
 * Created by GelinZHU on 3/15/17.
 */
public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        String rnum1 = new StringBuffer(num1).reverse().toString();
        String rnum2 = new StringBuffer(num2).reverse().toString();

        int[] d = new int[rnum1.length() + rnum2.length()];

        for (int i = 0; i < rnum1.length(); i++) {
            for (int j = 0; j < rnum2.length(); j++) {
                d[i + j] += (rnum1.charAt(i) - '0') * (rnum2.charAt(j) - '0');
            }
        }

        int carry = 0;
        int mod = 0;
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < d.length; i++) {
            mod = d[i] % 10;
            carry = d[i] / 10;
            if (i+1 < d.length) {
                d[i+1] += carry;
            }
            result.insert(0, mod);
        }

        // delete leading 0s but keep the first 0. Tackle corner case like: 5000 * 0 = 0
        while (result.charAt(0) == '0' && result.length() > 1) {
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}
