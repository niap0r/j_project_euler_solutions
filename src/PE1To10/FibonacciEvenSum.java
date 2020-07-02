package PE1To10;


public class FibonacciEvenSum {
    // second project euler problem:
    // By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

    int limitSum = 4_000_000;

    int computeFibonacciSum() {
        int sum = 0;
        int i = 0;

        while (true) {
            int fibNum = getNthFibonacciNumber(i);
            if (fibNum > limitSum) {
                break;
            }
            if (fibNum % 2 == 0) {
                sum += fibNum;
            }
            i++;
        }
        return sum;
    }

    int getNthFibonacciNumber(int n) {
        if (n < 0) {
            return 0;
        }
        return switch (n) {
            case 0 -> 0;
            case 1, 2 -> 1;
            case 3 -> 2;
            default -> getNthFibonacciNumber(n - 1) + getNthFibonacciNumber(n - 2);
        };
    }
}
