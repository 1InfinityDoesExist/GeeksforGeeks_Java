
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class LSP
{
    public int solve(String str)
    {
        int len = str.length();
        int[] dp = new int[len];
        int l = 0;
        dp[0] = 0;
        int iter = 1;
        while(iter < len)
        {
            if(str.charAt(iter) == str.charAt(l))
            {
                l++;
                dp[iter] = l;
                iter++;
            }
            else
            {
                if(l != 0)
                {
                    l = dp[l-1];
                }
                else
                {
                    dp[iter] = 0;
                    iter++;
                }
            }
        }
        return dp[len-1];
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
		    String str = input.next();
		    LSP obj = new LSP();
		    System.out.println(obj.solve(str));
		}
	}
}
