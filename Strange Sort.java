/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
		    int n = input.nextInt();
		   int mid = 0;
		    int m = input.nextInt();
		    ArrayList<Integer> ai = new ArrayList<Integer>(n);

		    for(int iter = 1; iter <= n; iter++)
		    {
		        if(iter == m)
		        {
		              mid = input.nextInt();
		        }
		        else
		        {
		            ai.add(input.nextInt());
		        }
		    }
		   // Integer a = new Integer(mid);
		    Collections.sort(ai);
		    ai.add(m-1, mid);
		    Iterator it = ai.iterator();
		    while(it.hasNext())
		    {
		        System.out.print(it.next() + " ");
		    }
		    System.out.println();
		}
	}
}
