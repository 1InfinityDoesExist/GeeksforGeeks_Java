/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class MinJump
{
    public int solve(ArrayList<Integer> ai)
    {
        if(ai.get(0) == 0)
        {
            return -1;
        }
        int start = 0;
        int end = 0;
        int steps = 0;
        int lastPos = ai.size()-1;
        while(end < lastPos)
        {
            steps++;
            int maxEnd = end+1;
            for(int iter = start; iter <= end; iter++)
            {
                if(iter + ai.get(iter) >= lastPos)
                {
                    return steps;
                }
                maxEnd = Math.max(maxEnd, iter+ ai.get(iter));
            }
            start = end;
            end = maxEnd;
            if(ai.get(end) == 0)
            {
                return -1;
            }
        }
        return steps;
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
            ArrayList<Integer> ai = new ArrayList<Integer>();
            for(int iter = 0; iter < n; iter++)
            {
                ai.add(input.nextInt());
            }
            MinJump mj = new MinJump();
            System.out.println(mj.solve(ai));
        }
	}
}
