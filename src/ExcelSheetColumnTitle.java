import java.util.HashMap;

/**
 * Created by GelinZHU on 3/16/17.
 */
public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }

        StringBuffer sb = new StringBuffer();

        while (n > 0) {
            n--;
            sb.append((char)('A' + n % 26));
            n /= 26;
        }

        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        ExcelSheetColumnTitle es = new ExcelSheetColumnTitle();
        System.out.println(es.convertToTitle(26));
    }
}
