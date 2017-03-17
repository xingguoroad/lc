/**
 * Created by GelinZHU on 3/16/17.
 */
public class PrimeNumbers {
    public int countPrimes(int n) {
        if (n < 2) {
            return 0;
        }
        boolean[] primes = new boolean[n];
        for (int i = 2; i < n; i++) {
            primes[i] = true;
        }

        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                for (int j = i + i; j < n; j += i) {
                    primes[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (primes[i]) {
                count++;
            }
        }
        return count;


    }
}
