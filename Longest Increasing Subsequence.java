/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class LIS
{
    public int solve(ArrayList<Integer> A)
    {
        if(A.size() == 0)
        {
            return 0;
        }
        ArrayList<Integer> dp = new ArrayList<Integer>(A.size());
        for(int iter = 0; iter < A.size(); iter++)
        {
            dp.add(1);
        }
        for(int iter = 1; iter < A.size(); iter++)
        {
            for(int jter = 0; jter < iter; jter++)
            {
                if(A.get(iter) > A.get(jter) && dp.get(iter) < dp.get(jter) +1)
                {
                    dp.set(iter, dp.get(jter) +1);
                }
            }
        }

        int mx = Integer.MIN_VALUE;
        for(int iter = 0; iter < dp.size(); iter++)
        {
            if(mx < dp.get(iter))
            {
                mx = dp.get(iter);
            }
        }
        return mx;
    }
}
class GFG
{
	public static void main (String[] args)
	{
		//code
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
		    int n = input.nextInt();
		    ArrayList<Integer> ai = new ArrayList<Integer>();
		    for(int iter = 0; iter < n; iter++)
		    {
		        ai.add(input.nextInt());
		    }
		    LIS lis = new LIS();
		    System.out.println(lis.solve(ai));
		}
	}
}
