import PE1To10.LargestPrimeFactor;
import PE1To10.MultiplesOf3And5;

public class Program {
    public static void main(String[] args) {
        MultiplesOf3And5 multiplier = new MultiplesOf3And5();
        System.out.println(multiplier.sumOfMultiples());

        LargestPrimeFactor largePrime = new LargestPrimeFactor();

        int x = largePrime.computeLargestPrimeFactor();
        System.out.println(x);

    }
}
