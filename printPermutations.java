import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations(str,"");
    }

    public static void printPermutations(String str, String asf) {
        
        if(str.length()==0){
            System.out.println(asf);    // printing the result.
            return ;
        }



            

        for(int i=0; i<str.length(); i++){   // loop for mutltple choices to choose   
            char ch = str.charAt(i);         // choosing a aphabet for ex: if a choosed then rest need to slove.
            String s1 = str.substring(0,i);     //  saparating strings which are need to create permutatation before character choosed.
            String s2 = str.substring(i+1);     // saparating string after choosed character.    
            String s3 = s1+s2;                  // adding both string which need to slove
            printPermutations(s3,asf+ch);       // recursion call for solving the permutation

        }
    }

}