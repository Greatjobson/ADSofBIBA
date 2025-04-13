package Recursion;

import java.util.Scanner;

import static java.lang.Math.abs;//include math for making positive number

public class T3 {//the function for checking whether“n” is prime.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n-->");
        int n = sc.nextInt(); // input number for checking --> n
        callFunc(n); //calling func for results
    }
    /*function that call task function
     *It measures execution time for performance analysis.
     *@param same as task fucntion
     */
    public static void callFunc(int n) {
        long startTime = System.nanoTime();
        String result = isp(n,0);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds

        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println("----------------------------------");
    }
    /*
     * This method checks whether a number is prime or composite.
     * It uses an iterative approach checking divisors up to n/2.
     *
     * Time complexity: 0(n)
     * @param n The number to check for primality
     * @return "Prime" if prime, "Composite" otherwise
     */

    public static String isp (int n,int s){ //isp - is prime func that checking numbers for know its prime or not
//        for (int i = 2; i <= abs(n)/2; i++) {
//            if (n % i == 0) {
//                return "Composite"; //{2 .... , n/2}
//            }
//        }
//        return "Prime"; //return prime if their no at least 1 number can divide the original number
        if(s == n/2+1){
            return "Prime";
        }
        if(n%s == 0){
            return "Composite";
        }
        else{
            return isp(n,s+1);
        }
    }
}
