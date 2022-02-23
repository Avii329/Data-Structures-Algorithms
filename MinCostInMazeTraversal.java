import java.io.*;
import java.util.*;

public class Main {

/* 1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a, which represents a maze.
4. You are standing in top-left cell and are required to move to bottom-right cell.
5. You are allowed to move 1 cell right (h move) or 1 cell down (v move) in 1 motion.
6. Each cell has a value that will have to be paid to enter that cell (even for the top-left and bottom- 
     right cell).
7. You are required to traverse through the matrix and print the cost of path which is least costly. 
*/

 public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][] cost = new int[n][m];
        for(int i=0; i<cost.length; i++){
            for(int j =0; j<cost[0].length; j++){  // in 2d Array taking cost data for each cell 
                cost[i][j]=sc.nextInt();
            }
        }
        int[][] dp = new int [n][m];               // dp Array for string min cost to reach cell one by one 
        for(int i=dp.length-1; i>=0; i--){
            for(int j =dp[0].length-1; j>=0; j--){                  
                if(i==n-1 && j==m-1){                 // is row and col at destination then cost will be at cost data destination cell 
                    dp[i][j]=cost[i][j];
                }
                else if(i==n-1){
                    dp[i][j]=dp[i][j+1]+cost[i][j];   // when row at extream then cost of cell calculating 
                }
                else if(j==m-1){
                    dp[i][j]=dp[i+1][j]+cost[i][j];     // is col at extrean the calculating cell cost.
                }
                else {
                    dp[i][j]=Math.min(dp[i+1][j],dp[i][j+1])+cost[i][j];    // leftover cell have 2 option horizontal move and vertical move 
                }                                                           // we compared horizontal move cost and vertical cost min move coat added to cost data cell cost 
                                                                            // and stores at dp position.
            }
        }
        System.out.println(dp[0][0]); // printing min cost 

    }

}