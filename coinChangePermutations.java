import java.io.*;
import java.util.*;

public class Main {


    /*
    1. You are given a number n, representing the count of coins.
    2. You are given n numbers, representing the denominations of n coins.
    3. You are given a number "amt".
    4. You are required to calculate and print the number of permutations of the n coins using which the 
       amount "amt" can be paid.

       Note1 -> You have an infinite supply of each coin denomination i.e. same coin denomination can be 
                  used for many installments in payment of "amt"
       Note2 -> You are required to find the count of permutations and not combinations i.e.
                  2 + 2 + 3 = 7 and 2 + 3 + 2 = 7 and 3 + 2 + 2 = 7 are different permutations of same 
                  combination. You should treat them as 3 and not 1.
    */

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();               // number of coins
        int[] coins = new int[n];           
        for(int i=0; i<coins.length; i++){  // taking input for coins data
            coins[i]=sc.nextInt();
        }
        int amt = sc.nextInt();
        int [] dp = new int [amt+1];        // storing number of ways to pay amount in permutation.
        dp[0]=1;                            // to pay zero amount we have 1 Way that stored 
        for(int j=1; j<dp.length; j++){     
            for(int i=0; i<n; i++){
                if(j>=coins[i]){                // j is amount j should be greater and equal to coin that availbe to pay 
                    dp[j]=dp[j]+dp[j-coins[i]]; //  if yes then we add pervously paid availble data to current one
                }
            }
        }
        System.out.println(dp[amt]);    // printing the result
    }
}