import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> res = gss(str);
        System.out.println(res);
    }

    public static ArrayList<String> gss(String str) {
        
        if(str.length()==0){
            ArrayList<String> bc = new ArrayList<>(); // base case we created an empty ArrayList because in every subsequence there will be an blank subsequence string 
            bc.add("");
            return bc;
        }


        char ch = str.charAt(0);                  // for example string is abc we stored a in char.
        String st = str.substring(1);             // and we here we saparated a and bc. BC stored in string st

        ArrayList<String> rss = gss(st);          // recursion call we take faith that BC string know how to print --,-b,-c,-bc, and if we add a to all bc then it will give its result so there are to choices for a wheather it interact with bc or not based on that we called recursion function called.
        ArrayList<String> res = new ArrayList<>(); // created new ArrayList for storing the data.
       for(String s: rss){                         // in subsequence there are two choices wheather character want to interact or dont want to interact
           res.add(""+s);                           // so here character refused to interact and added elements as it is 
       }
       for(String s : rss){                         // character added to string where charecter interacted.
           res.add(ch+s);
       }
        return res;



    }

}