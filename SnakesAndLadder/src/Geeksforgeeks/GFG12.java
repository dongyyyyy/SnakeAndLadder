package Geeksforgeeks;
// A -> B����ȯ�ϱ� ���� ������ ��Ʈ �� ���
//Count number of bits to be flipped 
//to convert A into B 
import java.util.*; 

class GFG12 { 
	
	// Function that count set bits 
	public static int countSetBits(int n) 
	{ 
		int count = 0; 
		while (n != 0) { //�ٸ� ��Ʈ�� ��� 1�� ���� XOR��. ���� 1�� ���� ī���Ͱ��� ���� ���� ����
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
		return countSetBits(a ^ b); // �ٸ� ��Ʈ ����
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
