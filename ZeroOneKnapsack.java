import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			int [] val = new int[n];  // value Array
			int [] wt = new int[n];		// every value carry some weight to store we use Array
			for(int i=0; i<n; i++){
				wt[i]=sc.nextInt();		// taking weight Data 
			}
			for(int i=0; i<n; i++){
				val[i]=sc.nextInt();	// taking values data 
			}

			int cap = sc.nextInt();		// cappacity of the bag
			int[][] dp = new int[n+1][cap+1];	// storing 0 to cap weight can carry data of dp
        
        for(int i=1; i<dp.length;i++){
            for(int j=1; j<dp[0].length; j++){
                if(j>=val[i-1]){                // j is a capacity of the bag 
                    int pwt = dp[i-1][j];       // pervious wt.
                    int cwt = wt[i-1]+dp[i-1][j-val[i-1]];      // current weight + remaining weight after 
                    dp[i][j]=Math.max(pwt,cwt);             // comaparing most weight saved at dp
                }   
                else {
                    dp[i][j]=dp[i-1][j];            // if cap is less then val the pervious wt copied
                }
            }
        }
        System.out.println(dp[n][cap]);             // printing the result.
    }   
}