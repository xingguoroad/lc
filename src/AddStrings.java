/**
 * Created by GelinZHU on 3/17/17.
 */
public class AddStrings {
    public String addStrings(String num1, String num2) {
        StringBuffer sb = new StringBuffer();
        String rnum1 = new StringBuffer(num1).reverse().toString();
        String rnum2 = new StringBuffer(num2).reverse().toString();

        int i = 0, j = 0;
        int carry = 0;
        while (i < rnum1.length() || j < rnum2.length()) {
            int d1 = 0, d2 = 0;
            if (i < rnum1.length()) {
                d1 = rnum1.charAt(i) - '0';
            }
            if (j < rnum2.length()) {
                d2 = rnum2.charAt(j) - '0';
            }
            int sum = d1 + d2 + carry;
            if (sum >= 10) {
                carry = 1;
                sum = sum % 10;
                sb.append(sum);
            } else {
                sb.append(sum);
                carry = 0;
            }
            i++;
            j++;
        }
        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        AddStrings as = new AddStrings();
        System.out.println(as.addStrings("1", "99"));
    }
}
