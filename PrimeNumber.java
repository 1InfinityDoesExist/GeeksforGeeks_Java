import java.io.*;
import java.lang.*;
import java.util.*;

public class PrimeNumber
{
	public void printPrimeNumber(final int N)
	{
		ArrayList<Integer> ai = new ArrayList<Integer>();
		int sz = N+1;
		int[] dp = new int[sz];
		for(int iter = 0; iter <= N; iter++)
		{
			dp[iter] = 0;
		}
		dp[0] = dp[1] = 1;
		for(int iter = 2; iter <= N; iter++)
		{
			if(dp[iter] == 0)
			{
				ai.add(iter);
				for(int jter = 2*iter; jter <= N; jter = jter+iter)
				{
					dp[jter] = 1;
				}
			}
		}
		Iterator iter = ai.iterator();
		while(iter.hasNext())
		{
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		return;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int n = input.nextInt();
			PrimeNumber pn =new PrimeNumber();
			pn.printPrimeNumber(n);
		}
	}
}
