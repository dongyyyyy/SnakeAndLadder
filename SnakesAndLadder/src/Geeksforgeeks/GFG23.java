package Geeksforgeeks;
//Java program to check if two numbers 
//are equal without using arithmetic 
//and comparison operators 
class GFG23 {  // 자바로 해결하기

//Function to check if two 
//numbers are equal using 
//XOR operator 
static void areSame(int a, int b) 
{ 
	if ((a ^ b) != 0) 
	System.out.print("Not Same"); 
	else
		System.out.print("Same"); 
} 

//Driver Code 
public static void main(String[] args) 
{ 
	
	// Calling function 
	areSame(10, 20); 
} 
} 

//This code is contributed by Smitha 
