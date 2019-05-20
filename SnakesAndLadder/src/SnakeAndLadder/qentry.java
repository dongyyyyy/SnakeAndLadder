package SnakeAndLadder;

public class qentry {
	
	public qentry()
	{
		
	}
    public qentry(int v, int dist) {
		// TODO Auto-generated constructor stub
    	this.v = v;
    	this.dist = dist;
	}
	// An entry in queue used in BFS 
    int v;// Vertex number 
    int dist;// Distance of this vertex from source \
}
