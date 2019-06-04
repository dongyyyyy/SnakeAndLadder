package SnakeAndLadder;
import java.util.*;
 /* 우선순위 우선 탐색 */
public class PriorityProblem  
{ 

    static class qentry implements Comparable<qentry>
    {
    	int v;
    	int dist;
    	
    	@Override
    	public int compareTo(qentry target)
    	{
    		if(this.dist > target.dist && this.v < target.v )
    			return 1;
    		else 
    			return -1;	
    	}

    }
    static int getMinDiceThrows(int move[], int n)  // find min dice
    { // move = map / n = array MAX 
    	int count = 0;
        int visited[] = new int[n];  // visited array
        PriorityQueue<qentry> q = new PriorityQueue<>();  // queue
        qentry qe = new qentry(); 
        qe.v = 0; 
        qe.dist = 0; 
        visited[0] = 1; 
        q.offer(qe); // init
        while (!q.isEmpty())  
        { 
            qe = q.poll();
            System.out.println("remove : " + qe.dist+ "," + qe.v);
            int v = qe.v; 
            if (v == n - 1)  // goal
                break; 
            for (int j = v + 1; j <= (v + 6) && j < n; ++j)  //dice = 1 ~ 6 && j's max = n-1
            { 
                // If this cell is already visited, then ignore 
                if (visited[j] == 0)  // didn't visit ary
                { 
                    qentry a = new qentry(); 
                    a.dist = (qe.dist + 1); 
                    visited[j] = 1; 
                    count++;
                    if (move[j] != -1)  // first visit
                        a.v = move[j]; 
                    else // already visited
                        a.v = j; 
                    q.offer(a); 
                } 
            } 
           // System.out.println("===Queue print===");
           // System.out.println();
        } 
        System.out.println("count = " + count);
        return qe.dist; 
    } 
  
    public static void main(String[] args)  
    { 
        // Let us construct the board given in above diagram 
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