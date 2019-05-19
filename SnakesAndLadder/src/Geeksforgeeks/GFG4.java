package Geeksforgeeks;


//Java Program to multiply 
//a number with 3.5 
//연산자를 사용하지 않고 3.5를 곱한 값을 return
class GFG4 { 
       
 static int multiplyWith3Point5(int x) 
 { 
     return (x<<1) + x + (x>>1); 
     //x <<1 = x * 2 , + x = original value + , x >> 1 = x / 2 
     // 3x+x/2
 }  
   
 /* Driver program to test above functions*/
 public static void main(String[] args) 
 { 
     int x = 2;  
     System.out.println(multiplyWith3Point5(x)); 
 } 
} 

//This code is contributed by prerna saini. 
