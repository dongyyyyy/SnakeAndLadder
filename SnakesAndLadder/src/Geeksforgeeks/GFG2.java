package Geeksforgeeks;
// �� ������ ��ȣ�� ��ġ�ϴ����� ���ؼ� Ȯ��
class GFG2 { 
	  
    static boolean oppositeSigns(int x, int y) 
    { 
        return ((x ^ y) < 0);  // True = ��ȣ�� �ݴ� , False = ��ȣ�� ��ġ 
    } 
      
    public static void main(String[] args) 
    { 
        int x = 100, y = 100; 
        if (oppositeSigns(x, y) == true)  
            System.out.println("Signs are opposite"); 
        else
            System.out.println("Signs are not opposite"); 
    } 
} 
  