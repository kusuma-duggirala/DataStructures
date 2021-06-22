package CircularLinkedList;

public class CLinkedListDeletion 
{
	ListNode head;
	ListNode tail;
	
	CLinkedListDeletion()
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
		cli.insertAtIndex(3, 11);
		
		CLinkedListDeletion cld=new CLinkedListDeletion();
		cld.deleteElementByIndex(0);
		cli.printList(cli.head);

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
		}
	}

}
