import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);// Scanner utility class object Created for input.
        int x = sc.nextInt(); // Decleared integer x(digit) and initialized input using scanner class object.
        int n = sc.nextInt();/*Decleared integer n(number of power to raise ) and initialized input using scanner class object.*/
        int res = power(x, n); //  called factorial function and result will store in res(Integer).
        System.out.println(res); // result printed 
    }

    public static int power(int x, int n){
        if(n==0){
            return 1; // base casre 1 as we know 2^0 is one.
        }
        else if(n==1){
            return x; // base case 2 as we know 2^1 is 2 
        }
        
        int pow = x*power(x,n-1); /*x is a digit for example x =2 and n is represented as power ex n=3 then 2^3  will be 8 */
        return pow; // after calculation we returned the value.
    }

}