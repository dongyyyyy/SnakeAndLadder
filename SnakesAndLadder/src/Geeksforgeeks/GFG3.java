package Geeksforgeeks;
//�Ű������� +1�� ���� return ��� ������ ��� x
class GFG3 { 
	  
    static int addOne(int x) 
    { 
        int m = 1; 
          
        // Flip all the set bits  
        // until we find a 0  
        System.out.println("x & m = " + (int)(x&m));
        while( (int)(x & m) == 1) // find 0
        { 
        	System.out.println("m = " + m);
            x = x ^ m;  
            m <<= 1; //move m bit
        } 
      
        // flip the rightmost 0 bit  
        System.out.println("m = " + m);
        x = x ^ m; 
        return x; 
    } 
      
    /* Driver program to test above functions*/
    public static void main(String[] args) 
    { 
        System.out.println(addOne(12)); 
    } 
} 
  
// This code is contributed by prerna saini. 
