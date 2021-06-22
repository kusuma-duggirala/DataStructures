package DoublyLinkedList;

public class DLinkedListImpl 
{
	ListNode head;
	ListNode tail;
	
	DLinkedListImpl()
	{
		head=null;
		tail=null;
	}
	
	public static void main(String[] args) 
	{
		DLinkedListImpl dll=new DLinkedListImpl();
		dll.addAtStart(5);
		dll.addAtStart(6);
		dll.addAtEnd(7);
		dll.addAtEnd(8);
		dll.inserAtIndex(2, 9);
		dll.inserAtIndex(0, 12);
		dll.inserAtIndex(6, 15);
		dll.addAtStart(11);
		dll.addAtEnd(2);
		dll.deleteElementByIndex(0);
		dll.deleteElementByIndex(2);
		/*dll.deleteElementByKey(6);
		dll.deleteElementByKey(12);
		dll.deleteElementByKey(2);*/
		dll.printList(dll.head);
		dll.printListBack(dll.tail);
	}
	
	public void addAtStart(int data)
	{
		if(head==null)
		{
			ListNode node=new ListNode();
			node.value=data;
			node.prev=null;
			node.next=null;
			head=node;
			tail=node;
		}
		else
		{
			ListNode node=new ListNode();
			node.value=data;
			node.prev=null;
			node.next=head;
			head.prev=node;
			head=node;
		}
	}
	
	public void addAtEnd(int data)
	{
		if(head==null)
		{
			addAtStart(data);
		}
		else
		{
			ListNode node=new ListNode();
			node.value=data;
			node.next=null;
			node.prev=tail;
			tail.next=node;
			tail=node;
		}
	}
	
	public void inserAtIndex(int index,int data)
	{
		if(index<0)
		{
			System.out.println("Invalid Index");
		}
		else
		{
			if(index==0)
			{
				addAtStart(data);
			}
			else
			{
				ListNode prevNode=head;
				for(int i=0;i<index-1;i++)
				{
					prevNode=prevNode.next;
				}
				ListNode node=new ListNode();
				node.value=data;
				node.prev=prevNode;
				node.next=prevNode.next;
				prevNode.next=node;
				if(prevNode==tail)
				{
					tail=node;
				}
			}
		}
	}
	
	public void deleteElementByIndex(int index)
	{
		if(index<0)
		{
			System.out.println("Invalid index");
		}
		else
		{
			if(index==0)
			{
				head=head.next;
				head.prev=null;
			}
			else
			{
				ListNode prevNode=head;
				ListNode currNode;
				for(int i=0;i<index-1;i++)
				{
					prevNode=prevNode.next;
				}
				currNode=prevNode.next;
				prevNode.next=currNode.next;
				//prevNode.next.prev=currNode.prev;
				prevNode.next.prev=prevNode;
			}
		}
	}
	
	public void deleteElementByKey(int key)
	{
		if(key==head.value)
		{
			head=head.next;
			head.prev=null;
		}
		else
		{
			ListNode currNode = head;
			ListNode prevNode = null;
			while(currNode.value!=key)
			{
				prevNode=currNode;
				currNode=currNode.next;
			}
			prevNode.next=currNode.next;
			//prevNode.next.prev=prevNode;
			if(currNode==tail)
			{
				prevNode=tail;
			}
		}
	}
	
	public void printList(ListNode node)
	{
		ListNode temp=node;
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public void printListBack(ListNode node)
	{
		ListNode temp=node;
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			temp=temp.prev;
		}
	}

}
