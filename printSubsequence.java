import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();             // taking input 
        printSS(str,"");                    // calling the function
    }
        // in this subsequence problem we are not storing data in instead with help of ans string we are directly printing data using recrsive
    public static void printSS(String str, String ans) {
        if(str.length()==0){
            System.out.println(ans);        // printing the all possible subsequnces
            return;                           // after that return
        }


        char ch = str.charAt(0);        // in charcter variable stroed 1st character of string
        String ros = str.substring(1);  // in ros string we stored rest of the string 
        printSS(ros, ans+ch);           // every element has two option  wheather it intreact or no here in this call element inteacted
        printSS(ros, ""+ans);           // here element not intreacted 
    }

}