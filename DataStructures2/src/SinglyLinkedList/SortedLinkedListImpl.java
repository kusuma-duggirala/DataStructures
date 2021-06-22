package SinglyLinkedList;

import SinglyLinkedList.ListNode;

public class SortedLinkedListImpl 
{
	ListNode head;
	
	SortedLinkedListImpl()
	{
		head=null;
	}
	
	public static void main(String[] args) 
	{
		SortedLinkedListImpl sll=new SortedLinkedListImpl();
		sll.insertElement(5);
		sll.insertElement(2);
		sll.insertElement(9);
		sll.insertElement(1);
		sll.insertElement(8);
		sll.printList();
	}
	
	public void insertElement(int data)
	{
		if(head==null||head.value>data)
		{
			ListNode node=new ListNode();
			node.value=data;
			node.next=head;
			head=node;
		}
		else
		{
			ListNode node=new ListNode();
			node.value=data;
			ListNode prevNode=head;
			while(prevNode.next!=null&&prevNode.next.value<data)
			{
				prevNode=prevNode.next;
			}
			node.next=prevNode.next;
			prevNode.next=node;
		}
	}
	
	public void insertElement2(int data)
	{
		if(head==null)
		{
			addAtStart(data);
		}
		else
		{
			ListNode temp=head;
			int index=0;
			while(temp!=null)
			{
				if(temp.value>data)
					break;
				temp=temp.next;
				index++;
			}
			System.out.println("Index value is: "+index);
			insertAtIndex(index, data);
		}
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
	
	public void printList()
	{
		ListNode temp=head;
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
			temp=temp.next;
		}
	}

}
