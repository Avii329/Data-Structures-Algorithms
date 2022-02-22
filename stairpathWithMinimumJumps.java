import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();              // n taking as Input 
        int data[] = new int[n];            // data for number of jumps allowed at Stairs
        for(int i=0; i<data.length; i++){
            data[i]=sc.nextInt();           // taking data of jumps allowed 
        }
        Integer [] dp = new Integer[n+1];   // Integer Array decleard
        dp[n]=0;                            // if we want to reach destination 10 and if we stand at 10 then we have 0 jumps to reach soo we assined 0 for destinaton 10 
        
        for(int i=dp.length-2; i>=0; i--){                // Traveling for all possible destinations
            int min = Integer.MAX_VALUE;                  // min moves saving
            for(int j =1; j<=data[i]; j++){              // using jump data jumping to destination one by one with allowed number of jumps
                if(i+j<dp.length && dp[i+j]!=null){      // checking is it going out of boundry and or its dont have any paths
                    min = Math.min(min,dp[i+j]);         // checking done then we calculating min jumps 
                    dp[i]=min+1;                         // then in min jump adding self jump.
                }
            }
        }

        System.out.println(dp[0]);          // printng the result 
    }

}