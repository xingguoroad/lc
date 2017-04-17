import java.util.ArrayList;
import java.util.List;

/**
 * Created by GelinZHU on 4/16/17.
 */
public class BinaryWatch {
    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        if (num == 0) {
          result.add("0:00");
          return result;
        }

        for (int i = 0; i <= 11; i++) {
            for (int j = 0; j <=59; j++) {
                if (numOfOnes(i) + numOfOnes(j) == num) {
                    String s = String.valueOf(i);
                    if (j < 10) {
                        s = s + ":0" + String.valueOf(j);
                    } else {
                        s = s + ":" + String.valueOf(j);
                    }
                    result.add(s);
                }
            }
        }

        return result;

    }

    int numOfOnes(int x) {
        int count = 0;
        while (x > 0) {
            if ((x & 0x1) == 1) {
                count++;
            }
            x = x >>> 1;
        }
        return count;
    }
}
