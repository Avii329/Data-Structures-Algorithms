import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        toh(n,t1,t2,t3);
        
    }
    /* in tower of honoi problem we simply printint the  instructions for moving multiple diskes to Tower A to B
    with the help of tower c, toh function we have achived with Recurcsion */

    public static void toh(int n, int A, int B, int C){
        
        if(n==0){
            return ; // base case as if there is no disks are remaining it we will return.
        }
        
        
        toh(n-1, A,C,B);                        //in 1st call we have move disk to A to c with help of B.
        System.out.println(n+"["+A+" -> "+B+"]"); // we moved A to B and printed.
        toh(n-1, C,B,A);                        // in 2nd call we have moved disk C to B with help of A 
    }                                           // if we draw the elular then we find all the disks have moved with out voilating any rule.
}