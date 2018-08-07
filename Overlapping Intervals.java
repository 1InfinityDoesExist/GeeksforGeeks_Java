
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Interval
{
    int start;
    int end;
    Interval()
    {
        start = 0;
        end = 0;
    }
    Interval(int s, int e)
    {
        start = s;
        end = e;
    }
}

class com implements Comparator<Interval>
{
	public int compare(Interval a, Interval b)
	{
		return Integer.compare(a.start, b.start);
	}
}
class IntervalProblem
{

    public ArrayList<Interval> solve(ArrayList<Interval> A)
    {
        ArrayList<Interval> ans = new ArrayList<Interval>();
        if(A.size() == 0)
        {
            return ans;
        }

        Stack<Interval> s = new Stack<Interval>();
        Collections.sort(A, new com());

        s.push(A.get(0));
        for(int iter = 1; iter < A.size(); iter++)
        {
        	Interval topper = s.peek();
        	if(topper.end < A.get(iter).start)
        	{
        		s.push(A.get(iter));
        	}
        	else if(topper.end < A.get(iter).end)
        	{
        		topper.end = A.get(iter).end;
        		s.pop();
        		s.push(topper);
        	}
        }

        while(!s.empty())
        {
        	ans.add(s.peek());
        	s.pop();
        }
        Collections.reverse(ans);
        return ans;
    }
}
class GFG {
	public static void main (String[] args)
	{
		//code
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
		    int n = input.nextInt();
		    ArrayList<Interval> ai = new ArrayList<Interval>(n);
		    for(int iter = 0; iter < n; iter++)
		    {
		        int s = input.nextInt();
		        int e = input.nextInt();
		        Interval i = new Interval(s, e);
		        ai.add(i);
		    }
		    IntervalProblem ip = new IntervalProblem();
		    ArrayList<Interval> ans = ip.solve(ai);
		    for(int iter = 0; iter < ans.size(); iter++)
		    {
		    	Interval i = ans.get(iter);
		    	System.out.print(i.start+ " "+ i.end + " ");
		    }
		    System.out.println();
		}
	}
}
