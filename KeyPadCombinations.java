import java.io.*;
import java.util.*;


// Key Pad combinations in key pad we have  0 to 9 number and every number have alphabets and we are creating combinations using key pad number 


public class Main {
       static  String [] data ={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"}; // global Array for storing key pad numbers data. 0 to 9
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);  
        String str = sc.next();                            // taking input from user 
        ArrayList<String> res = getKPC(str);               // calling function
                System.out.println(res);                   // printing result                            
    }

    public static ArrayList<String> getKPC(String str) {
        
            if(str.length()==0){
                ArrayList<String> bc = new ArrayList<>();   
                bc.add("");
                return bc;
            }



        char ch = str.charAt(0);                  // storing 1st number from string, for example user is input is 475 in character we stored 4
        String ros = str.substring(1);             // saparating rest digits from string and storing in ros string  athat is 75
        ArrayList<String> ress = getKPC(ros);         // recursion call for for rest of the string untill sting size reach to zero
        ArrayList<String> res = new ArrayList<>();  // for storing data we created new ArrayList.
        // post order Operations 
        String s = data[ch -'0'];                   // we stored string from data Array and data[ch-'0'] we converted charcter to integer using ascii 
        for(int i=0; i<s.length(); i++){            // loop 1 for adding every char to string which in we have stored in String s
            char ch1 = s.charAt(i);                 // getting one by one character
           for(String strr : ress){                 // from ress we recived string and adding one by with character 
               res.add(ch1+strr);                   // added in res Arraylist.
           }
        }   
        return res;                                 // returned the resluts 
    }

}