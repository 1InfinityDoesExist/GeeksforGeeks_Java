import java.io.*;
import java.util.*;
import java.lang.*;

public class PerfectSquareCheck
{
	public boolean isPerfectSquare(final int N)
	{
		double n1 = Math.sqrt(N);
		int n2 = (int)Math.sqrt(N);
		return n1 == n2;
	}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			int n = input.nextInt();
			PerfectSquareCheck pc = new PerfectSquareCheck();
			if(pc.isPerfectSquare(n))
			{
				System.out.println("yes its a perfect square");;
			}
			else
			{
				System.out.println("No its not a perfect square");
			}
		}
	}
}
