package SnakeAndLadder;
import java.util.*;

 /* 너비 우선 탐색 */
public class StackProblem  
{ 
    // This function returns minimum number of dice  
    // throws required to Reach last cell from 0'th cell  
    // in a snake and ladder game. move[] is an array of  
    // size N where N is no. of cells on board If there  
    // is no snake or ladder from cell i, then move[i]  
    // is -1 Otherwise move[i] contains cell to which  
    // snake or ladder at i takes to. 
    static int getMinDiceThrows(int move[], int n)  // find min dice
    { // move = map / n = array MAX 
    	int count = 0;
        int visited[] = new int[n];  // visited array
        Stack<qentry> q = new Stack<>();  // queue
        qentry qe = new qentry(); 
        qe.v = 0; 
        qe.dist = 0; 
  
        // Mark the node 0 as visited and enqueue it. 
        visited[0] = 1; 
        q.add(qe); // init
  
        // Do a BFS starting from vertex at index 0 
        while (!q.isEmpty())  
        { 
            qe = q.pop();
            System.out.println("remove : " + qe.dist+ "," + qe.v);
            int v = qe.v; 
  
            // If front vertex is the destination  
            // vertex, we are done 
            if (v == n - 1)   // goal
            	break; 
            
            // Otherwise dequeue the front vertex and  
            // enqueue its adjacent vertices (or cell  
            // numbers reachable through a dice throw) 
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
                    if (v == n - 1)  // goal
                        break; 
                    // Check if there a snake or ladder at 'j' 
                    // then tail of snake or top of ladder 
                    // become the adjacent of 'i' 
                    if (move[j] != -1)  // first visit
                        a.v = move[j]; 
                    else // already visited
                        a.v = j; 
                    q.add(a); 
                    count++;
                } 
            } 
           // System.out.println("===Queue print===");
            //System.out.println();
        } 
        //list 추가한거 출력해보기
        //print visited
        // We reach here when 'qe' has last vertex 
        // return the distance of vertex in 'qe' 
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