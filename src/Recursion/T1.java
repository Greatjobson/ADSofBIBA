package Recursion;

import java.util.Scanner;

public class T1 { // function that returns minimum of them
    public static void main (String[] args){ //main
        Scanner sc = new Scanner(System.in);
        System.out.println("n-->");
        int n = sc.nextInt(); //choose number for array lenght

        int[] arr = new int[n]; // create array

        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt(); // filling in the array
        }


        System.out.println(minN(arr,0)); //calling func for result
    }

    public static int minN (int[] arr,int s){ // function for find minimum
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
