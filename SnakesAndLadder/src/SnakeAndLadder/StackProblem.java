package SnakeAndLadder;
import java.util.*;

 /* 너비 우선 탐색 */
public class StackProblem  
{  
    static int getMinDiceThrows(int move[], int n)  // find min dice
    { // move = map / n = array MAX 
    	int count = 0;
        int visited[] = new int[n];  // visited array
        Stack<qentry> q = new Stack<>();  // queue
        qentry qe = new qentry(); 
        qe.v = 0; 
        qe.dist = 0; 
  
        visited[0] = 1; 
        q.add(qe); // init
  
        while (!q.isEmpty())  
        { 
            qe = q.pop();
            System.out.println("remove : " + qe.dist+ "," + qe.v);
            int v = qe.v; 
  
            if (v == n - 1)   // goal
            	break; 
            
            for (int j = v + 1; j <= (v + 6) && j < n; ++j)  //dice = 1 ~ 6 && j's max = n-1
            { 
                // If this cell is already visited, then ignore 
                if (visited[j] == 0)  // didn't visit ary
                { 
                    // Otherwise calculate its distance and  
                    // mark it as visited 
                    qentry a = new qentry(); 
                    a.dist = (qe.dist + 1); 
                    visited[j] = 1; 

                    if (move[j] != -1)  // first visit
                        a.v = move[j]; 
                    else // already visited
                        a.v = j; 
                    q.add(a); 
                    count++;
                } 
            } 
        } 
        System.out.println("count = " + count);
        return qe.dist; 
    } 
  
    public static void main(String[] args)  
    { 
        int N = 100; 
        int moves[] = new int[N]; 
        for (int i = 0; i < N; i++)  // init ary to -1
            moves[i] = -1; 
  
        // Ladders 
        moves[7] = 54; 
        moves[18] = 75; 
        moves[31] = 92; 
  
        // Snakes 
        moves[96] = 58; 
        moves[55] = 3; 
        moves[87] = 32;  
  
        System.out.println("Min Dice throws required is " +  
                          getMinDiceThrows(moves, N)); 
    } 
} 