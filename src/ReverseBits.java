/**
 * Created by GelinZHU on 4/7/17.
 */
public class ReverseBits {
    public int reverseBits(int n) {
         int result = 0;

         for (int i = 0; i < 32; i++) {
             if ((n & 1) != 0) {
                 result = (result << 1) + 1;
             } else {
                 result = result << 1;
             }
             n = n >>> 1;
         }

         return result;

    }
}
