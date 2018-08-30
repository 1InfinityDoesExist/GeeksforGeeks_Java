{
// INITIAL CODE
import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.HashMap;
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
class Level_Order_Traversal
{


    // driver function to test the above functions
    public static void main(String args[])
    {

        // Input the number of test cases you want to run
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		//Node root=null;
        while (t > 0)
        {
            HashMap<Integer, Node> m = new HashMap<Integer, Node> ();
            int n = sc.nextInt();
            Node root=null;
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

            GfG g = new GfG();
            g.printSpiral(root);
			System.out.println();
            t--;

        }
    }
}
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*
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
*/
class GfG
{
    void printSpiral(Node node)
    {
         if(node == null)
         {
             return;
         }
         Stack<Node> st1 = new Stack<Node>();
         Stack<Node> st2 = new Stack<Node>();

         st1.push(node);
         while(!st1.isEmpty() || !st2.isEmpty())
         {
             int count1 = 0;
             ArrayList<Integer> ai1 = new ArrayList<Integer>();
        	 while(!st1.isEmpty())
        	 {
        	     count1++;
	        	 Node temp1 = st1.peek();
	             st1.pop();
	             ai1.add(temp1.data);
	             if(temp1.right != null)
	             {
	            	 st2.push(temp1.right);
	             }
	             if(temp1.left != null)
	             {
	            	 st2.push(temp1.left);
	             }
        	 }
        	 if(count1 != 0)
        	 {
        	     Iterator iter = ai1.iterator();
        	     while(iter.hasNext())
        	     {
        	         System.out.print(iter.next() + " ");
        	     }
        	 }

        	 int count2 = 0;
        	 ArrayList<Integer> ai2 = new ArrayList<Integer>();
        	 while(!st2.isEmpty())
        	 {
        	     count2++;
        		 Node temp2 = st2.peek();
        		 st2.pop();
        		 ai2.add(temp2.data);
        		 if(temp2.left != null)
        		 {
        			 st1.push(temp2.left);
        		 }
        		 if(temp2.right != null)
        		 {
        			 st1.push(temp2.right);
        		 }
        	 }
        	  if(count2 != 0)
        	 {
        	     Iterator iter = ai2.iterator();
        	     while(iter.hasNext())
        	     {
        	         System.out.print(iter.next() + " ");
        	     }
        	 }
         }
         st1.clear();
         st2.clear();
         //System.out.println();
         return;
    }
}
