import java.io.*;
import java.lang.*;
import java.util.*;

public class GFG
{
	public void firstRepeating(String str)
	{
		Map<Character, Integer> mp = new LinkedHashMap<Character, Integer>();
		for(int iter = 0; iter < str.length(); iter++)
		{
			char c = str.charAt(iter);
			Integer val = mp.get(c);
			if(val != null)
			{
				System.out.println(c);
				return;
			}
			else
			{
				mp.put(c, 1);
			}
		}
		System.out.println("-1");
		return;
	}
	public static void main(String[] args) throws Exception
	{
		GFG gfg = new GFG();
		Scanner input = new Scanner(System.in);
		int testCase = input.nextInt();
		while(testCase-- > 0)
		{
			String str = input.next();
			gfg.firstRepeating(str);
		}
	}
}
