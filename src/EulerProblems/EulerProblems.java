package EulerProblems;

public class EulerProblems {
    public static void main(String[] args) {
        System.out.println("------------------");
        System.out.println("EulerProblems");
        System.out.println("------------------");

        OneMultiplesOfThreeAndFive problemMultiplesOfThreeAndFive = new OneMultiplesOfThreeAndFive();
        System.out.println("Problem 1: " + problemMultiplesOfThreeAndFive.MultiplesOfThreeAndFive(10));

        FourLargestPalindromeProduct problemTwoLargestPalindromeProduct = new FourLargestPalindromeProduct();
        System.out.println("Problem 4: " + problemTwoLargestPalindromeProduct.LargestPalindromeProduct(2));

        System.out.println("--------- END ---------");

    }
}
