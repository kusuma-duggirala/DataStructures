package CircularLinkedList;

public class CLinkedListImpl 
{
	ListNode head;
	ListNode tail;
	
	CLinkedListImpl()
	{
		head=null;
		tail=null;
	}
	
	public static void main(String[] args) 
	{
		CLinkedListImpl cll=new CLinkedListImpl();
		cll.addAtStart(5);
		cll.addAtStart(6);
		cll.addAtEnd(3);
		cll.addAtEnd(9);
		cll.insertAtIndex(3, 11);  //Inserting at specified index
		cll.insertAtIndex(0, 12);  //Inserting at beginning using index
		cll.insertAtIndex(6, 1);   //Inserting at end using index
		cll.deleteElementByIndex(0);
		cll.deleteElementByIndex(4);
		cll.deleteElementByKey(6);
		cll.addAtStart(7);
		cll.addAtEnd(8);
		cll.insertAtIndex(4, 18); 
		cll.printList(cll.head);
	}
	
	public void addAtStart(int data)
	{
		if(head==null)
		{
			ListNode node=new ListNode();
			node.value=data;
			head=node;
			tail=node;
			tail.next=head; //Optional Statement
		}
		else
		{
			ListNode node=new ListNode();
			node.value=data;
			node.next=head;
			head=node;
			tail.next=head;
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
			tail.next=node;
			tail=node;
			tail.next=head;
		}
	}
	
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
				for(int i=0;i<index-1;i++)
				{
					prevNode=prevNode.next;
				}
				if(prevNode==tail)
				{
					tail=node;
				}
				node.next=prevNode.next;
				prevNode.next=node;
				
			}
		}
	}
	
	public void deleteElementByIndex(int index)
	{
		if(index<0)
		{
			System.out.println("Invalid Index");
		}
		else
		{
			if(index==0)
			{
				
				head=head.next;
				tail.next=head;
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
				if(currNode==tail)
				{
					tail=prevNode;
				}
				prevNode.next=currNode.next;
			}
		}
	}
	
	public void deleteElementByKey(int key)
	{
		if(key==head.value)
		{
			head=head.next;
			tail.next=head;
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
			if(currNode==tail)
			{
				tail=prevNode;
			}
			prevNode.next=currNode.next;
		}
	}
	
	public void printList(ListNode head)
	{
		ListNode temp=head;
		if(head==null)
		{
			System.out.println("Linked List is empty");
		}
		else
		{
			do
			{
				System.out.print(temp.value+" ");
				temp=temp.next;
			}while(temp!=head);
		}
		
	}
}
