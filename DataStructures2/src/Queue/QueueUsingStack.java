package Queue;

import java.util.Stack;

public class QueueUsingStack 
{

	Stack<Integer> s1=new Stack();
	Stack<Integer> s2=new Stack();
	
	public static void main(String[] args) 
	{
		QueueUsingStack q=new QueueUsingStack();
		q.enqueue(5);
		q.enqueue(8);
		q.enqueue(2);
		q.peek();
		q.dequeue();
		q.printQueue();
	}
	
	public void enqueue(int data)
	{
		s1.push(data);
	}
		
	public int dequeue()
	{
		
		if(s2.isEmpty())  //This if condition is important
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
		}
		System.out.println("Element removed is: "+s2.peek());
		return s2.pop();
		
	}
	
	public int peek()
	{
		if(s2.isEmpty())   //This if condition is important
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
		}
		System.out.println("Element at the front of queue is: "+s2.peek());
		return s2.peek();
	}
	
	
	public void printQueue()
	{
		System.out.println("Stack elements: "+s2);
		
	}
}
