package Queue;

class ListNode
{
	int value;
	ListNode next;
}

public class QueueImplLL 
{
	ListNode front;
	ListNode rear;
	
	QueueImplLL()
	{
		front=null;
		rear=null;
	}
	
	public static void main(String[] args) 
	{
		QueueImplLL qll=new QueueImplLL();
		System.out.println(qll.isEmpty());
		qll.enqueue(5);
		qll.enqueue(6);
		qll.enqueue(7);
		qll.dequeue();
		qll.peek();
		qll.dequeue();
		qll.dequeue();
		qll.dequeue();
		qll.enqueue(8);
		qll.peek();
		qll.printList();
		
	}
	
	public boolean isEmpty()
	{
		return (front==null);
	}
	
	public void enqueue(int data)
	{
		if(rear==null)
		{
			ListNode node=new ListNode();
			node.value=data;
			front=node;
			rear=node;
			System.out.println("Element pushed is: "+rear.value);
		}
		else
		{
			ListNode node=new ListNode();
			node.value=data;
			rear.next=node;
			rear=node;
			System.out.println("Element pushed is: "+rear.value);
		}
		
	}
	
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("Queue Underflow");
		}
		else
		{
			System.out.println("Element popped is: "+front.value);
			front=front.next;
			if(front==null)
			{
				rear=null;
			}
		}
	}
	
	public int peek()
	{
		System.out.println("Element peeked is: "+front.value);
		return front.value;
	}
	
	public void printList()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("Queue elements:");
			ListNode temp=front;
			while(temp!=null)
			{
				System.out.print(temp.value+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}

}
