package Recursion;

import java.util.Scanner;

public class T2 { //function that returns average of array elements
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in); //scanner

        System.out.println("n-->");//input length of array
        int n = sc.nextInt(); //input number --> n

        int[] arr = new int[n];
        for(int i = 0;i< arr.length;i++){ // filling in the array
            arr[i] = sc.nextInt();
        }

        System.out.println(avg(arr,0,0)); //calling function for find average
    }
    public static float avg(int[] arr, int i, float sum) { // function that return average
        if (i == arr.length) {
            return sum / arr.length; //2)divide sum into array length in the end of recursion
        }
        return avg(arr, i + 1, sum + arr[i]); //1)summing up all the elements
    }
}
