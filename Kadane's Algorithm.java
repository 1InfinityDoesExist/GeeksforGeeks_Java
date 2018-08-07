/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class KadaneAlgo
{
    public int solve(ArrayList<Integer> A)
    {
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for(int iter = 0; iter < A.size(); iter++)
        {
            max_ending_here = max_ending_here + A.get(iter);
            if(max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
            }
            if(max_ending_here < 0)
            {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
}
class GFG
{
	public static void main (String[] args)
	{
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
		    KadaneAlgo ka = new KadaneAlgo();
		    System.out.println(ka.solve(ai));
		}
	}
}
