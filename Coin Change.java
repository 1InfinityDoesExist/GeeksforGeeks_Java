/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;
class CoinChange
{
    public int solve(ArrayList<Integer> A, final int N)
    {
        ArrayList<Integer> _ai = new ArrayList<Integer>();
        for(int iter = 0; iter <= N; iter++)
        {
            _ai.add(0);
        }
        _ai.set(0, 1);
        for(int iter = 0; iter < A.size(); iter++)
        {
            for(int jter = A.get(iter); jter <= N; jter++)
            {
                _ai.set(jter, _ai.get(jter) + _ai.get(jter - A.get(iter)));
            }
        }
        return _ai.get(N);
    }
}
class GFG {
	public static void main (String[] args)
	{
		//code
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
		    int n = input.nextInt();
		    ArrayList<Integer> ai = new ArrayList<Integer>(n);
		    for(int iter = 0; iter < n; iter++)
		    {
		        ai.add(input.nextInt());
		    }
		    int N = input.nextInt();
		    CoinChange cg = new CoinChange();
		    int ans = cg.solve(ai, N);
		    System.out.println(ans);
		}
	}
}
