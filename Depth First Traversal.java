import java.io.*;
import java.lang.*;
import java.util.*;

public class Graph
{
	private int V;
	ArrayList<Integer>[] adj;
	Graph(int V)
	{
		this.V = V;
		adj = new ArrayList[V];
		for(int iter = 0; iter < V; iter++)
		{
			adj[iter] = new ArrayList<Integer>();
		}
	}
	void addEdges(int x, int y)
	{
		adj[x].add(y);
	}
	void DFS(int src)
	{
		boolean[] visited = new boolean[V];
		for(int iter = 0; iter < V; iter++)
		{
			visited[iter] = false;
		}
		Stack<Integer> st = new Stack<Integer>();
		st.push(src);
		visited[src] = true;
		while(!st.isEmpty())
		{
			int x = st.peek();
			st.pop();
			System.out.print(x + " ");
			Iterator<Integer> iter = adj[x].iterator();
			while(iter.hasNext())
			{
				int y = (Integer)iter.next();
				if(!visited[y])
				{
					st.push(y);
					visited[y] = true;
				}
			}
		}
		return;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int V = input.nextInt();
			Graph g = new Graph(V);
			for(int iter = 0; iter < V; iter++)
			{
				int a = input.nextInt();
				int b = input.nextInt();
				g.addEdges(a, b);
			}
			g.DFS(0);
		}
	}
}
