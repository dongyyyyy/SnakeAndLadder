package Geeksforgeeks;
class GFG1 
{ 
    // Method to find the element that occur only once 
    static int getSingle(int arr[], int n) 
    { 
        int ones = 0, twos = 0; 
        int common_bit_mask; 
          
        for(int i=0; i<n; i++ ) 
        { 
            /*"one & arr[i]" gives the bits that are there in 
            both 'ones' and new element from arr[]. We 
            add these bits to 'twos' using bitwise OR*/
            twos = twos | (ones & arr[i]); // OR , AND
            /*"one & arr[i]" gives the bits that are 
            there in both 'ones' and new element from arr[]. 
            We add these bits to 'twos' using bitwise OR*/
            ones = ones ^ arr[i];  // XOR
            /* The common bits are those bits which appear third time 
            So these bits should not be there in both 'ones' and 'twos'. 
            common_bit_mask contains all these bits as 0, so that the bits can  
            be removed from 'ones' and 'twos'*/
            common_bit_mask = ~(ones & twos); // XAND 
            System.out.print(", common_bit_mask = " + common_bit_mask);              
            /*Remove common bits (the bits that appear third time) from 'ones'*/
            ones &= common_bit_mask;  // one & common_bit_mask
            System.out.print(", ones = " + ones);        
            /*Remove common bits (the bits that appear third time) from 'twos'*/
            twos &= common_bit_mask; // two & common_bit_mask
            System.out.println(", twos = " + twos);
        } 
        return ones; 
    } 
      
    //  Driver method 
    public static void main(String args[]) 
    { 
        int arr[] = {3, 3, 2, 3 ,2,1,2}; 
        int n = arr.length; 
        System.out.println("The element with single occurrence is " + getSingle(arr, n)); 
    } 
} 
// Code contributed by Rishab Jain 