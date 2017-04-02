/**
 * Created by GelinZHU on 3/26/17.
 */
public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        if (haystack == null || haystack.length() == 0) {
            return -1;
        }

        if (needle == null || needle.length() == 0) {
            return -1;
        }

        int index = 0;
        while (index <= haystack.length() - needle.length()) {
            int i = index;
            int j = 0;
            while (i < haystack.length() && j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            }
            if (j == needle.length()) {
                return index;
            } else {
                index++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        ImplementstrStr is = new ImplementstrStr();
        System.out.println(is.strStr("hello,world", "world"));
    }
}
