package Recursion;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n-->");
        int n = sc.nextInt();
        callFunc(n);//calling func for result
    }
    public static void callFunc(int n) {
        long startTime = System.nanoTime();
        int result = fib(n);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds

        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println("----------------------------------");
    }

    public static int fib(int n){
        //F(0) = 0
        //F(1) = 1
        //F(n) = F(n-1) + F(n-2) для n ≥ 2
        if (n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2); //n = 3
        //fib(2) + fib(1)      fib(1) = 1
        // fib(2) = fib(1) + fib(0)     fib(0) = 0
        // fib(2) = 1 + 0 = 1
        // fib(2) + fib(1) = 1+1 = 2

    }
}
