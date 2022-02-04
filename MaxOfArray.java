import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();      // taking n input.
        int [] arr = new int[n];  // decleard an array for storing n elements
        for(int i =0; i<n; i++){  // loop for storing one by one element in an Array
            arr[i]=sc.nextInt();  // taking input from user 
        }
        int res = maxOfArray(arr, 0);
        System.out.println(res);
    }

    public static int maxOfArray(int[] arr, int idx){
        int max = Integer.MIN_VALUE;                 // integer for store max value we have infinite smaller value.
        if(idx>=arr.length-1){
            return arr[idx];                        // base case if index reach to array lenth then it will return its last element in array. 
        }
        
        int imax = maxOfArray(arr, idx+1);         // recursion call to compre returned elements from index+1.
        max = Math.max(arr[idx],imax);             // comparing all elemetns and storing max to max integer.
        return max;                               // returning the max value.
    }

}