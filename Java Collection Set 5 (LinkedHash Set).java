{
import java.util.Scanner;
import java.util.*;
class Collections_Set_5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			LinkedHashSet<Integer> s = new LinkedHashSet<Integer>() ;
			int q = sc.nextInt();

			while(q>0)
			{
				GfG g = new GfG();
				char c = sc.next().charAt(0);
				if(c == 'a')
				{
					int x = sc.nextInt();
					g.insert(s,x);
				}
				if(c =='b')
				{
					g.print_Contents_Increasing_Order(s);
				}
				if(c == 'c')
				{
					int x = sc.nextInt();
					g.erase(s,x);
				}
				if(c == 'd')
				{
					int x = sc.nextInt();
					System.out.print(g.find(s,x)+" ");
				}
				if(c == 'e')
				{
					System.out.print(g.size(s)+" ");
				}
				if(c=='f')
				{
					g.print_Contents_Insertion_Order(s);
				}
			q--;
			//System.out.println();
			}
		t--;
		System.out.println();
		}
	}
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* You are required to complete below methods */
class GfG
{
    /*inserts an element x to the set s */
    void insert(LinkedHashSet<Integer> s, int x)
    {
	// Your code here
	    s.add(x);
    }

    /*prints the contents of the set s in ascending order */
    void print_Contents_Increasing_Order(LinkedHashSet<Integer> s)
    {
	// Your code here
	    TreeSet<Integer> name = new TreeSet<Integer>(s);
	    Iterator iter = name.iterator();
	    while(iter.hasNext())
	    {
	        System.out.print(iter.next() + " ");
	    }
    }
     /*prints the contents of the set s in ascending order */
    void print_Contents_Insertion_Order(LinkedHashSet<Integer> s)
    {
	// Your code here
	   // TreeSet<Integer> name = new TreeSet<Integer>(s);
	    Iterator iter = s.iterator();
	    while(iter.hasNext())
	    {
	        System.out.print(iter.next() + " ");
	    }

    }

    /*erases an element x from the set s */
    void erase(LinkedHashSet<Integer> s, int x)
    {
	// Your code here
	    if(s.contains(x))
	    {
	        s.remove(x);
	    }
    }

    /*returns the size of the set s */
    int size(LinkedHashSet<Integer> s)
    {
        // Your code here
        return s.size();
    }

    /*returns 1 if the element x is
    present in set s else returns -1 */
    int find(LinkedHashSet<Integer> s, int x)
    {
	// Your code here
	    if(s.contains(x))
	    {
	        return 1;
	    }
	    else
	    {
	        return -1;
	    }
    }
}
