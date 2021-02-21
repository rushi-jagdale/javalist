//This is simple linked list example
public class linkedlist{
	Node head;
   public class Node{
	   int data;
	   Node next;
	   Node(int d)
	   {
		   data=d;
		   next=null;
	   }
   }
   public void  insert(int data)
   {
       
       Node n=new Node();
       n=data;
       if(head==null)
       {
	       head=n;
       }
       else
       {
	       Node n;
	       while(head!=null)
	       {
		       head=head.next;
	       }
	       head=data;
		       

   }
   }

  public static void main(String[] arg)
   {
	   linkedlist list=new linkedlist();
	   list.insert();
   }
}

