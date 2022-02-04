import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // scanner object for input 
        int n = sc.nextInt();                // inter n for input 
        int [] arr = new int[n];            // decleared array for storing elements
        for(int  i=0; i<n; i++){            // loop for taking elements one by one
            arr[i]= sc.nextInt();           // 
        }
        int x = sc.nextInt();               // x takin input for finding the element
        int res = lastIndex(arr, 0, x);     // function calling 
        System.out.println(res);            // printing the result.
        
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx>=arr.length-1){
            return -1;
        }
        int li = lastIndex(arr, idx+1, x); // recursive call for all element 
        if(li==-1){                       // condition 1 for if element not found then it will check for  condition 2
            
            if(x==arr[idx]){              // condition 2 for matching the element if element matched the it return the index.
                return idx;
            }
            else {
                return -1;                // it will return -1 for to check other elements 
            }
        }
        else {
            return li;                    // if condition 2 return index then simply we return index to controller function.
        }
        
      
    }

}