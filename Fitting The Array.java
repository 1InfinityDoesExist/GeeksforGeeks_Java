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
		    ArrayList<Integer> aj = new ArrayList<Integer>(n);
		    for(int iter = 0; iter < n; iter++)
		    {
		        ai.add(input.nextInt());
		    }
		    for(int iter = 0; iter < n; iter++)
		    {
		        aj.add(input.nextInt());
		    }
		    Collections.sort(ai);
		    Collections.sort(aj);
		    boolean mila = true;
		    for(int iter = 0; iter < n; iter++)
		    {
		        if(ai.get(iter) > aj.get(iter))
		        {
		            mila = false;
		            System.out.println("NO");
		            break;
		        }
		    }
		    if(mila)
		    {
		        System.out.println("YES");
		    }
		}
	}
}
