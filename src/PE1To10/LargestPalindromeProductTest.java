package PE1To10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LargestPalindromeProductTest {

    @Test
    void computeLargestPalindrome() {
        LargestPalindromeProduct palindromeProduct = new LargestPalindromeProduct();
        Assertions.assertEquals(906_609, palindromeProduct.computeLargestPalindrome());
    }

    @Test
    void isPalindromeOddTrue() {
        LargestPalindromeProduct palindromeProduct = new LargestPalindromeProduct();
        Assertions.assertTrue(palindromeProduct.isPalindrome(909));
    }

    @Test
    void isPalindromeEvenTrue() {
        LargestPalindromeProduct palindromeProduct = new LargestPalindromeProduct();
        Assertions.assertTrue(palindromeProduct.isPalindrome(9009));
    }

    @Test
    void isPalindromeOddFalse() {
        LargestPalindromeProduct palindromeProduct = new LargestPalindromeProduct();
        Assertions.assertFalse(palindromeProduct.isPalindrome(9772112));
    }


    @Test
    void isPalindromeEvenFalse() {
        LargestPalindromeProduct palindromeProduct = new LargestPalindromeProduct();
        Assertions.assertFalse(palindromeProduct.isPalindrome(923953));
    }
}