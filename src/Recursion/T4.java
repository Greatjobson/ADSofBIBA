package Recursion;

import java.util.Scanner;

public class T4 {// the program using recursion for finding “n!”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner
        System.out.println("n-->");
        int n = sc.nextInt();//input number --> n

        callFunc(n);
    }
    /*function that call task function
     *It measures execution time for performance analysis.
     *@param same as task fucntion
     */
    public static void callFunc(int n) {
        long startTime = System.nanoTime();
        int result = fac(n);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds

        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println("----------------------------------");
    }

    /*
     * This method calculates the factorial of a number recursively.
     * It multiplies n by the factorial of (n-1) until reaching the base case.
     *
     * Time complexity: O(n)
     * @param n The number to compute the factorial of
     * @return The factorial of n
     */
    public static int fac(int n){ //the func that return factorial of number
        if(n<=1){
            return 1;
        }
        return n*fac(n-1);
    }
}
