package Geeksforgeeks;

public class GFG10 { // �����ذ��ϱ�
	static int addOvf(int a, int b)
	{
		System.out.println("a+b = "+(a+b));
		if(((a | b) >= 0) && a+b <0) // (a | b) >= 0 �ΰ��� ��Ʈ�� ��������(�����) 
			return 1;
		else if(((a & b) < 0) && a+b > 0) // �ΰ��� ��Ʈ�� ��������(����)
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
				System.out.println("��� Overflow");
			}
			else if(result == -1)
			{
				System.out.println("���� Overflow");
			}
			else
			{
				System.out.println("No Problem" );
			}
	}
}
