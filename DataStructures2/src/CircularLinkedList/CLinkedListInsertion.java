package CircularLinkedList;

public class CLinkedListInsertion 
{
	ListNode head;
	ListNode tail;
	
	CLinkedListInsertion()
	{
		head=null;
		tail=null;
	}
	
	public static void main(String[] args) 
	{
		CLinkedListInsertion cli=new CLinkedListInsertion();
		cli.addAtStart(5);
		cli.addAtStart(6);
		cli.addAtEnd(3);
		cli.addAtEnd(9);
		cli.insertAtIndex(3, 11);  //Inserting at specified index
		cli.insertAtIndex(0, 12);  //Inserting at beginning using index
		cli.insertAtIndex(6, 1);   //Inserting at end using index
		cli.printList(cli.head);
	}
	
	public void addAtStart(int data)
	{
		if(head==null)
		{
			ListNode node=new ListNode();
			node.value=data;
			head=node;
			tail=node;
			tail.next=head;
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
	
	//No change for inserting element at specified index from SLL to CLL
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
				node.next=prevNode.next;
				prevNode.next=node;
			}
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
