import java.io.*;
import java.util.*;

public class Main {

    /*
    1. You are given a number n, representing the number of rows.
    2. You are given a number m, representing the number of columns.
    3. You are given n*m numbers, representing elements of 2d array a, which represents a gold mine.
    4. You are standing in front of left wall and are supposed to dig to the right wall. You can start from 
       any row in the left wall.
    5. You are allowed to move 1 cell right-up (d1), 1 cell right (d2) or 1 cell right-down(d3).
    */

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] gold = new int[n][m];  // taking gold data for each cell.
        for(int i=0; i<gold.length; i++){
            for(int j=0; j<gold[0].length; j++){
                gold[i][j]=sc.nextInt();
            }
        }
        int[][] dp = new int[n][m];         // dp for storing the max collected gold for each cell.
        for(int j=dp[0].length-1; j>=0; j--){       // we have small problem at last col so we start from last.
            for(int i=0; i<dp.length; i++){         // row rotation we solving vertically
                if(j==dp[0].length-1){              // if j is at peak we jst copy data for last cells from gold.
                    dp[i][j]=gold[i][j];
                }
                else if (i==0){
                    dp[i][j]=Math.max(dp[i][j+1], dp[i+1][j+1])+gold[i][j]; // if row at 1st then we 1 step horizontal and one step diagonal and we compare max gold.
                }                                                           // then its own cell gold.
                else if(i==dp.length-1){
                    dp[i][j]=Math.max(dp[i-1][j+1],dp[i][j+1])+gold[i][j];  // if row at last then 1 step horizontal and 1 diagnoal them max comparision. adding its own cell gold 
                }
                else {
                    dp[i][j]=Math.max(dp[i][j+1],Math.max(dp[i-1][j+1],dp[i+1][j+1]))+gold[i][j];   // adding horizontal 1 step upside diagnoal and 1 step downside diagnoal comparing 3 cell data max data will 
                                                                                                    // add its own cell gold and store to dp.
                }
            }
        }
        int maxGold=Integer.MIN_VALUE;              // maxgold to store
        for(int i=0, j=0; i<dp.length; i++){        // every 1st row we have max gold store but we need to find which cell has max gold.
            if(maxGold<dp[i][j]){               // with loop we are finding maxgold and storing 
                maxGold=dp[i][j];
            }
        }
        System.out.println(maxGold);    // printing tresult
    }

}
