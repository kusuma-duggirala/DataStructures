package Stack;


//Time complexity -O(1) - Only 1 operation is performed in each action
public class StackImplementation 
{
	int top;
	int[] arr;
	int size;
	
	StackImplementation(int size)
	{
		top=-1;
		this.size=size;
		arr=new int[size];
	}
	
	public static void main(String[] args) 
	{
		StackImplementation si=new StackImplementation(5);
		System.out.println(si.isEmpty());
		System.out.println(si.isFull());
		si.push(100);
		si.push(400);
		si.push(123);
		si.push(456);
		si.push(798);
		si.pop();
		si.peek();
		si.pop();
		si.peek();
		si.display();
	}
	
	public boolean isEmpty()
	{
		return (top==-1);
	}
	
	public boolean isFull()
	{
		return (top==size-1);
	}
	
	public void push(int element)
	{
		if(isFull())
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top++;
			System.out.println("Top is:"+top);
			arr[top]=element;
			//arr[++top]=element;
			System.out.println("Element pushed is: "+element);
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow");
			return -1;
		}
		else
		{
			int ele=arr[top];
			top--;
			System.out.println("Top is:"+top);
			System.out.println("Element popped is: "+ele);
			return ele;
			//return arr[top--];
		}
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow");
			return -1;
		}
		else
		{
			System.out.println("Element peeked is: "+arr[top]);
			return arr[top];
		}
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
			for(int i=top;i>=0;i--)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}
}
