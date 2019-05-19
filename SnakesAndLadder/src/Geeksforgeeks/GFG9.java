package Geeksforgeeks;
import java.util.*;
//Java program to find the element occurring 
//odd number of times 
//Ȧ�� ���� ã��
class GFG9 { 
	static int getOddOccurrence(int arr[], int n) 
    { 
        HashMap<Integer,Integer> hmap = new HashMap<>(); 
          
        // Putting all elements into the HashMap 
        for(int i = 0; i < n; i++) 
        { 
            if(hmap.containsKey(arr[i])) 
            { 
                int val = hmap.get(arr[i]); 
                hmap.put(arr[i], val + 1);  
            } 
            else
                hmap.put(arr[i], 1);  
        } 
        // Checking for odd occurrence of each element present 
        // in the HashMap  
        for(Integer a:hmap.keySet()) 
        { //key���� 2�� ������ �� �������� 0�� �ƴϸ� Ȧ��
            if(hmap.get(a) % 2 != 0) 
                return a; 
        } 
        return -1; 
    } 
    // driver code     
    public static void main(String[] args)  
    { 
        int arr[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2}; 
        int n = arr.length; 
        System.out.println(getOddOccurrence(arr, n)); 
    } 
} 
//This code has been contributed by Kamal Rawal 
