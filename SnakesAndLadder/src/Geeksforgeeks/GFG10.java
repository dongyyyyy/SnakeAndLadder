package Geeksforgeeks;

public class GFG10 { // 문제해결하기
	static int addOvf(int a, int b)
	{
		System.out.println("a+b = "+(a+b));
		if(((a | b) >= 0) && a+b <0) // (a | b) >= 0 두개의 비트가 동일한지(양수로) 
			return 1;
		else if(((a & b) < 0) && a+b > 0) // 두개의 비트가 동일한지(음수)
			return -1;
		return 0;
	}
	
	public static void main(String[] args)
	{
			int x = 2147483640;
			int y = 10;
			int result = addOvf(x,y);
			if(result == 1)
			{
				System.out.println("양수 Overflow");
			}
			else if(result == -1)
			{
				System.out.println("음수 Overflow");
			}
			else
			{
				System.out.println("No Problem" );
			}
	}
}
