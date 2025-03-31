package Recursion;

import java.util.Scanner;

public class T1 { // function that returns minimum of them
    public static void main (String[] args){ //main
        Scanner sc = new Scanner(System.in);
        System.out.println("n-->");
        int n = sc.nextInt(); //choose number for array lenght

        int[] arr = new int[n]; // create array
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        callFunc(n,arr); //calling func for result
    }

    public static void callFunc(int n,int[]arr) {
        long startTime = System.nanoTime();
        int result = minN(arr,0);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds

        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println("----------------------------------");
    }

    /*
    *This method calculates the minimum for a given array.
    *It uses a recursive approach.
    *The recursive algorithm iterates through all numbers in array
    *
    *Time complexity: 0(n)
    *@param arr Array to search for
    *@param s Current index (start from 0)
    *@return Minimum from the array.
    */
    public static int minN (int[] arr,int s){
        if(arr.length - 1 == s){
            return arr[s]; //base condition
        }
        if (arr[s] < minN(arr,s+1)){
            return arr[s];       //find the minimum
        }
        else {
            return arr[s+1];
        }
    }
}
