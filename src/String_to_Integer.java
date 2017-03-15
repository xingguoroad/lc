/**
 * Created by GelinZHU on 3/14/17.
 */
public class String_to_Integer {
    public int myAtoi(String str) {
        double result = 0;

        str = str.trim();

        if (str.length() == 0 || str == null) {
            return 0;
        }


        int sign = 1;
        int j = 0;
        if (str.charAt(0) == '-') {
            sign = -1;
            j++;
        } else if (str.charAt(0) == '+') {
            j++;
        }


        for (int i = j; i < str.length(); i++) {
            if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
                char c = str.charAt(i);
                result = result * 10 + c - '0';
            } else {
                break;
            }
        }

        result = sign * result;
        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }


        return (int) result;


    }

    public static void main(String[] args) {
        String s = "9223372036854775809";
        String_to_Integer si = new String_to_Integer();
        System.out.println(si.myAtoi(s));
    }
}
