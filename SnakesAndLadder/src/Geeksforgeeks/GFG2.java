package Geeksforgeeks;
// 두 정수의 부호가 일치하는지에 대해서 확인
class GFG2 { 
	  
    static boolean oppositeSigns(int x, int y) 
    { 
        return ((x ^ y) < 0);  // True = 부호가 반대 , False = 부호가 일치 
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
  