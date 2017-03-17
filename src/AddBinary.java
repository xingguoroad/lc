import java.util.Arrays;

/**
 * Created by GelinZHU on 3/16/17.
 */
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        // Reverse both string
        String ra = new StringBuilder(a).reverse().toString();
        String rb = new StringBuilder(b).reverse().toString();

        int i = 0, j = 0;

        int carry = 0;

        while (i < ra.length() || j < rb.length()) {
            int fa = 0;
            int fb = 0;

            if (i < ra.length()) {
                fa = ra.charAt(i) - '0';
            }

            if (j < rb.length()) {
                fb = rb.charAt(j) - '0';
            }

            if (fa + fb + carry >= 2) {
                sb.insert(0, String.valueOf(fa + fb + carry - 2));
                carry = 1;
            } else {
                sb.insert(0, String.valueOf(fa + fb + carry));
                carry = 0;
            }
            i++;
            j++;
        }

        if (carry > 0) {
            sb.insert(0, 1);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AddBinary ab = new AddBinary();
        System.out.println(ab.addBinary("1010", "1011"));
    }
}
