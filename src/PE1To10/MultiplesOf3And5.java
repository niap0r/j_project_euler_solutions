package PE1To10;

import java.util.ArrayList;

public class MultiplesOf3And5 {
    // first problem of project euler

    byte multi1 = 3;
    byte multi2 = 5;
    int limit = 1000;

    public int sumOfMultiples() {
        ArrayList<Integer> multiples = new ArrayList<>();
        for (int i = 1; i < limit; i++) {
            if (i % multi1 == 0 || i % multi2 == 0) {
                multiples.add(i);
            }
        }
        return sumArrayList(multiples);
    }

    private int sumArrayList(ArrayList<Integer> multiples) {
        int sum = 0;
        for (int n : multiples) {
            sum += n;
        }
        return sum;
    }


}
