/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class TrappingWater
{
    public int solve(ArrayList<Integer> A)
    {
        int[] left = new int[A.size()];
        left[0] = A.get(0);
        for(int iter = 1; iter < A.size() ;iter++)
        {
            left[iter] = Math.max(left[iter-1], A.get(iter));
        }
        int[] right = new int[A.size()];
        right[A.size()-1] = A.get(A.size()-1);
        for(int iter = A.size()-2; iter >= 0; iter--)
        {
             right[iter] = Math.max(right[iter+1], A.get(iter));
        }
        int water = 0;
        for(int iter = 0; iter < A.size(); iter++)
        {
            water = water + Math.min(left[iter], right[iter])  - A.get(iter);
        }
        return water;
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
		    TrappingWater tw = new TrappingWater();
		    System.out.println(tw.solve(ai));
		}
	}
}
