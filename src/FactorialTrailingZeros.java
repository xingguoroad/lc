/**
 * Created by GelinZHU on 3/16/17.
 */
public class FactorialTrailingZeros {
    public int trailingZeroes(int n) {
        // 技巧在于，每5个数会产生一个0。为什么呢？试想1*2*3*4*5*6*7*8*9*10*11，前5个数中有一个2一个5，相乘有一个0，后5个数中有一个10，又有一个0。以此类推，每5个数会有一个0。
        int sum = 0;
        while (n > 0) {
            sum += n / 5;
            n /=5;
        }
        return sum;

    }
}
