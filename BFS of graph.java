import java.io.*;
import java.lang.*;
import java.util.*;


public class GFG
{
	private int V;
	private  List<Integer>[] adj;
	GFG(int V)
	{
		this.V = V;
		adj = new ArrayList[V];
		for(int iter = 0; iter < V; iter++)
		{
			adj[iter] = new ArrayList<Integer>();
		}
	}
	void addEdge(int x, int y)
	{
		adj[x].add(y);
	}
	void bfs(int s)
	{
		boolean[] visited = new boolean[V+1];
		for(int iter = 0; iter <= V; iter++)
		{
			visited[iter] = false;
		}
		 	Queue<Integer> q = new LinkedList<Integer>();
	        q.add(s);
	        visited[s] = true;
	        while(!q.isEmpty())
	        {
	            int u = q.peek();
	            q.poll();
	            System.out.print(u + " ");
		        Iterator iter = adj[u].iterator();
		        while(iter.hasNext())
		        {
		        	int v = (Integer)iter.next();
		            if(visited[v] == false)
		            {
		            	q.add(v);
		                visited[v] = true;
		             }
		        }
	        }
	        return;
	}
	public static void main(String[] args) throws Exception
	{
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int Vertices = input.nextInt();
			GFG g = new GFG(Vertices);

			for(int iter = 0; iter < Vertices; iter++)
			{
				int a = input.nextInt();
				int b = input.nextInt();
				g.addEdge(a, b);
			}
			g.bfs(1);
		}
	}
}

/*


1
4
1 2 1 3 2 1 2 3

*/