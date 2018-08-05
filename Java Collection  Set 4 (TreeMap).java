{
import java.util.Scanner;
import java.util.*;
class HashMap_Set4
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while(t>0)
		{
				TreeMap<Integer, Integer> hm = new TreeMap<Integer, Integer>();
				int q = sc.nextInt();

				while(q>0)
				{
					GfG g = new GfG();
					char c = sc.next().charAt(0);
					if(c=='a')
					{
						int x = sc.nextInt();
						int y = sc.nextInt();
						g.add_Value(hm,x,y);
					}
					if(c=='b')
					{
						int y = sc.nextInt();
						System.out.print(g.find_value(hm,y)+" ");
					}
					if(c=='c')
						System.out.print(g.getSize(hm)+" ");
					if(c=='d')
					{
						int x = sc.nextInt();
						g.removeKey(hm,x);
					}
					if(c=='e')
						g.sorted_By_Key(hm);
					q--;
				}
				System.out.println();
		t--;
		}
	}

}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*You are required to complete below methods */
class GfG
{
    /*Inserts an entry with key x and value y in map */
    void add_Value(TreeMap<Integer,Integer> hm, int x, int y)
    {
	//Your code here
	    hm.put(x, y);
    }

    /*Returns the value with key x from the map */
    int find_value(TreeMap<Integer, Integer> hm, int x)
    {
        //Your code here
        if(hm.containsKey(x))
        {
            return hm.get(x);
        }
        return -1;
    }

    /*Returns the size of the map */
    int getSize(TreeMap<Integer, Integer> hm)
    {
	//Your code here
	    return hm.size();
    }

    /*Removes the entry with key x from the map */
    void removeKey(TreeMap<Integer, Integer> hm, int x)
    {
	//Your code here
	    if(hm.containsKey(x))
	    {
	        hm.remove(x);
	    }
	    return;
    }
    /*print map sorted by key */
    void sorted_By_Key(TreeMap<Integer, Integer> hm)
    {
	// Your code here
	    Set<Map.Entry<Integer, Integer> > mp = hm.entrySet();
	    for(Map.Entry<Integer, Integer> iter : mp)
	    {
	        System.out.print(iter.getKey() + " ");
	    }
    }
}
