package Recursion;

import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a-->");
        int a = sc.nextInt();
        System.out.println("b-->");
        int b = sc.nextInt();
        System.out.println(gcd(a,b));//calling func for result
    }
    public static int gcd(int a , int b){ //a = 270//b = 192
        if (b == 0) {
            return a;
        }
        return gcd(b,a%b);
    }
}
