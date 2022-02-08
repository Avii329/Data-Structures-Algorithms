import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<String> res = getMazePaths(1,1,n,m);
        System.out.println(res);
    }
    /*1.You are given a number n and a number m representing number of rows and columns in a maze.
     2. You are standing in the top-left corner and have to reach the bottom-right corner. 
     3. In a single move you are allowed to jump 1 or more steps horizontally (as h1, h2, .. ), or 
        1 or more steps vertically (as v1, v2, ..) or 1 or more steps diagonally (as d1, d2, ..).  */

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        

            if(dc ==sc && dr == sr){
                ArrayList<String> bs = new ArrayList<>();
                bs.add("");
                return bs;
            }


   
        ArrayList<String> res = new ArrayList<>();
        for(int i=1; i<=dc-sc; i++){
           ArrayList<String> hpaths = getMazePaths(sr,sc+i,dr,dc);
            for(String p : hpaths){
            res.add("h"+i+p);
        }
        }
        for(int i= 1; i<=dr-sr; i++){
           ArrayList<String> vpaths = getMazePaths(sr+i,sc,dr,dc);
              for(String p : vpaths){
            res.add("v"+i+p);
        }
        }
        for(int i=1; i<=dc-sc && i<=dr-sr ; i++){
           ArrayList<String> dpaths = getMazePaths(sr+i,sc+i,dr,dc);
              for(String p : dpaths){
            res.add("d"+i+p);
        }
        }
        
        
      
        return res;
    }

}