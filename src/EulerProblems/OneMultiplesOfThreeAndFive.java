package EulerProblems;

public class OneMultiplesOfThreeAndFive {

    public static int MultiplesOfThreeAndFive(int range) {
        /*Multiples of 3 or 5
        If we list all the natural numbers below $10$ that are multiples of $3$ or $5$, we get $3, 5, 6$ and $9$.
        The sum of these multiples is $23$.</p>
        Find the sum of all the multiples of $3$ or $5$ below $1000$.
         */
        int result = 0;
        for (int i = 0; i < range; i++) {
            result = (i % 3 == 0 || i % 5 == 0) ? result + i : result;
        }
        return result;
    }

}
