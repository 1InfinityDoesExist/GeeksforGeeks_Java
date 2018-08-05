{
//Initial Template for Java
import java.io.*;
import java.util.Scanner;
class Node {
    int data;
    Node next;
    Node(int d) {
        this.data = d;
        this.next = null;
    }
}
 class LinkedList{
    public static Node cur2=null;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            Node head=null;
            Node cur=null;
        int n=sc.nextInt();
        int p=sc.nextInt();
        cur=null;
        for(int i=0;i<n;i++)
        {
            int d=sc.nextInt();
            Node ptr=new Node(d);
            if(head==null)
            {
                head=ptr;
                cur=ptr;
            }
            else
            {
                cur.next=ptr;
                cur=ptr;
            }
        }
        cur2=head;
        while(p-->0)
        {
            cur2=cur2.next;
        }
        GfG g=new GfG();
        g.deleteNode(cur2);
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
        }
    }
}
//Position this line where user code will be pasted.
}

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

//User function Template for Java
class GfG{
    void deleteNode(Node node) {
        //Add your code here
        Node ptr = node.next;
        if(ptr == null)
        {
            return;
        }
        int temp = ptr.data;
        ptr.data = node.data;
        node.data = temp;
        node.next = ptr.next;
        return;
    }
}
