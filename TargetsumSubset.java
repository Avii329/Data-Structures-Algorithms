import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int tar = sc.nextInt();
        int[] visited = new int[n];
        printTargetSumSubsets(arr, 0, "", 0, tar );

    }
        // target sum subset problem 
    // set is the subset
    // sos is sum of subset
    // tar is target
    public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) {

            if(idx==arr.length){
                if(sos==tar){                    // if sos equal to tar then it print string.
                    System.out.println(set+".");
                }
                return;
            }




                printTargetSumSubsets(arr, idx+1, set+arr[idx]+", ",sos+arr[idx],tar);  // if element included
                printTargetSumSubsets(arr, idx+1, set, sos, tar);                       // if element is not included
    }

}