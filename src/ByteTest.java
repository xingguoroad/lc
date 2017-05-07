/**
 * Created by GelinZHU on 4/30/17.
 */
public class ByteTest {
    public static void main(String[] args) {
        int num = 0xc080;
        int num1 = num & 0xff00;

        if (num1 >>> 13 == 0b110) {
            System.out.println("correct");
        }

        System.out.println(Integer.toBinaryString(num));
    }
}
