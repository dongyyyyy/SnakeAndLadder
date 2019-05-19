package Geeksforgeeks;


//Java program to unset the 
//rightmost set bit of an integer. 

class GFG22 {// 자바로 해결하기 

 /* unsets the rightmost set bit 
  of n and returns the result */
 static int fun(int n) 
 { 
     return n & (n - 1); 
 } 

 // Driver code 
 public static void main(String arg[]) 
 { 
     int n = 7; 
     System.out.print("The number after unsetting "
                      + "the rightmost set bit " + fun(n)); 
 } 
} 

//This code is contributed by Anant Agarwal. 
