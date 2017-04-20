/**
 * Created by GelinZHU on 4/19/17.
 */
public class NthDigit {
    /**
     * 这里是找第n个数字(这里的数和数字有区别，数字可以理解为将所有数拼合成一个字符串后的第n为对应的数字（0-9)）
     * 这里首先分析一下位数和规律
     * 个位数：1-9，一共9个,共计9个数字
     * 2位数：10-99,一共90个，共计180个数字
     * 3位数：100-999，一共900个，共计270个数字
     * 4位数，1000-9999，一共9000个，共计36000个数字
     * 以此类推，
     * 这样我们就可以首先定位到是哪个数，再找到其对应的数字
     * */
    public int findNthDigit(int n) {
       int count = 9; int len = 1; int start = 1;
       while (n > len * count) {
           n -= len * count;
           len++;
           start *= 10;
           count *= 10;
       }
       start += (n - 1) / len;
       String t = String.valueOf(start);
       return t.charAt((n - 1) % len) - '0';
    }

    public static void main(String[] args) {
        NthDigit nd = new NthDigit();
        System.out.println(nd.findNthDigit(1234));
    }
}
