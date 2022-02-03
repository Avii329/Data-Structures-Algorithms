class Solution{
    
    // arr: input array
    // n: size of array
    // Function to find the trapped water between the blocks.
    static int trappingWater(int arr[], int n) { 
        int sum=0,left=arr[0],right=arr[n-1];
       if(arr[0]<arr[n-1]){
           for(int i=0; i<n-2; i++){
               if(left>arr[i+1]){
                  sum+=left-arr[i+1]; 
               }
               else{
                   
                   left=arr[i+1];
               }
               
           }
       }
       else{
           for(int i=n-1; i>0; i--){
               if(right>arr[i-1]){
                   sum+=right-arr[i-1];
               }
               else {
                   right=arr[i-1];
               }
           }
           
       }
        return sum;
    } 
}