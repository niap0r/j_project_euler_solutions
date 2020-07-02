package PE1To10;

import org.junit.jupiter.api.Assertions;

class FibonacciEvenSumTest {

    @org.junit.jupiter.api.Test
    void computeFibonacciSum() {
        FibonacciEvenSum fiboSum = new FibonacciEvenSum();
        Assertions.assertEquals(4_613_732, fiboSum.computeFibonacciSum());
    }

    @org.junit.jupiter.api.Test
    void getNthFibonacciNumber() {
        FibonacciEvenSum fiboSum = new FibonacciEvenSum();
        Assertions.assertEquals(89, fiboSum.getNthFibonacciNumber(10));
    }
}