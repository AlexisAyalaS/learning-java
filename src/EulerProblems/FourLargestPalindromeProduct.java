package EulerProblems;

public class FourLargestPalindromeProduct extends Utils {
    public static String LargestPalindromeProduct(int digits) {
        /*
        A palindromic number reads the same both ways. The largest palindrome made from the product of two $2$-digit numbers is $9009 = 91 \times 99$.
        Find the largest palindrome made from the product of two $3$-digit numbers
         */
        int lastPalindrome = 0;
        String zeros = "";
        int min = 1;
        int max;
        for (int i = 0; i < digits; i++) {
            zeros = zeros + 0;
        }

        String decimal = "1" + zeros;
        decimal = decimal.substring(0, decimal.length() - 1);
        min = min * (Integer.parseInt(decimal));
        max = (min * 10);

        int multiplicandValue = 0;
        int multiplierValue = 0;
        for (int multiplicand = min; multiplicand < max; multiplicand++) {
            for (int multiplier = min; multiplier < max; multiplier++) {
                if (isPalindrome(multiplicand * multiplier)) {
                    if ((multiplicand * multiplier) > lastPalindrome) {
                        lastPalindrome = multiplicand * multiplier;
                        multiplicandValue = multiplicand;
                        multiplierValue = multiplier;
                    }
                }
            }
        }
        return String.valueOf(multiplicandValue) + "x" + String.valueOf(multiplierValue) + "=" + lastPalindrome;
    }
}

