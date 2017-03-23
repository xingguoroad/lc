package easy;

/**
 * Created by GelinZHU on 3/19/17.
 */
public class LongestIncreasingSubsequence {
    public int longestSequencye(int[] a) {
        int[] d = new int[a.length];   // dynamic result
        int len = 1;

        d[0] = 0;
        d[1] = 1;

        for (int i = 0; i < a.length; i++) {
           for (int j = 0; j < i; j++) {
               if (a[j] <= a[i] && d[j] + 1 > d[i]) {
                   d[i] = d[j] + 1;
               }
           }
           if (d[i] > len) {
               len = d[i];
           }
        }


        return len;
    }

    public static void main(String[] args) {
        int[] a = new int[] {10, 22, 9, 33, 21, 50, 41, 60, 80        };
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        System.out.println(lis.longestSequencye(a));
    }

}
