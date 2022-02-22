import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  
        int n =sc.nextInt();                // n taking as input
        int[] dp = new int[n+1];            // decleared Array for stroing number of paths to reach destination
        dp[0]=1;                            // suppose we want to reach zero and we stand at zero there is one path to go 0 to 0 therefor we put 1 path to reach 0.
        for(int i=1; i<dp.length; i++){     // loop for each destination

            if(i==1){                       // if i is one then we can only go 1 step back.
                dp[i]+=dp[i-1];
            }
            else if(i==2){                  // i is 2 then we can only go 2 stairs back.
                dp[i]=dp[i-1]+dp[i-2];
            }
            else {
                dp[i]=dp[i-1]+dp[i-2]+dp[i-3];  // and rest of the stairs path storing
            }
        }
        System.out.println(dp[n]);              // n is the destination so it stored at dp of n the result has printed
    }

}