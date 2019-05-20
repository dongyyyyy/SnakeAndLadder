package Geeksforgeeks;
//얼마나 1bit값을 가지는지
//Java program to Count set 
//bits in an integer 
import java.io.*; 

class GFG11 
{ 
	/* Function to get no of set 
	bits in binary representation 
	of positive integer n */
	static int countSetBits(int n) 
	{ 
		if(n == 0)
			return 0;
		else
			return  (n & 1) + countSetBits(n>>1);
	} 

	// driver program 
	public static void main(String args[]) 
	{ 
		int i = 9; 
		System.out.println(countSetBits(i)); 
	} 
} 

//This code is contributed by Anshika Goyal. 
