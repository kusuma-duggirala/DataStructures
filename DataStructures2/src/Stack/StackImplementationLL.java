package Stack;

class ListNode
{
	int value;
	ListNode next;
}

public class StackImplementationLL 
{
	ListNode top;
	
	StackImplementationLL()
	{
		top=null;
	}
	
	public static void main(String[] args)
	{
		StackImplementationLL sll=new StackImplementationLL();
		System.out.println(sll.isEmpty());
		sll.push(100);
		sll.push(400);
		sll.push(123);
		sll.push(456);
		sll.push(798);
		sll.pop();
		sll.peek();
		sll.pop();
		sll.peek();
		sll.display();
	}
	
	public boolean isEmpty()
	{
		return (top==null);
	}
	
	public void push(int data)
	{
		ListNode node=new ListNode();
		node.value=data;
		node.next=top;
		top=node;
		System.out.println("Element pushed is: "+data);
	}
	
	public void pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack Underflow");
		}
		else
		{
			System.out.println("Element popped is: "+top.value);
			top=top.next;
		}
	}
	
	public int peek()
	{
		System.out.println("Element peeked is: "+top.value);
		return top.value;
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("Stack elements:");
			ListNode temp=top;
			while(temp!=null)
			{
				System.out.print(temp.value+" ");
				temp=temp.next;
			}
		}
		System.out.println();
	}

}
