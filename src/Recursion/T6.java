package Recursion;

import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(asn(n,a));//calling func for result
    }
    public static int asn(int n,int a){  //asn - a^n
        if(n<=0){
            return 1;
        }
        return a*asn(n-1,a);
    }
}
