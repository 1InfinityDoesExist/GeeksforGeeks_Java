/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class LCSubstring
{
    public int solve(String str1, String str2)
    {
        int len1 = str1.length();
        int len2 = str2.length();
        int[][] dp = new int[len1+1][len2+1];
        int len = 0;
        for(int iter = 0; iter <= len1; iter++)
        {
            for(int jter = 0; jter <= len2; jter++)
            {
                if(iter == 0 || jter == 0)
                {
                    dp[iter][jter] = 0;
                }
                else if(str1.charAt(iter-1) == str2.charAt(jter-1))
                {
                    dp[iter][jter] = dp[iter-1][jter-1] +1;
                    len = Math.max(len, dp[iter][jter]);
                }
                else
                {
                    dp[iter][jter] = 0;
                }
            }
        }
        return len;
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
            int m = input.nextInt();
            String str1 = input.next();
            String str2 = input.next();
            LCSubstring obj = new LCSubstring();
            System.out.println(obj.solve(str1, str2));
        }
	}
}
