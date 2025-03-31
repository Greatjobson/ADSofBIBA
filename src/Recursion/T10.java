package Recursion;

import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a-->");
        int a = sc.nextInt();
        System.out.println("b-->");
        int b = sc.nextInt();
        callFunc(a,b);//calling func for result
    }
    /*function that call task function
     *It measures execution time for performance analysis.
     *@param same as task fucntion
     */
    public static void callFunc(int a , int b) {
        long startTime = System.nanoTime();
        int result = gcd(a,b);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds

        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println("----------------------------------");
    }

    /*
     * This method calculates the Greatest Common Divisor (GCD) using recursion.
     * It follows the Euclidean algorithm:
     *   GCD(a, b) = GCD(b, a % b)
     *   Base case: GCD(a, 0) = a
     *
     * Time complexity: O(log(min(a, b)))
     * @param a The first number.
     * @param b The second number.
     * @return The greatest common divisor of a and b.
     */
    public static int gcd(int a , int b){ 
        if (b == 0) {
            return a;
        }
        return gcd(b,a%b);
    }
}
