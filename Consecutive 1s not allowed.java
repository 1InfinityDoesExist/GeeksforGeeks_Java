/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class NoOnes
{
    public long solve(int  x)
    {
        long[] dp1 = new long[x];
        long[] dp2 = new long[x];

        dp1[0] = dp2[0] = 1;
        for(int iter = 1; iter < x; iter++)
        {
            dp1[iter] = (dp1[iter-1]%1000000007 + dp2[iter-1]%1000000007)%1000000007;
            dp2[iter] = dp1[iter-1]%1000000007;
        }
        long ans = (dp1[x-1] + dp2[x-1])%1000000007;
        return ans;
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
            NoOnes no = new NoOnes();
            System.out.println(no.solve(n));
        }
	}
}
