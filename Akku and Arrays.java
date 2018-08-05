/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static boolean isIncs(ArrayList<Integer> v)
    {
        for(int iter = 1; iter < v.size(); iter++)
        {
            if(v.get(iter) < v.get(iter-1))
            {
                return false;
            }
        }
        return true;
    }
    public static boolean isDesc(ArrayList<Integer> v)
    {
        for(int iter = v.size()-2; iter >= 0; iter--)
        {
            if(v.get(iter) < v.get(iter+1))
            {
                return false;
            }
        }
        return true;
    }
	public static void main (String[] args)
	{
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
		    int queries = input.nextInt();
		    while(queries-- > 0)
		    {
		        int no = input.nextInt();
		        if(no == 1)
		        {
		            int index = input.nextInt();
		            int value = input.nextInt();
		            ai.set(index-1, value);
		        }
		        if(no == 2)
		        {
		            int left = input.nextInt();
		            int right = input.nextInt();
		            ArrayList<Integer> v = new ArrayList<Integer>();
		            for(int iter = left-1; iter <= right-1; iter++)
		            {
		                v.add(ai.get(iter));
		            }
		            if(isDesc(v) && isIncs(v))
		            {
		                System.out.println(-1);
		                continue;
		            }
		            if(isIncs(v))
		            {
		                System.out.println(0);
		                continue;
		            }
		            if(isDesc(v))
		            {
		                System.out.println(1);
		                continue;
		            }
		            else
		            {
		                System.out.println(-1);
		                continue;
		            }
		        }

		    }
		}
	}
}
