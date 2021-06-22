package DoublyLinkedList;

import DoublyLinkedList.ListNode;

public class DLinkedListImplWOT 
{
	ListNode head;
	DLinkedListImplWOT()
	{
		head=null;
	}
	
	public static void main(String[] args) 
	{
		DLinkedListImplWOT dll=new DLinkedListImplWOT();
		dll.addAtStart(6);
		dll.addAtStart(7);
		dll.addAtEnd(5);
		dll.addAtEnd(8);
		dll.insertAtIndex(3, 2);
		dll.insertAtIndex(0, 9);
		dll.insertAtIndex(6,12);
		dll.deleteElementByIndex(0);
		//dll.deleteElementByIndex(5);
		dll.deleteElementByIndex(4);
		dll.deleteElementByKey(7);
		dll.deleteElementByKey(2);
		dll.printList();
		dll.reverseDLL();
		dll.printList();


	}
	
	public void addAtStart(int data)
	{
		ListNode node=new ListNode();
		node.value=data;
		node.next=head;
		node.prev=null;
		if(head!=null)
			head.prev=node;
		head=node;
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
			ListNode lastNode=head;
			while(lastNode.next!=null)
			{
				lastNode=lastNode.next;
			}
			lastNode.next=node;
			node.prev=lastNode;
		}
	}
	
	public void insertAtIndex(int index, int data)
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
				for(int i=0;i<index-1;i++)
				{
					prevNode=prevNode.next;
				}
				node.next=prevNode.next;
				prevNode.next=node;
				node.prev=prevNode;
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
				prevNode.next.prev=prevNode;
			}
		}
	}
	
	public void deleteElementByKey(int key)
	{
		if(head.value==key)
		{
			head=head.next;
			head.prev=null;
		}
		else
		{
			ListNode currNode=head;
			ListNode prevNode = null;
			while(currNode.value!=key)
			{
				prevNode=currNode;
				currNode=currNode.next;
			}
			prevNode.next=currNode.next;
			prevNode.next.prev=prevNode;
		}
	}
	
	public void reverseDLL()
	{
		ListNode currNode=head;
		ListNode temp = null;
		while(currNode!=null)
		{
			temp=currNode.prev;
			currNode.prev=currNode.next;
			currNode.next=temp;
			currNode=currNode.prev;
		}
		if(temp!=null)
		{
			head=temp.prev;
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
		System.out.println();
	}
	
	/*public void printListBackward()
	{
		ListNode temp=tail;
		while(temp!=null)
		{
			System.out.print(temp.value+" ");
		}
	}*/
	
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

}
