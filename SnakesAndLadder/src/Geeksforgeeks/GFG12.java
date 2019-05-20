package Geeksforgeeks;
// A -> B로전환하기 위해 뒤집을 비트 수 계산
//Count number of bits to be flipped 
//to convert A into B 
import java.util.*; 

class GFG12 { 
	
	// Function that count set bits 
	public static int countSetBits(int n) 
	{ 
		int count = 0; 
		while (n != 0) { //다른 비트일 경우 1인 것이 XOR임. 따라서 1의 값을 카운터값을 더한 값이 정답
			count += n & 1; 
			n >>= 1; 
		} 
		return count; 
	} 

	// Function that return count of 
	// flipped number 
	public static int FlippedCount(int a, int b) 
	{ 
		// Return count of set bits in 
		// a XOR b 
		return countSetBits(a ^ b); // 다른 비트 유무
	} 
	
	// Driver code 
	public static void main(String[] args) 
	{ 
		int a = 10; 
		int b = 20; 
		System.out.print(FlippedCount(a, b)); 
	} 
} 

//This code is contributed by rishabh_jain 
