package PE1To10;

import java.util.ArrayList;

public class LargestPrimeFactor {

    public ArrayList<Integer> sieveOfEratosthenes(int n) {
        // generates all primes numbers up to n
        boolean[] candidates = new boolean[n + 1];
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 0; i < n; i++)
            candidates[i] = true;

        for (int p = 2; p * p <= n; p++) {
            // update all multiples of p, because all of them are non prime
            for (int i = p * 2; i <= n; i += p)
                candidates[i] = false;
        }

        for (int i = 2; i <= n; i++) {
            // when index is true, value is prime
            if (candidates[i]) {
                primes.add(i);
            }
        }

        return primes;
    }


    public int computeLargestPrimeFactor() {
        long l = 600_851_475_143L;
        int limit = (int) Math.sqrt(l);

        ArrayList<Integer> primesToLimit = sieveOfEratosthenes(limit);

        int biggestPrime = 0;
        for (int n : primesToLimit) {
            if (l % n == 0) {
                biggestPrime = n;
            }
        }

        return biggestPrime;
    }

}
