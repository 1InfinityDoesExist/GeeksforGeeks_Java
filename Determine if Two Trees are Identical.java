{
// INITIAL CODE
import java.util.*;
import java.lang.*;
import java.io.*;
// A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
class Main
{
    // driver function to test the above functions
    public static void main(String args[])
    {
        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root = null;
            while (n > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);
                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
                Node parent = m.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    m.put(n1, parent);
                    if (root == null)
                        root = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                m.put(n2, child);
                n--;
            }

			//sec tree

			 HashMap<Integer, Node> mm = new HashMap<Integer, Node> ();
            int nn = sc.nextInt();
            Node roott = null;
            while (nn > 0)
            {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                char lr = sc.next().charAt(0);

                Node parent = mm.get(n1);
                if (parent == null)
                {
                    parent = new Node(n1);
                    mm.put(n1, parent);
                    if (roott == null)
                        roott = parent;
                }
                Node child = new Node(n2);
                if (lr == 'L')
                    parent.left = child;
                else
                    parent.right = child;
                mm.put(n2, child);
                nn--;
            }
            GfG g = new GfG();
            //System.out.println(g.isIdentical(root,roott));

			boolean b = g.isIdentical(root,roott);
			if(b==true)
				System.out.println(1);
			else
				System.out.println(0);
            t--;
			//System.out.println();
        }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class GfG
{
	/* Should return true if trees with roots as root1 and
   root2 are identical else false */
        boolean isIdentical(Node root1, Node root2)
	{
		 Queue<Node> q1 = new LinkedList<Node>();
    Queue<Node> q2 = new LinkedList<Node>();
    q1.add(root1);
    q2.add(root2);

    while(!q1.isEmpty() || !q2.isEmpty())
    {
        Node temp1 = q1.peek();
        q1.poll();
        Node temp2 = q2.peek();
        q2.poll();

        if(temp1 == null && temp2 == null)
        {
            continue;
        }
        if(temp1 == null || temp2 == null)
        {
            return false;
        }
        if(temp1.data != temp2.data)
        {
            return false;
        }
        q1.add(temp1.left);
        q1.add(temp1.right);
        q2.add(temp2.left);
        q2.add(temp2.right);
    }
    return true;
	}

}
