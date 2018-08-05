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
		    Stack<Integer> si = new Stack<Integer>();
		    for(int iter = 0; iter < n; iter++)
		    {
		        si.push(input.nextInt());
		    }
		    int middle = n/2;
		    int count = 0;
		    while(!si.empty())
		    {
		        count++;
		        if(count == middle+1)
		        {
		            si.pop();
		            continue;
		        }
		        System.out.print(si.peek() + " ");
		        si.pop();
		    }
		    System.out.println();
		}
	}
}
