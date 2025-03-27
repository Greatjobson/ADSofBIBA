package Recursion;

import java.util.Scanner;

import static java.lang.Math.abs;//include math for making positive number

public class T3 {//the function for checking whether“n” is prime.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // input number for checking --> n
        System.out.println(isp(n)); //calling func for results
    }
    public static String isp (int n){ //isp - is prime func that checking numbers for know its prime or not
        for (int i = 2; i <= abs(n)/2; i++) { //main idea of that instruction is find number between 2 and half of nummber for finding
            if (n % i == 0) {  // at least 1 numbers that can divide the original number  ,(n/2) because its not need to check numbers higher than half f number
                return "Composite"; //{2 .... , n/2}
            }
        }
        return "Prime"; //return prime if their no at least 1 number can divide the original number
    }

}
