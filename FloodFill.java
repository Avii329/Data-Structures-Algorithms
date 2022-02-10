import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        boolean [][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "",visited);
    }
    /*1. You are given a number n, representing the number of rows.
      2. You are given a number m, representing the number of columns.
      3. You are given n*m numbers, representing elements of 2d array a. The numbers can be 1 or 0 only.
      4. You are standing in the top-left corner and have to reach the bottom-right corner.   
    */
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf,boolean[][]visited) {

            // with this base case controling paths and restricting going outside of maze. *maze[sr][sc]==1 this condition for obstacals 1 is obstacal we dont go that side
        if(sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc]==1 || visited[sr][sc]==true ){ 
            return;                                                                           // visited boolean Array for if already that box visited then it will return from there.
        }
        else if(sr == maze.length-1 && sc == maze[0].length-1){ // if it reaches desired destionation then it will print its paths.
            System.out.println(asf);
            return;
        }
            visited[sr][sc]=true;                   // marking visiting cells.
        floodfill(maze,sr-1,sc,asf+"t",visited);    // recursion call for going top
        floodfill(maze,sr,sc-1,asf+"l",visited);    // recursion call for going left
        floodfill(maze,sr+1,sc,asf+"d",visited);    // recursion call for going down
        floodfill(maze,sr,sc+1,asf+"r",visited);    // recursion call for going right
          visited[sr][sc]=false;                    // when all calls are made when it goes back then every cell make it false 
                                                    // because if there is any other path is there if already marked then it wont reach destination so there for we have to mark false it is call backtraking
    }
}
