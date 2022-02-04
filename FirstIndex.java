import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
       Scanner sc = new Scanner(System.in); // Scanner object for input 
       int n = sc.nextInt();                // integer n for input using scanner object
       int [] arr = new int[n];             // array decleard for elements 
       for(int i=0; i<n; i++){              // loop for storing one by one element 
           arr[i]=sc.nextInt();             // taking input 
       }
       int x = sc.nextInt();                // taking input x for the element to find 
       int res = firstIndex(arr, 0, x);     // function calling 
       System.out.println(res);             // printing the result
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx>=arr.length-1){              // if index reach to its array limit and returns -1. if element not found it will return -1.
            return -1;
        }
        else if(x==arr[idx]){                 // preorder searching if element fond then it will return the index
            return idx;
        }
        
        int fi = firstIndex(arr, idx+1, x);   // recursive call for all element and reciving int fi element 
        return fi;
    }

}