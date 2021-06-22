package Queue;

public class QueueImpl2 
{
	int front;
	int rear;
	int size;
	int[] arr;
	
	QueueImpl2(int size)
	{
		front=0;
		rear=0;
		this.size=size;
		arr=new int[size];
	}
	
	public static void main(String[] args) 
	{
		QueueImpl2 q=new QueueImpl2(5);
		System.out.println(q.isEmpty());
		System.out.println(q.isFull());
		q.dequeue();
		q.enqueue(5);
		q.enqueue(51);
		q.enqueue(52);
		q.enqueue(54);
		q.enqueue(56);
		q.enqueue(66);
		q.peek();
		q.dequeue();
		q.peek();
		q.enqueue(57);
		q.dequeue();
		q.display();
	}
	
	public boolean isEmpty()
	{
		return (front==rear);
	}
	
	public boolean isFull()
	{
		return (rear==size);
	}
	
	public void enqueue(int data)
	{
		if(isFull()) 
		{
			System.out.println("Queue Overflow");
		}
		else
		{
			arr[rear]=data;
			System.out.println("Element pushed is: "+data);
			rear++;
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
			System.out.println("Element popped is: "+arr[0]);
			for(int i=0;i<rear-1;i++)
			{
				arr[i]=arr[i+1];
			}
			rear--;
		}
	}
	
	public int peek()
	{
		System.out.println("Element peeked is: "+arr[front]);
		return arr[front];
	}
	
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("Queue elements:");
			for(int i=front;i<rear;i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
