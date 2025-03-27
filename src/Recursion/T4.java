package Recursion;

import java.util.Scanner;

public class T4 {// the program using recursion for finding “n!”
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//scanner

        int n = sc.nextInt();//input number --> n

        System.out.println(fac(n));//calling func for result
    }
    public static int fac(int n){ //the func that return factorial of number
        if(n<=1){
            return 1; //rerturn 1 if
        }
        return n*fac(n-1);
    }
}
