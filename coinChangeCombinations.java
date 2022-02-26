import java.io.*;
import java.util.*;

public class Main {
        /*
        1. You are given a number n, representing the count of coins.
        2. You are given n numbers, representing the denominations of n coins.
        3. You are given a number "amt".
        4. You are required to calculate and print the number of combinations of the n coins using which the 
           amount "amt" can be paid.

           Note1 -> You have an infinite supply of each coin denomination i.e. same coin denomination can be 
                  used for many installments in payment of "amt"
           Note2 -> You are required to find the count of combinations and not permutations i.e.
                  2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations of same 
                  combination. You should treat them as 1 and not 3.
        */



    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();                   
            int [] coins = new int[n];        // taking number of coins
            for(int i=0; i<n; i++){
                coins[i]=sc.nextInt();        // taking mutiple coins.
            }
            int amt = sc.nextInt();           // input for target amout to pay using Available coins in coins Array Data
            int[][] dp = new int[n+1][amt+1]; // dp Decleared for Storage of data.  

                dp[0][0]=1;                    //there is one possiblity for pay zero coins for zero amount.

            for(int i=1; i<dp.length; i++){
                for(int j=0; j<dp[0].length; j++){
                    if(j==0){
                        dp[i][j]=1;                // there is posiblity that zero amount can be paid one by giving nothing 
                    }
                    else if(j>=coins[i-1]){        // j is the payable amout should be greater or equal to the coins Availbale 
                        dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];    // perivous paid possiblity + current paid possiblity 
                    }
                    else {
                        dp[i][j]=dp[i-1][j];        // if j is smaller the coins we have then we see wheather perivous its paid or not the data stored
                    }
                }
            }
            System.out.println(dp[n][amt]); // the result will store last of the Array and Printed.
    }
}