package Recursion;

import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fib(n));//calling func for result
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
