/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
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
    		ArrayList<Integer> dp = new ArrayList<Integer>(n);
    		for(int iter = 0; iter < n; iter++)
    		{
    		    dp.add(1);
    		}

    		for(int iter = 1; iter < n; iter++)
    		{
    		    for(int jter = 0; jter < iter; jter++)
    		    {
    		        if((ai.get(iter) > ai.get(jter)) && dp.get(iter) < dp.get(jter)+1)
    		        {
    		            dp.set(iter, dp.get(jter)+1);
    		        }
    		    }
    		}
    		if(!dp.isEmpty())
    		{
    		    Integer mx = Collections.max(dp);
    		    System.out.println(mx);
    		}
    		else
    		{
    		    System.out.println(0);
    		}
    		ai.clear();
    		dp.clear();
		}
	}
}
