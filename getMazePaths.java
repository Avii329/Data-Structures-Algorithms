import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();       
            int m = sc.nextInt();
            ArrayList<String> result = getMazePaths(1,1,n,m);
            System.out.println(result);
    }
    /* 1. You are given a number n and a number m representing number of rows and columns in a maze.
       2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).  */

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
     
            if(sr == dr && sc == dc ){
                ArrayList<String> bes = new ArrayList<>();
                bes.add("");
                return bes;
            }

        ArrayList<String> hpaths = new ArrayList<>();    // ArrayList Declear for horizontal paths
        ArrayList<String> vpaths = new ArrayList<>();    // ArryList declear for vertical paths
        if(sc<dc){
            hpaths = getMazePaths(sr,sc+1,dr,dc);         // for horizontal paths source paths should not be exceeds then destination limit so we used the id condition to limiting
        }
        if(sr<dr){
            vpaths = getMazePaths(sr+1,sc,dr,dc);            // for vertical paths source paths should not be exceeds then destination limit so we used the id condition to limiting
        }
        ArrayList<String> res = new ArrayList<>();          // ArrayList created for storing paths
        for(String s : hpaths){
            res.add("h"+s);                                    // adding horizontal paths
        }
        for(String s : vpaths){
            res.add("v"+s);                                     // adding vertical paths.
        }
       return  res;                                             // returning the result
    }       

}