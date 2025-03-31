package Recursion;

import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("s-->");
        String s = sc.next();
        callFunc(s,0);//calling func for result
    }
    /*
     * Calls the recursive function to check if the string contains only digits.
     * It measures execution time for performance analysis.
     *
     * Time complexity: O(n)
     * @param s The input string to check.
     * @param n The current index in recursion.
     */
    public static void callFunc(String s , int n) {
        long startTime = System.nanoTime();
        String result = isAllDigit(s,n);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds

        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println("----------------------------------");
    }

    /*
     * This method recursively checks if all characters in a string are digits.
     * It examines one character at a time and moves to the next index.
     *
     * Time complexity: O(n)
     * @param s The input string to check.
     * @param n The current index in recursion.
     * @return "YES" if all characters are digits, otherwise "NO".
     */
    public static String isAllDigit (String s , int n){
        if ( n >= s.length()) {
            return "YES";
        }
        if(Character.isDigit(s.charAt(n))){
            return isAllDigit(s, n + 1);
        }
        else{
            return "NO";
        }
    }

}
