package PE1To10;

public class LargestPalindromeProduct {
    // PE problem 4: Find the largest palindrome made from the product of two 3-digit numbers.

    short limit = 999;

    public int computeLargestPalindrome() {
        int largestPalindrome = 0;

        for (short i = 800; i <= limit; i++) {
            for (short j = 800; j <= limit; j++) {
                int result = i * j;

                if (isPalindrome(result)) {
                    largestPalindrome = result;
                }
            }
        }

        return largestPalindrome;
    }

    public boolean isPalindrome(int n) {
        String nString = Integer.toString(n);
        String leftSide;
        String rightSide = nString.substring(nString.length() / 2);

        if (nString.length() % 2 == 0) {
            leftSide = nString.substring(0, nString.length() / 2);
        } else {
            leftSide = nString.substring(0, (nString.length() / 2) + 1);
        }

        return leftSide.equals(new StringBuilder(rightSide).reverse().toString());
    }
}
