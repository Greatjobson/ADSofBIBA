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
        callFunc(arr,0,n);//calling func for result
    }
    /*function that call task function
     *It measures execution time for performance analysis.
     *@param same as task fucntion
     */
    public static void callFunc(int[]arr,int s,int n) {
        long startTime = System.nanoTime();
        reverseArr(arr,0, n);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds

        System.out.println();
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println("----------------------------------");
    }
    /*
     * This method recursively reverses and prints an array
     * Time complexity: O(n)
     * @param arr Array to be reversed
     * @param s Current index in recursion
     * @param n Length of the array
     */
    public static void reverseArr (int[] arr, int s,int n){
        System.out.print(arr[n - s-1] + " ");
        if(s == arr.length - 1){
            return;
        }
        else{
            reverseArr(arr,s+1,n);
        }
    }
}
