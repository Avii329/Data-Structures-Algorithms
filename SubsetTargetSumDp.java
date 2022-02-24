import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        /*
        1. You are given a number n, representing the count of elements.
        2. You are given n numbers.
        3. You are given a number "tar".
        4. You are required to calculate and print true or false, if there is a subset the elements of which add 
           up to "tar" or not.  
        */
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<arr.length; i++){    // taking data 
            arr[i]=sc.nextInt();
        }
        int tar = sc.nextInt();
        boolean[] [] dp = new boolean[n+1][tar+1];  // decleard 2d dp for n for all numbers and tar+1 for all possible targets
        dp[0][0]=true;
        for(int i=1; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(j==0){
                    dp[i][j]=true;                   // 1st col for zero can pay se we made true;
                }
                else if(dp[i-1][j]==true){           // 1st we check wheather target amoout was paid by any previous set if yes then we mark as true.
                    dp[i][j]=true;
                     }

                else {
                    if(j>=arr[i-1]){                    // if not then we check j is equal or larger number then data we have an array if yes then
                        if(dp[i-1][j-arr[i-1]]==true){  // we after deducting its money remaining money is paid by any other set if yes we mark as true 
                            dp[i][j]=true;
                        }
                        else {
                            dp[i][j]=false;                 // otherwise false 
                        }
                    }

                }
            }
        }
        System.out.println(dp[n][tar]);     // printing the result

    }
}