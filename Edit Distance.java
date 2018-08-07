/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class EditDistance
{
    public int solve(String s1, String s2)
    {
        int len1 = s1.length();
        int len2 = s2.length();
        int[][] dp = new int[len1+1][len2+1];
        for(int iter = 0; iter <= len1; iter++)
        {
            for(int jter = 0; jter <= len2; jter++)
            {
                if(iter == 0 )
                {
                    dp[iter][jter] = jter;
                }
                else if(jter == 0)
                {
                    dp[iter][jter] = iter;
                }
                else if(s1.charAt(iter-1) == s2.charAt(jter-1))
                {
                    dp[iter][jter] = dp[iter-1][jter-1];
                }
                else
                {
                    dp[iter][jter] = 1 + Math.min(Math.min(dp[iter-1][jter], dp[iter][jter-1]), dp[iter-1][jter-1]);
                }
            }
        }
        return dp[len1][len2];
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
            int m = input.nextInt();
            int n = input.nextInt();
            String s1 = input.next();
            String s2 = input.next();

            EditDistance ed = new EditDistance();
            System.out.println(ed.solve(s1, s2));
        }
	}
}
