import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println();
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
       
       if(idx>=arr.length-1){
           return new int[fsf];              // return the array size of elements we found while searching in preorder and return Array for storing the elements .
       }
       else if(x==arr[idx]){                // if element found we increse the index and fsf(found so far) to declear array Size.
           int [] all = allIndices(arr, x, idx+1, fsf+1); // recursive call 
            all[fsf]=idx;                               // in post order as we return in base case an array we recived in all arry and stored matched elements in the array .
            return all; // returned the array.
       }
       else {
           int[] all = allIndices(arr, x, idx+1, fsf); // recursive call if element not matched and increasing index 
           return all; // returning the array.
       }
       
       
    }

}