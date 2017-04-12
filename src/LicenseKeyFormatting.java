/**
 * Created by GelinZHU on 4/11/17.
 */
public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String S, int K) {
        if (S.length() <= 0 || S == null) {
            return S.toUpperCase();
        }

        StringBuffer sb = new StringBuffer();
        int count = 0;
        // starting from end of S to do work
        for (int i = S.length() - 1; i >=0 ; i--) {
            if (S.charAt(i) == '-') {
                continue;
            }
            sb.append(S.charAt(i));
            count++;
            if (count % K == 0) {
                sb.append("-");
            }
        }

        if (sb.length() >= 1 && sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.reverse().toString().toUpperCase();
    }

    public static void main(String[] args) {
        String S = "---";
        LicenseKeyFormatting lf = new LicenseKeyFormatting();
        System.out.println(lf.licenseKeyFormatting(S, 3));
    }
}
