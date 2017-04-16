/**
 * Created by GelinZHU on 4/16/17.
 */
public class UTF8Validation {
    public boolean validUtf8(int[] data) {
        if (data == null || data.length == 0) {
            return false;
        }

        int cnt = 0;
        for (int d : data) {
            if (cnt == 0) {
                if ((d >>> 5) == 0b110) {
                    cnt = 1;
                }
                else if ((d >>> 4) == 0b1110) {
                    cnt = 2;
                } else if ((d >>> 3) == 0b11110) {
                    cnt = 3;
                } else if ((d >>> 7) != 0b0) {
                    return false;
                }
            } else {
                if (d >>> 6 == 0b10) {
                    cnt--;
                } else {
                    return false;
                }
            }
        }

        return cnt == 0;
    }
}
