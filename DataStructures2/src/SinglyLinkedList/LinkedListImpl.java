package SinglyLinkedList;
//Inserting/Deleting elements to linked list at beginning has different logic from inserting/deleting the elements at rest of positions
public class LinkedListImpl 
{

	ListNode head;
	
	LinkedListImpl()
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
		ll.insertInMiddle(ll.head,15);
		ll.insertInMiddle(ll.head.next,12);
		ll.insertAtIndex(0, 56);             //Inserting at beginning
		ll.insertAtIndex(3,8);				 //Inserting at specified index
		ll.insertAtIndex(7, 90);             //Inserting at end using index
		ll.deleteElementByKey(7);            //Deleting Head
		ll.deleteElementByKey(12);
		ll.deleteElementByIndex(5);
		ll.printList();
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
			
	public void deleteElementByKey(int key)
	{
		if(key==head.value)
		{
			head=head.next;
			System.out.println(key+" found and deleted");
		}
		else
		{
			ListNode currNode=head;
			ListNode prevNode=null;
			while(currNode.value!=key)
			{
				
				prevNode=currNode;
				currNode=currNode.next;
			}
			System.out.println("Previous Node value"+prevNode.value);
			System.out.println("Current Node Value"+currNode.value);
			prevNode.next=currNode.next;
		}
	}
	
	public void deleteElementByIndex(int index)
	{
		if(index<1)
		{
			System.out.println("Invalid index");
		}
		else
		{
			if(index==0)
			{
				head=head.next;
				System.out.println("Element at "+index+" index is deleted");
			}
			else
			{
				ListNode prevNode=head;
				ListNode currNode;
				System.out.println("Deleting element at index "+index);
				while(--index>0)
				{
					prevNode=prevNode.next;
				}
				currNode=prevNode.next;
				prevNode.next=currNode.next;
			}
		}
	}

	public void printList(ListNode head)
	{
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public void printList()
	{
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
		System.out.println();
	}

}
