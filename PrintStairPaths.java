import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        printStairPaths(n,"");
    }
        //1. You are given a number n representing number of stairs in a staircase.
        //2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
    public static void printStairPaths(int n, String path) {

        if(n==0){
            System.out.println(path);   // if n==0 that means we have reached to destination and we print paths
            return;                     // after print we return
        }
        else if(n<0){
            return;                     // if n is less then zero that means we out of limits to destination then we simply return
        }


        printStairPaths(n-1,path+1); // recursion call for n-1 paths
        printStairPaths(n-2,path+2); // recursion call for n-2 paths
        printStairPaths(n-3,path+3); // recursion call for n-3 paths
    }

}