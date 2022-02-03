import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in); // creat scanner object.
        int x = sc.nextInt();                 // x taking input
        int n = sc.nextInt();                 // n taking input
        int res = power(x,n);                 // power function calling
        System.out.println(res);              // printing result.
    }

    public static int power(int x, int n){
        if(n==0){
            return 1; // base case 2^0 == 1 we return 1.
        }
        
        int xpm =power(x, n/2); // recursive call n is diveded by to for less calls
        int mul = xpm*xpm;     // x power multiply after reaching base care it returned 1;
        if(n%2!=0){            // condition for is n is odd then we have to multiply with extra x;
            mul=mul*x;
        }
        
        return mul;           //  we returnd multiplied number.
    }

}