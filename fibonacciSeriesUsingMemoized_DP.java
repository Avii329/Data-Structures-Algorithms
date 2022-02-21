import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in); // taking input.
    int n = sc.nextInt();                // n as input
    int fi = fibo(n, new int[n+1]);      // storing the result
    System.out.println(fi);              // printing result
 }

 public static int fibo(int n, int[] res){      // dp By memoized technique

        if(n==0 || n==1){                       // base case if n is 0 or 1 it will return
            return n;
        }

        if(res[n]>0){                           /* res array for stroing the the pervious result 
                                                if same question comes then if answer is availble in res then 
                                                it will directly return the result it wont call recursion 
                                                function again and again for same problem */
            return res[n];
        }

     int fb1=fibo(n-1,res);                     // recursive call for n-1 
     int fb2=fibo(n-2,res);                     // recursive call for n-2
     int r = fb1+fb2;                           // adding returned values
     res[n]=r;                                  // stroing the the result in res
     return r;                                  // return the result.
 }

}