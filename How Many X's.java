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
		    int left = input.nextInt();
		    int right = input.nextInt();
		    int count = 0;
		    for(int iter = left+1; iter < right; iter++)
		    {
		        int x = iter;

		        while(x > 0)
		        {
		            int rem = x%10;
		            if(rem == n)
		            {
		                count++;
		            }
		            x /= 10;
		        }
		    }
		    System.out.println(count);
		}
	}
}
