package Recursion;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a^n");
        System.out.println("a-->");
        int a = sc.nextInt();
        System.out.println("n-->");
        int n = sc.nextInt();
        callFunc(a,n);//calling func for result
    }
    /*function that call task function
     *It measures execution time for performance analysis.
     *@param same as task fucntion
     */
    public static void callFunc(int a,int n) {
        long startTime = System.nanoTime();
        int result = asn(n,a);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds

        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println("----------------------------------");
    }
    /*
     * This program calculates the power of a number using recursion.
     * It computes a^n (a raised to the power of n).
     * The recursive approach multiplies 'a' by itself 'n' times.
     *
     * Time complexity: O(n) due to n recursive calls.
     * @param a The base number.
     * @param n The
     */
    public static int asn(int a,int n){  //asn - a^n
        if(n<=0){
            return 1;
        }
        return a*asn(a,n-1);
    }
}
