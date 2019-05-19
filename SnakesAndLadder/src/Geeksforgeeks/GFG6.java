package Geeksforgeeks;

//Java code to check if given 
//number is power of 4 or not 
//4ÀÇ °ÅµìÁ¦°ö È®ÀÎ
class GFG6 { 

	// Function to check if 
	// x is power of 4 
	static int isPowerOfFour(int n) 
	{ 
		if(n == 0) 
		return 0; 
		if(n % 4 !=0)
		{
			return 0;
		}
		else
		{
			isPowerOfFour(n/4);
		}
		return 1; 
	} 

	// Driver program 
	public static void main(String[] args) 
	{ 
		int test_no = 62; 
		if(isPowerOfFour(test_no) == 1) 
		System.out.println(test_no + 
						" is a power of 4"); 
		else
		System.out.println(test_no + 
						"is not a power of 4"); 
	} 
} 

//This code is contributed 
//by prerna saini 
