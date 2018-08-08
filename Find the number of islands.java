{
import java.io.*;
import java.util.Scanner;
class FindIslands
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[][]a=new int[n][m];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<m;j++)
                {
                    int p=sc.nextInt();
                    a[i][j]=p;
                }
            }
            GFG obj=new GFG();
            System.out.println(obj.findisland(a,n,m));
        }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/


//Function should return the number of islands.
class Index
{
    int x, y;
    Index()
    {
        x = 0;
        y = 0;
    }
    Index(int x_c, int y_c)
    {
        x = x_c;
        y = y_c;
    }
}
class GFG
{
    int dx[] = {1, 1, 0, -1, -1, -1, 0, 1};
    int dy[] = {0, -1, -1, -1, 0, 1, 1, 1};
    public boolean valid(int iter, int jter, int n, int m)
    {
        if(iter < 0 || jter < 0 || iter >= n || jter >= m)
        {
            return false;
        }
        return true;
    }
    public void dfs(int[][] a, int i, int j, int row, int col)
    {
        ArrayList<Index> ai = new ArrayList<Index>();
        Index ix = new Index(i, j);
        ai.add(ix);
        while(!ai.isEmpty())
        {
            Index nikal = ai.remove();
            int oldx = nikal.x;
            int oldy = nikal.y;
            a[oldx][oldy] = 0;
            for(int pter = 0; pter < 8; pter++)
            {
                int newx = oldx + dx[pter];
                int newy = oldy + dy[pter];
                if(valid(newx, newy, row, col))
                {
                    if(a[newx][newy] == 1)
                    {
                        Index xx = new Index(newx, newy);
                        ai.add(xx);
                    }
                }
            }
        }
    }
    public static int findisland(int[][]a,int n,int m)
    {
        //Add your code here.
        int count = 0;
        for(int iter = 0; iter < n; iter++)
        {
            for(int jter = 0; jter < m; jter++)
            {
                if(a[iter][jter] == 1)
                {
                    count++;
                    dfs(a, iter, jter, n , m);
                }
            }
        }
        return count;
    }
}
