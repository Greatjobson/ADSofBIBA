package Recursion;

import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n-->");
        int n = sc.nextInt();
        System.out.println("k-->");
        int k = sc.nextInt();
        callFunc(n,k);
    }
    /*function that call task function
     *It measures execution time for performance analysis.
     *@param same as task fucntion
     */
    public static void callFunc(int n , int k) {
        long startTime = System.nanoTime();
        int result = calcBin(n,k);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds

        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println("----------------------------------");
    }
    /*
     * This method recursively calculates the binomial coefficient C(n, k).
     * It follows the formula:
     *   C(n, k) = C(n-1, k-1) + C(n-1, k)
     *   Base cases: C(n, 0) = 1 and C(n, n) = 1
     *
     * Time complexity: O(2^n) due to repeated recursive calls.
     * @param n The total number of elements.
     * @param k The number of elements to choose.
     * @return The binomial coefficient C(n, k).
     */
    public static int calcBin(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return calcBin(n - 1, k - 1) + calcBin(n - 1, k);
    }
}
