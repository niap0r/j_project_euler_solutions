package PE1To10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class LargestPrimeFactorTest {

    @Test
    void sieveOfEratosthenes() {
        LargestPrimeFactor largePrime = new LargestPrimeFactor();
        ArrayList<Integer> primes = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19));
        Assertions.assertEquals(primes, largePrime.sieveOfEratosthenes(20));
    }

    @Test
    void computeLargestPrimeFactor() {
        LargestPrimeFactor largePrime = new LargestPrimeFactor();
        Assertions.assertEquals(6857, largePrime.computeLargestPrimeFactor());
    }
}