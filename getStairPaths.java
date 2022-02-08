import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();                       // Taking input n from user 
        ArrayList<String> result = getStairPaths(n);    // finction calling 
        System.out.println(result);                     // printing result
    }
    //1. You are given a number n representing number of stairs in a staircase.
    //2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.

    public static ArrayList<String> getStairPaths(int n) {
        
            if(n==0){
                ArrayList<String>bsc = new ArrayList<>();    // base case for if we reaced to destination then it will return ArrayList of string 
                bsc.add("");
                return bsc;
            }
            else if(n<0){
                ArrayList<String>bc  = new ArrayList<>();           // base case if n reached to less then zero
                return bc;
            }



        ArrayList<String> path1s = getStairPaths(n-1);      // recursion call for taking 1 step.
        ArrayList<String> path2s = getStairPaths(n-2);      // recursion call for taking 2 steps.
        ArrayList<String> path3s = getStairPaths(n-3);      // recursion call for taking 3 steps.
        ArrayList<String> res = new ArrayList<>();          // ArrayList created for string steps data.
        for(String path : path1s){
                res.add(1+path);                            // adding 1s number of paths 
        }
        for(String path : path2s){
                res.add(2+path);                            // adding 2s number of paths 
        }
        for(String path : path3s){
                res.add(3+path);                            // adding 3s number of paths 
        }
        return res;
    }

}