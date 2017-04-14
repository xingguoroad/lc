/**
 * Created by GelinZHU on 4/14/17.
 */
public class TestMinMaxInteger {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;
        long i = (long)a - 1;
        a = Integer.MAX_VALUE;
        long j = (long)a + 1;

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(i);
        System.out.println(j);
    }
}
