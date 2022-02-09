import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();			// n for row
			int m = sc.nextInt();			// m for comlum
			printMazePaths(1,1,n,m,"");		// function call 
	    }
		//1. You are given a number n and a number m representing number of rows and columns in a maze.
        //2. You are standing in the top-left corner and have to reach the bottom-right corner. Only two moves are allowed 'h' (1-step horizontal) and 'v' (1-step vertical).



	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	        if(sr==dr && sc==dc){
				System.out.println(psf);		// if source column and source row column reach to destionation then we print psf(path so far).
				return;							// we return 
			}


			if(sc<dc){
				printMazePaths(sr,sc+1,dr,dc,psf+"h");		// if condition for to control colum from getting outside of the maze. and psf (path so far) we adding h paths
			}
			if(sr<dr){
				printMazePaths(sr+1,sc,dr,dc,psf+"v");     // if condition for to control row from getting outside of the maze. and psf (path so far) we adding v paths
			}
	    }

	}