import java.util.Arrays;

/**
 * Created by GelinZHU on 4/16/17.
 */
public class HIndex {
    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }

        Arrays.sort(citations);
        int h = 0;
        for (int i = 0; i < citations.length; i++) {
            int t = Math.min(citations[i], citations.length - i);
            if (t > h) {
                h = t;
            }
        }

        return h;

    }
}
