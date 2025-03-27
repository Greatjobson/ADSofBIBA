package Recursion;

import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n-->");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        rvarr(arr,0, n);//calling func for result
    }
    public static void rvarr (int[] arr, int s,int n){
        System.out.print(arr[n - s-1] + " ");
        if(s == arr.length - 1){
            return;
        }
        else{
            rvarr(arr,s+1,n);
        }
    }
}
