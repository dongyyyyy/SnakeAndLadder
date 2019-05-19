package Geeksforgeeks;

//Java Program to swap two numbers without 
//using temporary variable 
import java.*; 

class Geeks18 { 

	public static void main(String a[]) 
	{ 
		int x = 10; 
		int y = 5; 
		x = x + y; 
		y = x - y; 
		x = x - y; 
		System.out.println("After swaping:"
						+ " x = " + x + ", y = " + y); 
	} 
} 

//This code is contributed by Sam007 
