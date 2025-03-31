package Recursion;

import java.util.Scanner;

public class T2 { //function that returns average of array elements
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); //scanner

        System.out.println("n-->");//input length of array
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0;i< arr.length;i++){ // filling in the array
            arr[i] = sc.nextInt();
        }

        callFunc(arr,0,0); //calling function for find average
    }

    public static void callFunc(int[] arr, int i, float sum) {
        long startTime = System.nanoTime();
        float result = avg(arr,0,0);
        long endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds

        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");
        System.out.println("----------------------------------");
    }

    /*function that return average of array elements
     *1)summing up all the elements
     *2)divide sum into array length in the end of recursion
     *
     *It uses a recursive approach.
     *Time complexity: 0(n)
     *@param arr Array to search for
     *@param sum Current sum of all elements of array (start from 0)
     *@param i is the current index of the array (start from 0)
     *@return Average of array elements
    */
    public static float avg(int[] arr, int i, float sum) { //
        if (i == arr.length) {
            return sum / arr.length; //2)
        }
        return avg(arr, i + 1, sum + arr[i]); //1)
    }
}
