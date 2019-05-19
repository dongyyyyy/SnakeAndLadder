package Geeksforgeeks;

public class GFG10 { // 문제해결하기
	static int addOvf(int a, int b)
	{
		System.out.println("a+b = "+(a+b));
		if(a > 0 && b > 0 && a+b <0)
			return 1;
		else if(a < 0 && b < 0 && a+b > 0)
			return 1;
		return 0;
	}
	
	public static void main(String[] args)
	{
			int x = 2147483640;
			int y = 10;
			int result = addOvf(x,y);
			if(result == 1)
			{
				System.out.println("Overflow");
			}
			else
			{
				System.out.println("No Problem" );
			}
	}
}
