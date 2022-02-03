import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // Scanner utility class object Created for input.
        int n = sc.nextInt(); // Decleared integer n and initialized input using scanner class object.
        int res = factorial(n); //  called factorial function and result will store in res(Integer).
        System.out.println(res);
    }

    public static int factorial(int n){
        
        if(n==1){      // base case if n decreases to one it will return 1;
            return 1; 
        }
        
        int fact = n*factorial(n-1);    /* recursion call, factorial(n-1) call everytime it dcrease the n value by 
                                          1 and multiply with n if n=3 then 1st call will be 3*2, 2nd  
                                          1 factorial is one that has covered in base case this function will run
                                          untill base conditon will meet. */
        
     return fact;  // returning the result.
}
}