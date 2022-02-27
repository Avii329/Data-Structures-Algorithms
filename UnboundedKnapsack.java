import java.io.*;
	import java.util.*;

	public class Main {

		/*
		1. You are given a number n, representing the count of items.
		2. You are given n numbers, representing the values of n items.
		3. You are given n numbers, representing the weights of n items.
		3. You are given a number "cap", which is the capacity of a bag you've.
		4. You are required to calculate and print the maximum value that can be created in the bag without 
			overflowing it's capacity.
			Note -> Each item can be taken any number of times. You are allowed to put the same item again 
			and again.
		*/





	    public static void main(String[] args) throws Exception {
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			int [] val = new int[n];  // value Array
			int [] wt = new int[n];		// every value carry some weight to store we use Array
			for(int i=0; i<n; i++){
				wt[i]=sc.nextInt();		// taking weight Data 
			}
			for(int i=0; i<n; i++){
				val[i]=sc.nextInt();	// taking values data 
			}

			int cap = sc.nextInt();		// cappacity of the bag
			int [] dp = new int[cap+1];	// storing 0 to cap weight can carry data of dp
			for(int i=1; i<dp.length; i++){
				for(int j=0; j<n; j++){
					if(i>=val[j]){					// checking wheather capacity is grater then value to carry weight
						int nwt = wt[j]+dp[i-val[j]];	// if yes then checking is existing weight is greater or new weight is greater
						dp[i]=Math.max(nwt,dp[i]);		// comparing new and existing and storing in dp Array 
					}
					
				}
			}
			System.out.println(dp[cap]);	// printing the result 
	    }
	}