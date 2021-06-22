package SinglyLinkedList;

public class LinkedListInsertion  
{
	ListNode head;
	
	LinkedListInsertion()
	{
		head=null;
	}
	
	public static void main(String[] args) 
	{
		LinkedListImpl ll=new LinkedListImpl();
		ll.addAtStart(5);
		ll.addAtStart(7);
		ll.addAtEnd(9);
		ll.addAtEnd(11);
		ll.insertAtIndex(0, 56);             //Inserting at beginning using index
		ll.insertAtIndex(3,8);				 //Inserting at specified index
		ll.insertAtIndex(6, 90);             //Inserting at end using index
		ll.printList(ll.head);
	}
	
	public void addAtStart(int data)
	{
		if(head==null)
		{
			ListNode node=new ListNode();
			node.value=data;
			head=node;
		}
		else
		{
			ListNode node=new ListNode();
			node.value=data;
			node.next=head;                  //This line is not needed for insertion on empty linked list
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
			
			ListNode last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=node;
		}
	}
	
	public void insertInMiddle(ListNode prevNode,int data)
	{
		if(prevNode==null)
		{
			System.out.println("Previous node cannot be null");
		}
		else
		{
			ListNode node=new ListNode();
			node.value=data;
			node.next=prevNode.next;
			prevNode.next=node;
		}
		
	}
	
	//This function works for inserting element at any position in linked list	
	public void insertAtIndex(int index,int data)
	{
		if(index<0)
		{
			System.out.println("Invalid index");
		}
		else
		{
			if(index==0)
			{
				addAtStart(data);
			}
			else
			{
				ListNode node=new ListNode();
				node.value=data;
				ListNode prevNode=head;
				while(--index>0)                  //Simply loop should traverse index-1 times.
				{
					prevNode=prevNode.next;
					
				}
				node.next=prevNode.next;
				prevNode.next=node;
			}
		}
	}
}
